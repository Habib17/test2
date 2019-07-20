package com.picodiploma.mhabib.submission2made;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class ItemClickSupport {
    private final RecyclerView mRecyclerView;
    private OnItemClickListener mOnItemClickListener;
    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        if(mOnItemClickListener != null){
            RecyclerView.ViewHolder holder = mRecyclerView.getChildViewHolder( v );
            mOnItemClickListener.onItemClicked( mRecyclerView, holder.getAdapterPosition(), v );
        }
        }
    };




    public interface OnItemClickListener{
    void onItemClicked(RecyclerView recyclerView, int position, View v);
    }

    private RecyclerView.OnChildAttachStateChangeListener mAttachListener = new
            RecyclerView.OnChildAttachStateChangeListener(){

                @Override
                public void onChildViewAttachedToWindow(@NonNull View view) {
                if(mOnItemClickListener != null){
                    view.setOnClickListener( mOnClickListener );
                }
                }

                @Override
                public void onChildViewDetachedFromWindow(@NonNull View view) {

                }
            };



        private ItemClickSupport(RecyclerView recyclerView){
            mRecyclerView = recyclerView;
            mRecyclerView.setTag( R.id.item_click_support, this );
            mRecyclerView.addOnChildAttachStateChangeListener( mAttachListener );
        }


        public  static ItemClickSupport addTo(RecyclerView view){
            ItemClickSupport support = (ItemClickSupport) view.getTag(R.id.item_click_support);
            if(support == null){
                support = new ItemClickSupport(view);
            }
            return support;
        }

    public static ItemClickSupport removeFrom(RecyclerView view) {
        ItemClickSupport support = (ItemClickSupport) view.getTag( R.id.item_click_support );
        if (support != null) {
            support.detach( view );
        }
        return support;

    }



    private void detach(RecyclerView view) {
            view.removeOnChildAttachStateChangeListener( mAttachListener );
            view.setTag( R.id.item_click_support, null );
    }


    public void setOnClickListener(OnItemClickListener listener){
            mOnItemClickListener = listener;
    }



}
