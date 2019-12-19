package com.ismael.tutorials.classes;

public class User {
    // Plain Old Java Object

    // CLASS VARIABLES - By Default, all class variables use the access-type 'protected' (which is a mix of private and public) if we don't declare the access-type.
    String name;

    int noOfFollowers;

    int following;

    String profile;

    // 'static' class variables are variables that are shared across all objects created using the class
    // If I create two objects using the User class, then the value of 'platform' will be the same for both
    // static class variables are called using the class name not the object name
    public static String platform = "stamp-dev";

    // SETTERS
    public void setName(String name){
        this.name = name;
    }

    public void setNoOfFollowers(int noOfFollowers){
        this.noOfFollowers = noOfFollowers;
    }

    public void setFollowing(int following) {
        this.following = following;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    // GETTERS
    public String getName() {
        return name;
    }

    public int getFollowing() {
        return following;
    }

    public int getNoOfFollowers() {
        return noOfFollowers;
    }

    public String getProfile() {
        return profile;
    }
}
