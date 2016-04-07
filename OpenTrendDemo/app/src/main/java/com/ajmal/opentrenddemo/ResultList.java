package com.ajmal.opentrenddemo;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ajmal.utilities.ApiResponse;
import com.ajmal.utilities.RandomApi;
import com.ajmal.utilities.Result;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ajmal on 7/4/16.
 */
public class ResultList extends ListFragment {

    private List<Result> results = new ArrayList<>();

    ResultAdapter resultAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.list_fragment_content, null, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        getApiResults();

    }

    public void getApiResults(){
        final ProgressDialog loading = ProgressDialog.show(getActivity(),"Fetching Data","Please wait...",false,false);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://randomapi.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        RandomApi api = retrofit.create(RandomApi.class);

        Call<ApiResponse> resultSet = api.getApiResponse();

        resultSet.enqueue(new Callback<ApiResponse>() {
            @Override
            public void onResponse(Call<ApiResponse> call, Response<ApiResponse> response) {

                ApiResponse apiResponse = response.body();
                results = apiResponse.getResults();
                loading.dismiss();
                showResults();
            }

            @Override
            public void onFailure(Call<ApiResponse> call, Throwable t) {
                loading.dismiss();
                AlertDialog alertDialog = new AlertDialog.Builder(getActivity()).create();
                alertDialog.setTitle("Connection Error");
                alertDialog.setMessage("Please check your network connection");
                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                alertDialog.show();
            }
        });
    }

    public void showResults(){
        resultAdapter = new ResultAdapter(getActivity(),results);
        setListAdapter(resultAdapter);
    }
}
