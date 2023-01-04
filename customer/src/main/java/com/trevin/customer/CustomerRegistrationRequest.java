package com.trevin.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {


}
