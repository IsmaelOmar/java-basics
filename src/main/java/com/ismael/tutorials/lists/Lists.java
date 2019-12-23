package com.ismael.tutorials.lists;

import java.util.ArrayList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {
        String name = "Ismael";
        String lastname = "Omar";
        String job = "Dev";
        int removedCount = 0;
        List<String> names = new ArrayList<String>();
        names.add(name);
        names.add(lastname);
        names.add(job);

       // names.get(0);

//        while(true){
//
//        }

        // for loop
//        for(int counter = 0; counter < names.size(); counter++){
//            System.out.println(names.get(counter));
//        }

        List<String> alerts = new ArrayList<String>();

        for(int counter=0; counter < 100; counter++){

            alerts.add("PersonAlert");
            alerts.add("IssueDocumentAlert");
            alerts.add("BlankDocumentAlert");

        }

        // for each loop
        for(String item : names){

            if( item == "Ismael") {
                System.out.println(item);
            }
        }

        for(int index=0; index < alerts.size(); index++){
            String AlertType = alerts.get(index);
            if(AlertType.equals("PersonAlert") || AlertType.equals("IssueDocumentAlert")){
                alerts.set(index, "Removed");
            }

        }
        //For each Loop
        // You cannot use this to change the value of the item in the list
        // only read it, if you want to change it you have to use a normal for loop
        for (String alertType : alerts){

            if(alertType.equals("Removed")){
                removedCount++;
            }
        }

        System.out.println(removedCount);

        //Alert personAlert = new PersonAlert();

        //System.out.println(names.size());
    }
}
