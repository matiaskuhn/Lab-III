package com.company;

public class Empleado {

    private int dni;
    private String nombre;
    private String apellido;
    private float salario;

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void anual(float s){
        System.out.println("Salario anual: "+(s*12));
    }

    public float aumento(float s,float a){
        float p=(s*a);
        s=(s+p);
        System.out.println("Salario nuevo de Carlos con 15% de aumento: "+s);
        return s;
    }

    public void mostrarEmpleado(Empleado e){
        System.out.println("Empleado[dni:"+e.getDni()+", nombre:"+e.getNombre()+", apellido:"+e.getApellido()+", salario:"+e.getSalario()+"]");
    }
}
