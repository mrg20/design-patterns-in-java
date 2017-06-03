package problema11;


import java.util.HashMap;
import java.util.Map;

public class Registro {//Singleton juju.
    private static Map<String, Figure> workingFigures = new HashMap<>();

    public static void añadirFigura(String nombre, Figure f){
        workingFigures.put(nombre, f);
    }

    public static Figure obtenerFigura(String nombre){
        return workingFigures.get(nombre);
    }


}
