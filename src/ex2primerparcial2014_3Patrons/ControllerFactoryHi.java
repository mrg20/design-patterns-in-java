package ex2primerparcial2014_3Patrons;

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
