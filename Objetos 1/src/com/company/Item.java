package com.company;

public class Item {

    private int id;
    private String descripcion;
    private int cant;
    private float precioUnitario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public void precioTotal(Item i){
        System.out.println("Item id:"+i.getId()+", Descripcion:"+i.getDescripcion()+", Cantidad:"+i.getCant()+", Precio Unitario:"+i.getPrecioUnitario()+", Total:"+(i.getPrecioUnitario()*i.getCant()));
    }
}
