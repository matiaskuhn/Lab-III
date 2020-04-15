package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Punto 1
        /*
        int N=5;
        double A=6;
        char c='S';
        System.out.println("N= "+N);
        System.out.println("A= "+A);
        System.out.println("N+A= "+ (N+A));
        System.out.println("N-A= "+ (N-A));
        System.out.println(c + "= "+(int)c);
        */

        //Punto 2
        /*
        int X=5;
        int Y=9;
        double M=2.6;
        double O=6;
        System.out.println("X+Y= " +(X+Y));
        System.out.println("X-Y= " +(X-Y));
        System.out.println("X/Y= " +((float)X/Y));
        System.out.println("X.Y= " +(X*Y));
        System.out.println("M+X= " +(M+X));
        System.out.println("M-O= " +(M-O));
        System.out.println("M/O= " +(M/O));
        */

        //Punto 3
        /*
        int N=20;
        System.out.println("N= " +((N+77)-3)*2);
        */

        //Punto 4
        /*
        int A=10;
        int B=20;
        int C=30;
        int D=40;
        int aux=B;
        B=C;
        C=A;
        A=D;
        D=aux;
        System.out.println("A= "+A+" B= "+B+" C= "+C+" D= "+D);
        */

        //Punto 5
        /*
        int A=4;
        if(A%2==0)
            System.out.println("El numero es par.");
        else
            System.out.println("El numero es impar.");
        */

        //Punto 6
        /*
        int A=0;
        if(A>=0)
            System.out.println("El numero es positivo.");
        else
            System.out.println("El numero es negativo.");
        */

        //Punto 8
        /*
        String nombre;
        Scanner n=new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        nombre=n.nextLine();
        System.out.println("Buenos dias, "+nombre);
        */

        //Punto 9
        /*
        int n;
        Scanner num=new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        n=num.nextInt();
        System.out.println("El numero ingresado es: "+n);
        System.out.println("Doble= "+(n*2));
        System.out.println("Triple= "+(n*3));
        */

        //Punto 10
        /*
        float temp;
        Scanner n=new Scanner(System.in);
        System.out.print("Ingrese temperatura en grados Fahrenheit: ");
        temp=n.nextFloat();
        System.out.println("La temperatura en grados Celcius es: "+((temp-32)*5/9));
        */

        //Punto 11
        /*
        float radio;
        Scanner r=new Scanner(System.in);
        System.out.print("Ingrese el radio de la circunferencia: ");
        radio=r.nextFloat();
        System.out.println("La longitud es= "+(Math.PI*radio*2));
        System.out.println("El arena es= "+(Math.PI*Math.pow(radio,2)));
         */

        //Punto 16
        /*
        int num;
        Scanner n=new Scanner(System.in);
        System.out.print("Ingrese un numero de 3 cifras: ");
        num=n.nextInt();
        String parse= String.valueOf(num);
        char[] array= parse.toCharArray();
        for(int i=0;i<array.length;i++)
            System.out.println(array[i]);
         */

        //Punto 17
        /*
        int num;
        Scanner n=new Scanner(System.in);
        System.out.print("Ingrese un numero de 5 cifras: ");
        num=n.nextInt();
        String parse= String.valueOf(num);
        char[] array= parse.toCharArray();
        for(int i=0;i<array.length;i++)
            if(i%2!=0)
                System.out.println(array[i]);
         */



    }
}