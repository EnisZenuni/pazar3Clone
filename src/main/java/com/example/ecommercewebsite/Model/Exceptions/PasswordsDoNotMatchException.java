package com.example.ecommercewebsite.Model.Exceptions;

public class PasswordsDoNotMatchException extends RuntimeException{

    public PasswordsDoNotMatchException() {
        super("Passwords do not match exception.");
    }
}

