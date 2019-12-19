package com.ismael.tutorials.variables;

public class Variables {

    String name = "Ismael";

    public static void main(String [] args){
        System.out.println("Ismael Omar");

        // Primitive Data Types
        String name = "Ismael";
        int age = 24;
        boolean isMarried = false;
        double balance = 500.0;
        float wage = 500.0f;

        getName("Ismael");
    }

    public String getNameTwo(){
        String name = getName("Ismael");
        return name;
    }

    /**
     * You can call a static method in a non-static method
     * You cannot directly call a non-static method in a static method, unless that method is referenced to by an object.
     * For example the getName method in the User class is a non static method, but we call it in the static main method
     * using an object of the User class.
     * */
    // access-type data-type      Arguments
    private static String getName(String name){
        // Processing
        return name;
    }
}
