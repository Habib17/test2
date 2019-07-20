package com.picodiploma.mhabib.submission2made;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailsTvShowActivity extends AppCompatActivity {
    public static final  String EXTRA_TVSHOW = "extra_tvshow";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_details_tv_show );

        TextView tvTitleDetailsTvShow = findViewById( R.id.tv_details_title_tvshow );
        TextView tvGenreDetailsTvShow = findViewById( R.id.tv_details_genre_tvshow );
        TextView tvRatingDetailsTvShow = findViewById( R.id.tv_details_rating_tvshow );
        TextView tvReleaseDateDetailsTvShow = findViewById( R.id.tv_details_release_date_tvshow );
        TextView tvDescDetailTvShow = findViewById( R.id.tv_details_desc_tvshow );
        ImageView ivImgTvShow = findViewById( R.id.iv_details_img_tvshow);

        TvShow tvShow = getIntent().getParcelableExtra( EXTRA_TVSHOW );

        tvTitleDetailsTvShow.setText( tvShow.getTitleTvShow() );
        tvGenreDetailsTvShow.setText( tvShow.getGenreTvShow() );
        tvRatingDetailsTvShow.setText( tvShow.getRatingTvShow() );
        tvReleaseDateDetailsTvShow.setText( tvShow.getReleaseDateTvShow() );
        tvDescDetailTvShow.setText( tvShow.getDescTvShow() );
        Glide.with( DetailsTvShowActivity.this ).load( tvShow.getImgTvShow() ).into( ivImgTvShow );

    }



}
