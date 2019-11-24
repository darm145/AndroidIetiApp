package com.example.taskplanner;

import com.example.taskplanner.Entities.User;
import com.example.taskplanner.Entities.Token;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface IAuthService {
    @POST("/auth")
    Call<Token> login(@Body User login);
}
