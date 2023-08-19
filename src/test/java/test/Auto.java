package test;

public class Auto {
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
