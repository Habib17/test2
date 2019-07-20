package com.picodiploma.mhabib.submission2made;

import android.os.Parcel;
import android.os.Parcelable;

public class TvShow implements Parcelable {
    private String imgTvShow;
    private String titleTvShow;
    private String genreTvShow;
    private String ratingTvShow;
    private String descTvShow;
    private String releaseDateTvShow;

    public TvShow() {
    }

    public String getImgTvShow() {
        return imgTvShow;
    }

    public void setImgTvShow(String imgTvShow) {
        this.imgTvShow = imgTvShow;
    }

    public String getTitleTvShow() {
        return titleTvShow;
    }

    public void setTitleTvShow(String titleTvShow) {
        this.titleTvShow = titleTvShow;
    }

    public String getGenreTvShow() {
        return genreTvShow;
    }

    public void setGenreTvShow(String genreTvShow) {
        this.genreTvShow = genreTvShow;
    }

    public String getRatingTvShow() {
        return ratingTvShow;
    }

    public void setRatingTvShow(String ratingTvShow) {
        this.ratingTvShow = ratingTvShow;
    }

    public String getDescTvShow() {
        return descTvShow;
    }

    public void setDescTvShow(String descTvShow) {
        this.descTvShow = descTvShow;
    }

    public String getReleaseDateTvShow() {
        return releaseDateTvShow;
    }

    public void setReleaseDateTvShow(String releaseDateTvShow) {
        this.releaseDateTvShow = releaseDateTvShow;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString( this.imgTvShow );
        dest.writeString( this.titleTvShow );
        dest.writeString( this.genreTvShow );
        dest.writeString( this.ratingTvShow );
        dest.writeString( this.descTvShow );
        dest.writeString( this.releaseDateTvShow );
    }

    protected TvShow(Parcel in) {
        this.imgTvShow = in.readString();
        this.titleTvShow = in.readString();
        this.genreTvShow = in.readString();
        this.ratingTvShow = in.readString();
        this.descTvShow = in.readString();
        this.releaseDateTvShow = in.readString();
    }

    public static final Creator <TvShow> CREATOR = new Creator <TvShow>() {
        @Override
        public TvShow createFromParcel(Parcel source) {
            return new TvShow( source );
        }

        @Override
        public TvShow[] newArray(int size) {
            return new TvShow[size];
        }
    };
}
