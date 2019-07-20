package com.picodiploma.mhabib.submission2made;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailsMovieActivity extends AppCompatActivity {
    public static final String EXTRA_MOVIE = "extra_movie";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_details_movie );

        TextView tvTitleDetails = findViewById( R.id.tv_details_title_movie );
        TextView tvRatingDetails = findViewById( R.id.tv_details_rating_movie );
        TextView tvDescDetails = findViewById( R.id.tv_details_desc_movie );
        TextView tvGenreDetails = findViewById( R.id.tv_details_genre_tvshow );
        TextView tvReleaseDate = findViewById( R.id.tv_details_release_date_movie );


        ImageView ivPoster = findViewById( R.id.iv_details_img_movie );
        Movies movie = getIntent().getParcelableExtra( EXTRA_MOVIE );

        String titleDetails = movie.getTitleMovie();
        tvTitleDetails.setText( titleDetails );
        String ratingDetails = movie.getRatingMovie();
        tvRatingDetails.setText( ratingDetails );
        String descDetails = movie.getDescMovie();
        tvDescDetails.setText( descDetails );
        String genreDetails = movie.getGenreMovie();
        tvGenreDetails.setText( genreDetails );
        String releaseDate = movie.getReleaseDateMovie();
        tvReleaseDate.setText( releaseDate );



        Glide.with(DetailsMovieActivity.this).load(movie.getImgMovie()).into( ivPoster );
    }
}
