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

        /*Pega a referencia do ENDPOINT e do converter(gson)
         * */
        Retrofit retrofit = APIClient.getClient();

        //Faz o 'bind' da instância do retrofit com interface
        //que contém as operações (GET,POST,PUT,DELETE)
        PostResource postResource = retrofit.create(PostResource.class);

        //Faz a chamada do serviço
        Call<List<Post>> get = postResource.get();

        get.enqueue(new Callback<List<Post>>() {
            @Override
            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
                //Se deu certo executa este método
                List<Post> posts = response.body();
                posts.forEach(p-> Log.i  ("fasam",p.toString()));
            }

            @Override
            public void onFailure(Call<List<Post>> call, Throwable t) {
                //Houve erro é executado este método.
            }
        });

    }
}
