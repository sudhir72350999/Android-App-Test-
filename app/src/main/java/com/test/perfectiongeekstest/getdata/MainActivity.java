package com.test.perfectiongeekstest.getdata;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.test.perfectiongeekstest.R;
import com.test.perfectiongeekstest.login.Api;
import com.test.perfectiongeekstest.login.LoginActivity;
import com.test.perfectiongeekstest.login.LoginResponse;
import com.test.perfectiongeekstest.login.RetrofitClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    public static String BASE_URL = "http://54.169.128.208:8080/api/";
    private RecyclerView recyclerView;
    private ApiAdapter adapter;
    private List<Result> resultList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//
        recyclerView = findViewById(R.id.recycler);
        adapter = new ApiAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);


        fetchApiData();


    }

    private void fetchApiData() {
        // Create Retrofit instance
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        // Create the ApiService
        Api api = retrofit.create(Api.class);
//        Call<DataResponse> call = apiService.getDataByToken("yourTokenValue");
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiIyIiwiaWF0IjoxNjg2MDU0OTUwfQ.JpF5N78yPMCJfgUlsPAyeX7Q2VRJPdiMR2xAhqKeUEE";
        // Make the API request
//        Call<ApiData> call = api.getDataByToken(token);
        Call<ApiData> call = api.getApiData();
        call.enqueue(new Callback<ApiData>() {
            @Override
            public void onResponse(Call<ApiData> call, Response<ApiData> response) {
                if (response.isSuccessful()) {
                    ApiData apiData = response.body();
                    if (apiData != null && apiData.getResult() != null) {
                        resultList = apiData.getResult();
                        adapter.setResultList(resultList);

                        Toast.makeText(MainActivity.this, "successful" + response, Toast.LENGTH_SHORT).show();
                    }
                } else {
                    // Handle API error
                    Toast.makeText(MainActivity.this, "failure" + response, Toast.LENGTH_SHORT).show();
                    Log.e("api", "msg" + response);
                }
            }

            @Override
            public void onFailure(Call<ApiData> call, Throwable t) {
                Toast.makeText(MainActivity.this, "" + t.getMessage(), Toast.LENGTH_SHORT).show();
                // Handle failure
            }
        });
    }
}






