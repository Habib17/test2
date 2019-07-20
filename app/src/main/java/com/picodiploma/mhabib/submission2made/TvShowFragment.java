package com.picodiploma.mhabib.submission2made;


import android.content.Intent;
import android.os.Bundle;
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
public class TvShowFragment extends Fragment {
    private RecyclerView rvTvShow;
    private ArrayList <TvShow> listTvShow = new ArrayList <>(  );

    public TvShowFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate( R.layout.fragment_tv_show, container, false );
        rvTvShow = view.findViewById( R.id.rv_tv_show );
        GridTvShowAdapter gridTvShowAdapter =  new GridTvShowAdapter( getContext() );
        listTvShow.addAll( TvShowData.getListTvShow() );
        gridTvShowAdapter.setListTvShow( listTvShow );
        rvTvShow.setLayoutManager( new LinearLayoutManager( getActivity() ) );
        rvTvShow.setHasFixedSize( true );
        rvTvShow.setAdapter( gridTvShowAdapter );
        ItemClickSupport.addTo( rvTvShow ).setOnClickListener( new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                showSelectedMovie( listTvShow.get( position ) );
                Intent detailsTvShowIntent = new Intent( getContext(), DetailsTvShowActivity.class );
                detailsTvShowIntent.putExtra( DetailsTvShowActivity.EXTRA_TVSHOW, listTvShow.get( position ) );
                startActivity( detailsTvShowIntent );
            }
        });
        return view;



    }


    private void showSelectedMovie(TvShow tvShow){
        Toast.makeText( getContext(), "Kamu memilih "+ tvShow.getTitleTvShow(), Toast.LENGTH_SHORT ).show();

    }
}
