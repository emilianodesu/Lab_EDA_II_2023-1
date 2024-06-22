package Ejercicios;

public class Automovil {
    private String marca;
    private int modelo;
    private float precio;

    public Automovil(String marca, int modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public Automovil(String marca, float precio) {
        this.marca = marca;
        this.precio = precio;
        modelo = 2022;
    }

    public String getMarca() {
        return marca;
    }

    public int getModelo() {
        return modelo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void ajusteInflacion(float porcentaje) {
        this.precio *= (1 + porcentaje / 100);
    }

    public void aplicarDescuento(float porcentaje) {
        this.precio *= (1 - porcentaje / 100);
    }

    @Override
    public String toString() {
        return "Automovil [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + "]";
    }
}
