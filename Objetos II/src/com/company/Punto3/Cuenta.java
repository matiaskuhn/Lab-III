package com.company.Punto3;

import java.util.UUID;

public class Cuenta {
    private UUID idCuenta;
    private float balance;
    private float saldoNegativo;
    Titular ti;
    String[] operaciones;

    public Cuenta(float balance, Titular ti, String[] operaciones) {
        this.idCuenta=UUID.randomUUID();
        this.balance=balance;
        this.saldoNegativo=2000;
        this.ti=ti;
        this.operaciones=operaciones;
    }

    public UUID getIdCuenta() {
        return idCuenta;
    }

    public float getBalance() {
        return balance;
    }

    public float getSaldoNegativo() {
        return saldoNegativo;
    }

    public int deposit(Float money, int i,String[] operaciones){
        this.balance=balance+money;
        System.out.println("Nuevo balance luego del DEPOSITO: "+getBalance());
        i=cargarArregloOperaciones(ti.getName()+" deposito "+money,operaciones,i);
        return i;
    }

    public int extract(Float pay,int i,String[] operaciones){
        if(getBalance()-pay>0){
            this.balance=balance-pay;
            System.out.println("Nuevo balance luego de la EXTRACCION: "+getBalance());
            i=cargarArregloOperaciones(ti.getName()+" retiro "+pay,operaciones,i);
        }
        else {
            if(getBalance()-pay>=-2000){
                this.saldoNegativo=-(getBalance()-pay)-2000;
                this.balance=balance-pay;
                System.out.println("Nuevo balance luego de la EXTRACCION: "+getBalance());
                System.out.println("Saldo negativo disponible luego de la EXTRACCION: "+getSaldoNegativo());
                i=cargarArregloOperaciones(ti.getName()+" retiro "+pay,operaciones,i);
            }
            else
                System.out.println("Saldo insuficiente para realizar la extraccion.");
        }
        return i;
    }

    public int cargarArregloOperaciones(String operacion,String[] operaciones,int i){
        operaciones[i]=operacion;
        i++;
        return i;
    }

    public void recorrerArreglo(String[] operaciones){
        for(int i=0;i<operaciones.length;i++) {
            System.out.println(operaciones[i]);
        }
    }

    public void mostrarCuenta(){
        System.out.println("Id cuenta: "+getIdCuenta());
        System.out.println("Balance: "+getBalance());
        System.out.println("Saldo negativo disponible: "+getSaldoNegativo());
        System.out.println("Titular: ");
        ti.mostrarTitular();
    }
}
