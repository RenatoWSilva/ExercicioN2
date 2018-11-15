package com.example.aluno.exercicion2.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.aluno.exercicion2.R;
import com.example.aluno.exercicion2.client.APIClient;
import com.example.aluno.exercicion2.model.Post;
import com.example.aluno.exercicion2.resource.PostResource;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
}
