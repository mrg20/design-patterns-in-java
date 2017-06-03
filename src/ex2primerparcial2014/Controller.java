package ex2primerparcial2014;


//Trenquem el principi OBERT-TANCAT al principi
public class Controller {
    private Resolution resolution;
    private Object document;

    public void visualize(){
        Visualizer visualizer = ControllerFactory.createVisualizer(this.resolution);
        visualizer.visualize(this.document);
    }

    public void print(){
        Printer printer = ControllerFactory.createPrinter(this.resolution);
        printer.print(this.document);
    }
}
