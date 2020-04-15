package com.company;

public class Cuenta {

    private int id;
    private String nombre;
    private int balance;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int credito(int balance){
        balance=balance+2500;
        return balance;
    }

    public int debito(int balance,int descuento){
        if((balance-descuento)>0)
            balance=balance-descuento;
        else
            System.out.println("Fondos insuficientes, compra rechazada.");

        return balance;
    }

    public void mostrar(Cuenta x){
        System.out.println("Cuenta id:"+x.getId()+"  Nombre:"+x.getNombre()+"  Balance:"+x.getBalance());
    }
}
