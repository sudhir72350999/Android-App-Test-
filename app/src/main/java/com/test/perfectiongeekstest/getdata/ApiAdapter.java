package com.test.perfectiongeekstest.getdata;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.test.perfectiongeekstest.R;

import java.util.List;

public class ApiAdapter extends RecyclerView.Adapter<ApiAdapter.ViewHolder> {
    List<Result> resultList;


    public void setResultList(List<Result> resultList) {
        this.resultList = resultList;
    }


    @NonNull
    @Override
    public ApiAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ApiAdapter.ViewHolder holder, int position) {


        Result myData = resultList.get(position);
        holder.submissionDate.setText(myData.getSubmissionDate());
        holder.editTextDescription.setText(myData.getDescription());
        holder.editTextChapter.setText(myData.getSyllabus().get(1).getChapterName());
        holder.editTextSubject.setText(myData.getSyllabus().get(2).getTopic().get(0));
    }

    @Override
    public int getItemCount() {
        return resultList != null ? resultList.size() : 0;

    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView submissionDate;
        private EditText editTextSubject, editTextChapter, editTextDescription;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            submissionDate = itemView.findViewById(R.id.submissionDate);
            editTextSubject = itemView.findViewById(R.id.editTextSubject);
            editTextChapter = itemView.findViewById(R.id.editextChapter);
            editTextDescription = itemView.findViewById(R.id.edittextDescription);

        }
    }
}
