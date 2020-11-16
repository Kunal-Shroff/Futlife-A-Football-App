package com.example.futlife.LaLigateamAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class granadamain {

    private static final String url = "https://api.myjson.com/bins/17asbc/";


    public static granadamain.Granadafootball granadafootball = null;
    public static granadamain.Granadafootball getgranadateam(){

        if (granadafootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            granadafootball = retrofit.create(granadamain.Granadafootball.class);

        }

        return granadafootball;
    }

    public interface Granadafootball{


        @GET("https://api.myjson.com/bins/17asbc/")
        Call<List<granadaAPI>> getgranadaplayers();
    }
}
