package com.refactoring_guru.template.networks;

import java.nio.charset.StandardCharsets;

/**
 * Base class of social network.
 */
public abstract class Network {
    String username;
    String password;

    Network() {
    }

    /**
     * Publish the data to whatever network.
     */
    public boolean post(String message) {
        // Authenticate before posting. Every network uses a different
        // authentication method.
        if (login(username, password)) {
            // Send the post data.
            boolean result = sendData(message.getBytes(StandardCharsets.UTF_8));
            logout();
            return result;
        }
        return false;
    }

    public abstract boolean login(String username, String password);
    public abstract boolean sendData(byte[] data);
    public abstract void logout();
}
