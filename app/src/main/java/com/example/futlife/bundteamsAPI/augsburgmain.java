package com.example.futlife.bundteamsAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class augsburgmain {

    private static final String url = "https://api.myjson.com/bins/dcx5g/";


    public static augsburgmain.Augsburgfootball augsburgfootball = null;
    public static augsburgmain.Augsburgfootball getAugsburgfootballteam(){

        if (augsburgfootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            augsburgfootball = retrofit.create(augsburgmain.Augsburgfootball.class);

        }

        return augsburgfootball;
    }
    public interface Augsburgfootball{


        @GET("https://api.myjson.com/bins/dcx5g/")
        Call<List<augsburgAPI>> getaugsburgplayers();
    }
}
