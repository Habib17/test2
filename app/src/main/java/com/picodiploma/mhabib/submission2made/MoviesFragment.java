package com.picodiploma.mhabib.submission2made;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MoviesFragment extends Fragment {
    private RecyclerView rvMovies;
    private ArrayList<Movies> listMovies = new ArrayList <>(  );
    public MoviesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate( R.layout.fragment_movies, container, false );
        rvMovies = v.findViewById( R.id.rv_movies );
        ListMovieAdapter listMovieAdapter = new ListMovieAdapter(getContext() );
        listMovies.addAll( MoviesData.getListMovies() );
        listMovieAdapter.setListMovies( listMovies );
        rvMovies.setLayoutManager(new LinearLayoutManager( getActivity() )  );
        rvMovies.setHasFixedSize( true );
        rvMovies.setAdapter(listMovieAdapter);
        ItemClickSupport.addTo( rvMovies ).setOnClickListener( new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                showSelectedMovie( listMovies.get( position ) );
                Intent detailsMovieIntent = new Intent( getContext(), DetailsMovieActivity.class );
                detailsMovieIntent.putExtra( DetailsMovieActivity.EXTRA_MOVIE, listMovies.get( position ) );
                startActivity( detailsMovieIntent );
            }
        } );
        return v;


    }

    //tambah item pilihan
    private void showSelectedMovie(Movies movies){
        Toast.makeText( getContext(), "Kamu memilih "+ movies.getTitleMovie(), Toast.LENGTH_SHORT ).show();

    }



//    @Override
//    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
//        super.onViewCreated( view, savedInstanceState );
//        rvMovies = view.findViewById( R.id.rv_movies );
////        rvMovies.setLayoutManager( new LinearLayoutManager(this) );
//        ListMovieAdapter listMovieAdapter = new ListMovieAdapter( listMovies );
//        rvMovies.setAdapter( listMovieAdapter );
//        rvMovies.setHasFixedSize( true );
//
//
//    }

//        @Override
//    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
//        super.onViewCreated( view, savedInstanceState );
//        rvMovies = view.findViewById( R.id.rv_movies );
//        rvMovies.setLayoutManager( new LinearLayoutManager(getContext()) );
//        ListMovieAdapter listMovieAdapter = new ListMovieAdapter( getContext() );
//        rvMovies.setAdapter( listMovieAdapter );
//        rvMovies.setHasFixedSize( true );
//
//
//    }
}
