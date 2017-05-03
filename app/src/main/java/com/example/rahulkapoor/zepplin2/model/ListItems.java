package com.example.rahulkapoor.zepplin2.model;

/**
 * Created by rahulkapoor on 28/04/17.
 */

public class ListItems {

    private String mUsername;
    private String mDescribe;
    private String mTime;
    private String mReviews;
    private String mLocation;

    /**
     *
     * @param username username
     * @param time time
     * @param review reviews
     * @param describe description
     */
    public ListItems(final String username, final String time, final String review, final String describe) {
        this.mUsername = username;
        this.mDescribe = describe;
        this.mTime = time;
        this.mReviews = review;

    }

    /**
     *
     * @param username username
     * @param time time
     * @param describe description
     */
    public ListItems(final String username, final String time, final String describe) {
        this.mUsername = username;
        this.mDescribe = describe;
        this.mTime = time;

    }

    /**
     *
     * @return return username
     */
    public String getmUsername() {

        return mUsername;
    }

    /**
     *
     * @return return time
     */
    public String getmTime() {

        return mTime;
    }

    /**
     *
     * @return description
     */
    public String getmDescribe() {

        return mDescribe;
    }

    /**
     *
     * @return reviews;
     */
    public String getmReviews() {

        return mReviews;
    }


}
