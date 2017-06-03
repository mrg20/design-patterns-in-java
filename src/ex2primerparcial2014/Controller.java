package ex2primerparcial2014;


import java.util.Observable;

//Trenquem el principi OBERT-TANCAT al principi
public class Controller extends Observable{//ignorar lo de observable
    private Resolution resolution;
    private Object document;

    public Controller (Resolution resolution, Document document){
        this.resolution = resolution;
        this.document = document;
    }


    public void visualize(){
        Visualizer visualizer = ControllerFactoryMethod.createVisualizer(resolution);
        visualizer.visualize(this.document);
    }

    public void print(){
        Printer printer = ControllerFactoryMethod.createPrinter(resolution);
        printer.print(this.document);
    }
}
