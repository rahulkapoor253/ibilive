package com.example.rahulkapoor.zepplin2;

/**
 * Created by rahulkapoor on 28/04/17.
 */

public class ListItems {

    private String mUsername;
    private String mDescribe;
    private String mTime;
    private String mReviews;

    public ListItems(final String username,final String time, final String review, final String describe){
        this.mUsername = username;
        this.mDescribe = describe;
        this.mTime = time;
        this.mReviews = review;

    }

    public String getmUsername(){

        return mUsername;
    }

    public String getmTime(){

        return mTime;
    }

    public String getmDescribe(){

        return mDescribe;
    }

    public String getmReviews(){

        return mReviews;
    }


}
