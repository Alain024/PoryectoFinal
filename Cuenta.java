/*
* Autor: Yves Roulin
* Laboratorio 01
* */

package com.company;
import java.time.LocalDate;

public class Cuenta {
    private int         cantCuentas = 0;
    private int         numCuenta;
    private double      saldo;
    private LocalDate   fechaCreacion;
    private String      duenio;

    //Constructor de la clase Cuenta
    public Cuenta( String nombre, double monto ) {

        this.cantCuentas = 0;
        this.numCuenta   = 0;
        this.duenio      = nombre;
        this.saldo       = monto;
    }
    
    //Metodo para depositar
    public String depositar (double monto){
        this.saldo = this.saldo + monto;
        return "Tu cuenta ahora tiene: $" + this.saldo;
    }

    //Metodo para retirar
    public String retirar (double monto){
        this.saldo = this.saldo - monto;
        return "Has retirado $" + monto + " y el saldo de la cuenta es de: $" + this.saldo + "$"+"\n";
    }
    //Override sobrescribe el metodo nativo de Java toString
    @Override
    //toString es basicamente un println de todos los atributos del objeto.
    public String toString() {
        return  "*********************************************" +
                "\n Los detalles de su cuenta son los siguientes:" +
                "\n ********************************************" +
                "\n Cantidad de cuentas: " + getCantCuentas() +
                "\n Numero de la cuenta: " + getNumCuenta() +
                "\n Saldo de la cuenta: $" + getSaldo() +
                "\n Fecha de creacion: " + getFechaCreacion() +
                "\n Dueño de la cuenta: " + getDuenio() + '\'';

    }
    //Getters y Setters de los atributos del Objeto

    public int getCantCuentas() {
        return cantCuentas;
    }

    public void setCantCuentas(int cantCuentas) {
        this.cantCuentas = cantCuentas;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion.now();
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}


