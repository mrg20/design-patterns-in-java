package ex2primerparcial2014;


/*
Fem factory method, no solucionem el principi obert-tancat perque el tenim aqui,
 pero no importa, la funció del factory method és només crear. Per tant el millorem.
 */
public class ControllerFactoryMethod {

    public static Visualizer createVisualizer(Resolution resolution) {
        if(resolution == Resolution.HI) {
            return new VisualizerHiRes();
        }else{
            return new VisualizerLowRes();
        }
    }

    public static Printer createPrinter(Resolution resolution) {
        if (resolution == Resolution.HI) {
            return new PrinterHiRes();
        } else {
            return new PrinterLowRes();
        }
    }
}
