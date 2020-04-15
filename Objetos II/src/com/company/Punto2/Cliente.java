package com.company.Punto2;

import java.util.UUID;

public class Cliente {
    private UUID id;
    private String name;
    private String email;
    private int discount;

    public Cliente(String name,String email,int discount) {
        this.id=UUID.randomUUID();
        this.name=name;
        this.email=email;
        this.discount=discount;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getDiscount() {
        return discount;
    }

    public void mostrarCliente(){
        System.out.println("Id: "+getId());
        System.out.println("Name: "+getName());
        System.out.println("Email: "+getEmail());
        System.out.println("Discount: "+getDiscount()+"%");
    }
}
