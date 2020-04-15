package com.company.Punto1;

public class Autor {
    private String name;
    private String surname;
    private String email;
    private char gender;

    public Autor(String name, String surname, String email, char gender) {
        this.name=name;
        this.surname=surname;
        this.email=email;
        this.gender=gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }
}
