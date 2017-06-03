package ex2primerparcial2014;

/*
Fem factory method, no solucionem el principi obert-tancat perque el tenim aqui,
 pero no importa, és la funció de la classe. Per tant el millorem.
 */
public class ControllerFactory {

    public static Visualizer createVisualizer(Resolution resolution) {
        if(resolution == Resolution.HI){
            return new Visualizer();//serien visualizers diferents
        }else if (resolution == Resolution.LOW){
            return new Visualizer();
        }else{
            return new Visualizer();
        }
    }

    public static Printer createPrinter(Resolution resolution){
        return new Printer(); //En realitat es la mateixa estructura que a dalt.
    }
}
