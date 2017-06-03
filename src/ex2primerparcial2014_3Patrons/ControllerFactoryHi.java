package ex2primerparcial2014;


public class ControllerFactoryHi extends ControllerAbstractFactory {
    @Override
    public Printer createPrinter() {
        return new PrinterHiRes();
    }

    @Override
    public Visualizer createVisualizer() {
        return new VisualizerHiRes();
    }
}
