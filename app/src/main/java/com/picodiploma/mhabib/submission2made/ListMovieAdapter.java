package com.picodiploma.mhabib.submission2made;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListMovieAdapter extends RecyclerView.Adapter<ListMovieAdapter.ListViewHolder> {
    private ArrayList<Movies> listMovies;
    private Context context;
    Dialog myDialog;


    public ListMovieAdapter(Context context) {
        this.context = context;
    }

    public ArrayList <Movies> getListMovies() {
        return listMovies;
    }

    public void setListMovies(ArrayList <Movies> listMovies) {
        this.listMovies = listMovies;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( context ).inflate( R.layout.item_row_movie, parent, false );
        final ListViewHolder vholder = new ListViewHolder( view );

        vholder.itemMovie.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText( context, "Test Click" + String.valueOf( vholder.getAdapterPosition() ), Toast.LENGTH_SHORT ).show();
            }
        } );
        return vholder;
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Glide.with( context )
                .load( getListMovies().get(position) .getImgMovie())
                .apply( new RequestOptions().override( 350, 550 ) )
                .into( holder.imgMovie );
        holder.tvTitleMovie.setText( getListMovies().get( position ).getTitleMovie() );
        holder.tvGenreMovie.setText( getListMovies().get(position).getGenreMovie() );
        holder.tvRatingMovie.setText( getListMovies().get( position ).getRatingMovie() );
        holder.tvDescMovie.setText( getListMovies().get( position ).getDescMovie() );
        holder.tvReleaseDate.setText( getListMovies().get( position ).getReleaseDateMovie());
    }

    @Override
    public int getItemCount() {
        return listMovies.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        RelativeLayout itemMovie;
        ImageView imgMovie;
        TextView tvTitleMovie, tvGenreMovie, tvRatingMovie, tvDescMovie, tvReleaseDate;
        public ListViewHolder(@NonNull View itemView) {
            super( itemView );
            itemMovie = itemView.findViewById( R.id.item_row_movie_id );
            imgMovie = itemView.findViewById( R.id.img_item_movie );
            tvTitleMovie = itemView.findViewById( R.id.tv_item_title_movie );
            tvGenreMovie = itemView.findViewById( R.id.tv_item_genre_movie );
            tvRatingMovie = itemView.findViewById( R.id.tv_item_rating_movie );
            tvDescMovie = itemView.findViewById( R.id.tv_item_desc_movie );
            tvReleaseDate = itemView.findViewById( R.id.tv_item_release_date );
        }
    }
}
