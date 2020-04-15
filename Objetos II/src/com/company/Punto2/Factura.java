package com.company.Punto2;

import java.time.LocalDateTime;
import java.util.UUID;

public class Factura {
    private UUID idFactura;
    private LocalDateTime date;
    private float amount;
    Cliente cl;
    ItemVenta[] items;

    public float totalAmount(ItemVenta[] items){
        float total=0;
        for(int i=0;i<items.length;i++){
            total+=items[i].getUnitPrice();
        }
        return total;
    }

    public Factura(Cliente cl,ItemVenta[] items) {
        this.idFactura=UUID.randomUUID();
        this.date= LocalDateTime.now();
        this.amount=totalAmount(items);
        this.cl=cl;
        this.items=items;
    }

    public UUID getIdFactura() {
        return idFactura;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public float getAmount() {
        return amount;
    }

    public float applyDiscount(){
        return getAmount()-getAmount()*cl.getDiscount()/100;
    }

    public void recorrerArreglo(ItemVenta[] items){
        for(int i=0;i<items.length;i++){
            System.out.println("Id: "+items[i].getIdItem());
            System.out.println("Name: "+items[i].getName());
            System.out.println("Description: "+items[i].getDescription());
            System.out.println("Unit Price: "+items[i].getUnitPrice());
            if(i!=items.length)
                System.out.println("-----------------------------------------");
        }
    }

    public void mostrarFactura(){
        System.out.println("Id Factura: "+getIdFactura());
        System.out.println("Date: "+getDate());
        System.out.println("Amount: "+getAmount());
        System.out.println("Amount with discount: "+applyDiscount());
        System.out.println("Items: ");
        recorrerArreglo(items);
        System.out.println("Cliente: ");
        cl.mostrarCliente();
    }

}
