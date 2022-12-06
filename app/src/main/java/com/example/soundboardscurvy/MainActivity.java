package com.example.soundboardscurvy;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.MediaController;

import com.google.android.material.navigation.NavigationView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.example.soundboardscurvy.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;
    private boolean tornado = false, water = false, bum = false, waka = false, rehee = false, damn = false;
    private MediaPlayer playWaka = null, playRehee = null,playWater = null,playBum = null,playTornado = null,playDamn = null;
    private MediaController mediaController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.appBarMain.toolbar);

        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow)
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);



        ImageButton btnDamn = (ImageButton) findViewById(R.id.btnDamn);
        playDamn = MediaPlayer.create(getApplicationContext(), R.raw.damn);
        btnDamn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                playDamn.start();
            }

        });
        btnDamn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                playDamn.start();
                damn = !damn;
                playWater.setLooping(damn);
                return true;
            }
        });

        ImageButton btnWaka = (ImageButton) findViewById(R.id.btnWaka);
        playWaka = MediaPlayer.create(getApplicationContext(), R.raw.wackawackawaaa);
        btnWaka.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                playWaka.start();
            }

        });
        btnWaka.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                playWaka.start();
                waka = !waka;
                playWaka.setLooping(waka);
                return true;
            }
        });
        ImageButton btnRehee = (ImageButton) findViewById(R.id.btnRehee);
        playRehee = MediaPlayer.create(getApplicationContext(), R.raw.reehee);
        btnRehee.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                playRehee.start();
            }

        });
        btnRehee.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                playRehee.start();
                rehee = !rehee;
                playRehee.setLooping(rehee);
                return true;
            }
        });
        ImageButton btnWater = (ImageButton) findViewById(R.id.btnWater);
        playWater = MediaPlayer.create(getApplicationContext(), R.raw.water);
        btnWater.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                playWater.start();
            }
        });
        btnWater.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                playWater.start();
                water = !water;
                playWater.setLooping(water);
                return true;
            }
        });

        ImageButton btnBum = (ImageButton) findViewById(R.id.btnBum);
        playBum = MediaPlayer.create(getApplicationContext(), R.raw.bum);
        btnBum.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                playBum.start();
            }
        });
        btnBum.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                playBum.start();
                bum = !bum;
                playBum.setLooping(bum);
                return true;
            }
        });
        ImageButton btnTornado = (ImageButton) findViewById(R.id.btnTornado);
        playTornado = MediaPlayer.create(getApplicationContext(), R.raw.eltornado);
        btnTornado.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                playTornado.start();
            }
        });
        btnTornado.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                playTornado.start();
                tornado = !tornado;
                playTornado.setLooping(tornado);
                return true;
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

}