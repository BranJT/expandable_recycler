package com.example.expandableproject;

import android.os.Parcel;
import android.os.Parcelable;

public class Nota implements Parcelable {

    public String nota;

    public Nota(String nota){
        this.nota = nota;
    }

    protected Nota(Parcel in) {
        nota = in.readString();
    }

    public static final Creator<Nota> CREATOR = new Creator<Nota>() {
        @Override
        public Nota createFromParcel(Parcel in) {
            return new Nota(in);
        }

        @Override
        public Nota[] newArray(int size) {
            return new Nota[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nota);
    }
}
