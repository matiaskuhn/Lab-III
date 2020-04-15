package com.company;

public class Hora {

    private int h;
    private int m;
    private int s;

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    public void mostrar(Hora x){
        if(x.getH()<10)
            System.out.print("0"+x.getH()+":");
        else
            System.out.print(x.getH()+":");

        if(x.getM()<10)
            System.out.print("0"+x.getM()+":");
        else
            System.out.print(x.getM()+":");

        if(x.getS()<10)
            System.out.print("0"+x.getS());
        else
            System.out.print(x.getS());
    }

    public Hora avanzar(Hora x){
        x.setS(x.getS()+1);
        System.out.println(" ");
        return x;
    }

    public Hora retroceder(Hora x){
        x.setS(x.getS()-1);
        System.out.println(" ");
        return x;
    }
}
