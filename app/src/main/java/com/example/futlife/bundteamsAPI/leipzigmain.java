package com.example.futlife.bundteamsAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class leipzigmain {

    private static final String url = "https://api.myjson.com/bins/vvi2c/";


    public static leipzigmain.Leipzigfootball leipzigfootball = null;
    public static leipzigmain.Leipzigfootball getLeipzigfootballteam(){

        if (leipzigfootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            leipzigfootball = retrofit.create(leipzigmain.Leipzigfootball.class);

        }

        return leipzigfootball;
    }
    public interface Leipzigfootball{


        @GET("https://api.myjson.com/bins/vvi2c/")
        Call<List<leipzigAPI>> getleipzigplayers();
    }
}
