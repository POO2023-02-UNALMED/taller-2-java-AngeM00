package test;
import java.util.Arrays;

public class Asiento {
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
