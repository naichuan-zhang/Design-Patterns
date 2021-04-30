package com.refactoring_guru.template;

import com.refactoring_guru.template.networks.Facebook;
import com.refactoring_guru.template.networks.Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Network network = null;
        System.out.println("Input user name: ");
        String username = reader.readLine();
        System.out.println("Input password: ");
        String password = reader.readLine();

        // Enter the message.
        System.out.println("Input message: ");
        String message = reader.readLine();

        System.out.println("\nChoose social network for posting message.\n" + "1 - Facebook\n ...");
        int choice = Integer.parseInt(reader.readLine());

        // Create proper network object.
        if (choice == 1) {
            network = new Facebook(username, password);
        } else {
            // Create another network object here...
        }
        assert network != null;
        network.post(message);
    }
}
