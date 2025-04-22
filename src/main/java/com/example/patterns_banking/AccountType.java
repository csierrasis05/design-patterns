package com.example.patterns_banking;

public enum AccountType {
    CORRIENTE("CUENTA CORRIENTE"),
    AHORROS("CUENTA AHORROS");

    private final String nameAccountType;
    AccountType(String accountType) {
        this.nameAccountType = accountType;
    }
    public String nameAccountType() {
        return nameAccountType;
    }
}
