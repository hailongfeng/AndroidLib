package com.foxconn.androidlib.net.rxjava;

import com.foxconn.androidlib.test.http.User;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {
    @GET("users/{username}")
    Observable<User> getUser(@Path("username") String username);
}
