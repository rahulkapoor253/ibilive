package com.example.rahulkapoor.zepplin2.model;

/**
 * Created by rahulkapoor on 01/05/17.
 */

public class NetworkListItems {

    private String mName;

    /**
     *
     * @param name username
     */
    public NetworkListItems(final String name) {

        this.mName = name;

    }

    /**
     *
     * @return returns name of user;
     */
    public String getName() {

        return mName;
    }

}
