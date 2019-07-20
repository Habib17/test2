package com.picodiploma.mhabib.submission2made;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Movies> listMovies = new ArrayList <>(  );
    private RecyclerView rvMovies;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;
            switch (item.getItemId()){
                case R.id.nav_movies:
                    fragment = new MoviesFragment();
                    getSupportFragmentManager().beginTransaction()
                            .replace( R.id.container_layout, fragment, fragment.getClass().getSimpleName() )
                            .commit();
                    return true;
                case R.id.nav_tv_show:
                    fragment = new TvShowFragment();
                    getSupportFragmentManager().beginTransaction()
                            .replace( R.id.container_layout, fragment, fragment.getClass().getSimpleName() )
                            .commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        listMovies.addAll( MoviesData.getListMovies() );
        BottomNavigationView navView = findViewById( R.id.nav_view );
        navView.setOnNavigationItemSelectedListener( mOnNavigationItemSelectedListener );
        if(savedInstanceState == null){
            navView.setSelectedItemId( R.id.nav_movies );
        }
//        showRecyclerList(new Fragment());


    }

//    private void showRecyclerList(Fragment fragment) {
//        Fragment fragment
//    }

}
