package com.ismael.tutorials.main;

import com.ismael.tutorials.classes.User;

public class Main {

    public static void main(String[] args) {

        // All objects created from custom classes are considered Non-primitive data-types
        User user = new User();
        User user2 = new User();
        User user3 = new User();
        User user4 = new User();

        user.setName("Keith Halcrow");
        user2.setName("Cliff");

       System.out.println(user2.getName());
       System.out.println(user.getName());

        user.setName("Instagram Guy");

        System.out.println(user.getName());

        System.out.println(User.platform);

    }
}
