package com.example.demo.model;

public enum Gender
{
    Male ("Male"),
    Female ("Female"),
    Transgender ("Transgender");

    private final String gender;

    Gender(final String gender)
    {
        this.gender = gender;
    }

    public String value()
    {
        return gender;
    }
}
