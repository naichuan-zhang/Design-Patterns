package com.refactoring_guru.chain_of_responsibility.server;

import com.refactoring_guru.chain_of_responsibility.middleware.Middleware;

import java.util.HashMap;
import java.util.Map;

/**
 * Server class.
 */
public class Server {
    private Map<String, String> users = new HashMap<>();
    private Middleware middleware;

    /**
     * Clients passes a chain of objects to server. This improves flexibility and
     * makes testing the server class easier.
     */
    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }

    /**
     * Server gets email and password for client and sends the authorization
     * request to the chain.
     */
    public boolean login(String email, String password) {
        if (middleware.check(email, password)) {
            System.out.println("Authorization have been successful!");
            // Do something useful here.
            return true;
        }
        return false;
    }

    public void register(String email, String password) {
        users.put(email, password);
    }

    public boolean hasEmail(String email) {
        return users.containsKey(email);
    }

    public boolean isValidPassword(String email, String password) {
        return users.get(email).equals(password);
    }
}
