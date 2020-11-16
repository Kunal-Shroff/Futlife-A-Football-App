package com.example.futlife;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.futlife.Livescore.*;
import com.example.futlife.MainFragments.*;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.GoogleAuthProvider;

import java.util.ArrayList;
import java.util.Arrays;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements GoogleApiClient.OnConnectionFailedListener {
    private DrawerLayout drawer;
    private RecyclerView recyclerView;
    private ArrayList<AndroidVersionConstruct> data;
    private DataAdapter adapter;
    private GoogleApiClient googleApiClient;
    private GoogleSignInOptions gso;
    TextView name, email;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();

        googleApiClient = new GoogleApiClient.Builder(this)
                .enableAutoManage(this, this)
                .addApi(Auth.GOOGLE_SIGN_IN_API, gso)
                .build();


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources()
                .getColor(R.color.PLTabLayout)));


        drawer = findViewById(R.id.navigation);

        NavigationView navigationView = findViewById(R.id.nav_view);

        View navHeaderView = navigationView.getHeaderView(0);

        name = navHeaderView.findViewById(R.id.textviewName);
        email = navHeaderView.findViewById(R.id.textviewEmail);


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {

                    case R.id.nav_awards:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,

                                new AwardFragment()).addToBackStack(null).commit();

                        break;

                    case R.id.nav_nations:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,

                                new NationFragment()).addToBackStack(null).commit();

                        break;
                    case R.id.nav_pl:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,

                                new PremierLeagueFragment()).addToBackStack(null).commit();


                        break;
                    case R.id.nav_LL:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,

                                new LaLigaFragment()).addToBackStack(null).commit();

                        break;
                    case R.id.nav_sa:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,

                                new SerieaFragment()).addToBackStack(null).commit();

                        break;

                    case R.id.nav_l1:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,

                                new Ligue1Fragment()).addToBackStack(null).commit();

                        break;

                    case R.id.nav_bl:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,

                                new BundesligaFragment()).addToBackStack(null).commit();

                        break;

                    case R.id.nav_cl:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,

                                new CLFragment()).addToBackStack(null).commit();

                        break;

                    case R.id.nav_el:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,

                                new ELFragment()).addToBackStack(null).commit();

                        break;


                }


                drawer.closeDrawer(GravityCompat.START);
                return true;
            }
        });

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.naigation_drawer_open, R.string.naigation_drawer_close);

        drawer.addDrawerListener(toggle);
        toggle.syncState();


        initViews();
    }


    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.toolbarmenu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.logout_button) {
            Logout();
            return true;


        }


        return super.onOptionsItemSelected(item);
    }

    private void initViews() {
        recyclerView = (RecyclerView) findViewById(R.id.card_recycler_view);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        loadJSON();
    }

    private void loadJSON() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://allsportsapi.com/api/football/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        RequestInterface request = retrofit.create(RequestInterface.class);
        Call<JSONResponse> call = request.getJSON();
        call.enqueue(new Callback<JSONResponse>() {
            @Override
            public void onResponse(Call<JSONResponse> call, Response<JSONResponse> response) {

                JSONResponse jsonResponse = response.body();




                    data = new ArrayList<>(Arrays.asList(jsonResponse.getAndroid()));
                if (data==null){
                    TextView textView = findViewById(R.id.nomatch);
                    textView.setText("No Live Matches");

                }else {
                    adapter = new DataAdapter(data);
                    recyclerView.setAdapter(adapter);


                }


            }

            @Override
            public void onFailure(Call<JSONResponse> call, Throwable t) {
                Log.d("Error", t.getMessage());
            }
        });
    }

    public void Logout() {


        FirebaseAuth.getInstance().signOut();
        Auth.GoogleSignInApi.signOut(googleApiClient).setResultCallback(
                new ResultCallback<Status>() {
                    @Override
                    public void onResult(Status status) {
                        if (status.isSuccess()) {
                            gotoMainActivity();
                        } else {
                            Toast.makeText(getApplicationContext(), "Session not close", Toast.LENGTH_LONG).show();
                        }

                    }

                });


    }

    @Override
    protected void onStart() {
        super.onStart();
        OptionalPendingResult<GoogleSignInResult> opr = Auth.GoogleSignInApi.silentSignIn(googleApiClient);
        if (opr.isDone()) {
            GoogleSignInResult result = opr.get();
            handleSignInResult(result);
        } else {
            opr.setResultCallback(new ResultCallback<GoogleSignInResult>() {
                @Override
                public void onResult(@NonNull GoogleSignInResult googleSignInResult) {
                    handleSignInResult(googleSignInResult);
                }
            });
        }
    }

    private void handleSignInResult(GoogleSignInResult result) {
        if (result.isSuccess()) {
            GoogleSignInAccount account = result.getSignInAccount();
            name.setText(account.getDisplayName());
            email.setText(account.getEmail());


        } else {
            gotoMainActivity();
        }
    }

    private void gotoMainActivity() {
        Intent intent = new Intent(this, LoginActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();
    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {

    }

}
