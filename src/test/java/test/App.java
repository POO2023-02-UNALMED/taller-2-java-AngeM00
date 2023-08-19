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

    int cantidad;
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
            if (asiento.registro != this.registro){
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
