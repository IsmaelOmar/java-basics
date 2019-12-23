package com.ismael.tutorials.interfaces;

public class PersonAlert implements Alert {


    public String getAlertID(String alertID) {
        return "PersonAlert - " + 1234;
    }


    public String getAlertType() {
        return "Person";
    }

    public String getPersonName(){
        return "Ismael";
    }
}
