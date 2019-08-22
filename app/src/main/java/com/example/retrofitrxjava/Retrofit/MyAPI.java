package com.example.retrofitrxjava.Retrofit;

import com.example.retrofitrxjava.Model.Posts;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface MyAPI {
    @GET("posts")
    Observable<List<Posts>> getPosts();
}
