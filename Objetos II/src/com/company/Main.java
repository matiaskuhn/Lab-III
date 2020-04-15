package com.company;

import com.company.Punto1.Autor;
import com.company.Punto1.Libro;
import com.company.Punto2.Cliente;
import com.company.Punto2.Factura;
import com.company.Punto2.ItemVenta;
import com.company.Punto3.Cuenta;
import com.company.Punto3.Titular;

public class Main {

    public static void main(String[] args) {
        //Punto 1

        Autor au=new Autor("Joshua","Bloch","joshua@email.com",'M');
        Autor au2=new Autor("Josh", "Long", "josh@email.com", 'M');
        Autor[] autores=new Autor[2];
        autores[0]=au;
        autores[1]=au2;
        Libro li=new Libro("Effective Java",450,150,autores);
        li.mostrarLibro();


        //Punto 2
        /*
        Cliente cl=new Cliente("Matias Kuhn","matii.kuhn25@gmail.com",20);
        ItemVenta it1=new ItemVenta("Doritos","150 gr",70);
        ItemVenta it2=new ItemVenta("Coca-Cola","1,25 lt",90);
        ItemVenta[] items=new ItemVenta[2];
        items[0]=it1;
        items[1]=it2;
        Factura fa=new Factura(cl,items);
        fa.mostrarFactura();
        */

        //Punto 3
        /*
        Titular ti=new Titular("Matias Kuhn",'M');
        String[] operaciones=new String[4];
        Cuenta cu=new Cuenta(10000,ti,operaciones);
        int i=0;
        cu.mostrarCuenta();
        i=cu.deposit((float) 1000,i,operaciones);
        i=cu.extract((float) 2000,i,operaciones);
        i=cu.deposit((float) 5000,i,operaciones);
        i=cu.extract((float) 8000,i,operaciones);
        cu.recorrerArreglo(operaciones);
        */
    }
}
