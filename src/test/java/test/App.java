package test;

import java.util.Arrays;

class Auto {
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;

    public Auto(String mod, int precio, Asiento[] asientos, String marca, Motor motor, int reg) {
        this.modelo = mod;
        this.precio = precio;
        this.asientos = asientos;
        this.marca = marca;
        this.motor = motor;
        this.registro = reg;
    }

    int cantidad; //variable usada
    public int cantidadAsientos() {
        for (Asiento asiento : asientos) {
            if (asiento != null){
                cantidad += 1;
            }        
        }
        return cantidad;
    }
  
    public String verificarIntegridad(){
        boolean verificar = true;
        for (Asiento asiento : asientos){
            if (asiento != null && asiento.registro != this.registro){
                verificar = false;
                break;
            }      
        }
        
        if (this.motor.registro == this.registro && verificar){
            return "Auto original";
        } else {
            return "Las piezas no son originales";
        }
    }
}

class Asiento {
    String color;
    int precio;
    int registro;

    public Asiento(String color, int precio, int registro) {
        this.color = color;
        this.precio = precio;
        this.registro = registro;
    }

    public void cambiarColor(String color){
        String[] permitidos = {"rojo", "verde", "amarillo", "negro", "blanco"};
        if(Arrays.asList(permitidos).contains(color)){
            this.color = color;
        }      
    }
}

class Motor {
    int numeroCilindros;
    String tipo;
    int registro;

    public Motor(int num, String tipo, int registro){
        this.numeroCilindros = num;
        this.tipo = tipo;
        this.registro = registro;
    }

    public void cambiarRegistro(int registro){
        this.registro = registro;
    }

    public void asignarTipo(String tipo){
        String[] posibles = {"electrico", "gasolina"};
        if(Arrays.asList(posibles).contains(tipo)){
            this.tipo = tipo;
        }
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        
    }
}
