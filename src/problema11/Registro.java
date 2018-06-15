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
/*Exemples de singleton
EAGER
public class Registro {
    public static final Registro registre = new Registro();
    
    private Registro(){
    }
    
    public void algoAFer(){}
}
PER OBTENIR L'OBJECTE DE REGISTRE FARIEM Registro reg = Registro.registre;

LAZY
public class Registro {
    private static Registro registre;		
		
    private Registro() {  ...	}
    
    public static Registro getRegistre() {
        if (registre ==	null)	
            registre = new Registro();
        return registre;	
    }	
}

*/
