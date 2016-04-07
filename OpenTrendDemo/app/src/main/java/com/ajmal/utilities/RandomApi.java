package com.ajmal.utilities;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by ajmal on 7/4/16.
 */
public interface RandomApi {

    @GET("api/?key=LMW0-SW97-ISC4-FF25&id=t60ldyb&results=20")
    Call<ApiResponse> getApiResponse();
}
