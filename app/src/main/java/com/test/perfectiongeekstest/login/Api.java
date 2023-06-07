package com.test.perfectiongeekstest.login;

import com.test.perfectiongeekstest.getdata.ApiData;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface Api {

    @FormUrlEncoded
    @POST("teacher/login")
    Call<LoginResponse> login(
            @Field("email") String email,
            @Field("password") String password,
            @Field("token") String token
    );


    @GET("homework/viewHomeworkList")
    Call<ApiData> getApiData();


    @GET("teacher/login/token")
    Call<ApiData> getDataByToken(@Path("token") String token);


}
