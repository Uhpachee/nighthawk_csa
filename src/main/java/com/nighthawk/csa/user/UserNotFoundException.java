package com.nighthawk.csa.user;

public class UserNotFoundException extends Throwable {
    public UserNotFoundException(String message)
    {
        super(message);
    }
}
