package com.ismael.tutorials.interfaces;

public class IssuedDocumentAlert implements Alert {


    public String getAlertID(String alertID) {
        return "IssueDocument - " + 1234;
    }


    public String getAlertType() {
        return "IssueDocument";
    }
}
