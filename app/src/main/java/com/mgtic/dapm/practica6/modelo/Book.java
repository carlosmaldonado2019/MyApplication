package com.mgtic.dapm.practica6.modelo;

import android.os.Parcel;
import android.os.Parcelable;

public class Book implements Parcelable {

    private String title;
    private String author;
    private String infoUrl;
    private String imageUrl;
    private String publisher;

    public Book(String title, String author, String infoUrl, String imageUrl, String publisher){
        this.title = title;
        this.author = author;
        this.infoUrl = infoUrl;
        this.imageUrl = imageUrl;
        this.publisher = publisher;
    }

    private Book(Parcel in) {
        title = in.readString();
        author = in.readString();
        infoUrl = in.readString();
        imageUrl = in.readString();
        publisher = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Parcelable.Creator<Book> CREATOR = new Parcelable.Creator<Book>() {
        @Override
        public Book createFromParcel(Parcel in) {
            return new Book(in);
        }

        @Override
        public Book[] newArray(int size) {
            return new Book[size];
        }
    };


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getInfoUrl() {
        return infoUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getPublisher() {
        return publisher;
    }


    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(title);
        parcel.writeString(author);
        parcel.writeString(infoUrl);
        parcel.writeString(imageUrl);
        parcel.writeString(publisher);
    }
}
