package com.example.aluno.exercicion2.resource;

import com.example.aluno.exercicion2.model.Post;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PostResource {

    @GET("/posts")
    Call<List<Post>> get();

    @GET("/posts/{id}")
    Call<List<Post>> get(Integer id);
}