package com.company.Punto1;

public class Libro {
    private String title;
    private float price;
    private int stock;
    Autor[] autores;

    public Libro(String title, float price, int stock, Autor[] autores) {
        this.title=title;
        this.price=price;
        this.stock=stock;
        this.autores=autores;
    }

    public String getTitle() {
        return title;
    }

    public float getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void recorrerArreglo(Autor[] autores){
        for(int i=0;i<autores.length;i++){
            System.out.println("Name: "+autores[i].getName());
            System.out.println("Surname: "+autores[i].getSurname());
            System.out.println("Email: "+autores[i].getEmail());
            System.out.println("Gender: "+autores[i].getGender());
            System.out.println("-------------------------");
        }
    }

    public void mostrarLibro(){
        System.out.println("Title: "+title);
        System.out.println("Price: "+price);
        System.out.println("Stock: "+stock);
        System.out.println("Autor/es: ");
        recorrerArreglo(autores);
    }


}
