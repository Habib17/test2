package com.picodiploma.mhabib.submission2made;

import android.os.Parcel;
import android.os.Parcelable;

public class Movies implements Parcelable {
    private String imgMovie;
    private String titleMovie;
    private String genreMovie;
    private String ratingMovie;
    private String descMovie;
    private String releaseDateMovie;

    public String getImgMovie() {
        return imgMovie;
    }

    public void setImgMovie(String imgMovie) {
        this.imgMovie = imgMovie;
    }

    public String getTitleMovie() {
        return titleMovie;
    }

    public void setTitleMovie(String titleMovie) {
        this.titleMovie = titleMovie;
    }

    public String getGenreMovie() {
        return genreMovie;
    }

    public void setGenreMovie(String genreMovie) {
        this.genreMovie = genreMovie;
    }

    public String getRatingMovie() {
        return ratingMovie;
    }

    public void setRatingMovie(String ratingMovie) {
        this.ratingMovie = ratingMovie;
    }

    public String getDescMovie() {
        return descMovie;
    }

    public void setDescMovie(String descMovie) {
        this.descMovie = descMovie;
    }

    public String getReleaseDateMovie() {
        return releaseDateMovie;
    }

    public void setReleaseDateMovie(String releaseDateMovie) {
        this.releaseDateMovie = releaseDateMovie;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString( this.imgMovie );
        dest.writeString( this.titleMovie );
        dest.writeString( this.genreMovie );
        dest.writeString( this.ratingMovie );
        dest.writeString( this.descMovie );
        dest.writeString( this.releaseDateMovie );
    }

    public Movies() {
    }

    protected Movies(Parcel in) {
        this.imgMovie = in.readString();
        this.titleMovie = in.readString();
        this.genreMovie = in.readString();
        this.ratingMovie = in.readString();
        this.descMovie = in.readString();
        this.releaseDateMovie = in.readString();
    }

    public static final Creator <Movies> CREATOR = new Creator <Movies>() {
        @Override
        public Movies createFromParcel(Parcel source) {
            return new Movies( source );
        }

        @Override
        public Movies[] newArray(int size) {
            return new Movies[size];
        }
    };
}
