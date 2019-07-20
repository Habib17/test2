package com.picodiploma.mhabib.submission2made;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class GridTvShowAdapter  extends RecyclerView.Adapter<GridTvShowAdapter.GridViewHolder> {
    private Context mContext;
    private ArrayList<TvShow> listTvShow;

    public GridTvShowAdapter(Context mContext) {
        this.mContext = mContext;
    }

    public ArrayList <TvShow> getListTvShow() {
        return listTvShow;
    }

    public void setListTvShow(ArrayList <TvShow> listTvShow) {
        this.listTvShow = listTvShow;
    }

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from( mContext ).inflate( R.layout.item_row_tv_show, parent, false);
        final  GridViewHolder vHolder =  new GridViewHolder( view );
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull GridViewHolder holder, int position) {
        Glide.with( mContext ).load( getListTvShow() .get( position ).getImgTvShow())
                .apply( new RequestOptions().override( 350, 550 ) )
                .into(holder.imgTvShow);
        holder.tvTitleTvShow.setText( getListTvShow().get( position ).getTitleTvShow() );
        holder.tvGenreTvShow.setText( getListTvShow().get( position ).getGenreTvShow() );
        holder.tvRatingTvShow.setText( getListTvShow().get( position ).getRatingTvShow() );
        holder.tvDescTvShow.setText( getListTvShow().get( position ).getDescTvShow() );
        holder.tvReleaseTvShow.setText( getListTvShow().get( position ).getReleaseDateTvShow() );
    }

    @Override
    public int getItemCount() {
        return listTvShow.size();
    }

    public class GridViewHolder extends RecyclerView.ViewHolder {
        LinearLayout itemTvShow;
        ImageView imgTvShow;
        TextView tvTitleTvShow, tvGenreTvShow, tvRatingTvShow, tvDescTvShow, tvReleaseTvShow;
        public GridViewHolder(@NonNull View itemView) {
            super( itemView );
            itemTvShow = itemView.findViewById( R.id.item_row_tvshow_id );
            imgTvShow = itemView.findViewById( R.id.img_item_tvshow );
            tvTitleTvShow = itemView.findViewById( R.id.tv_item_title_tvshow );
            tvGenreTvShow = itemView.findViewById( R.id.tv_item_genre_tvshow);
            tvRatingTvShow = itemView.findViewById( R.id.tv_item_rating_tvshow );
            tvDescTvShow = itemView.findViewById( R.id.tv_item_desc_tvshow );
            tvReleaseTvShow = itemView.findViewById( R.id.tv_item_release_date_tvshow );
        }
    }
}
