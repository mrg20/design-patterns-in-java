package ex2primerparcial2014_3Patrons;

/*
Fem factory method, no solucionem el principi obert-tancat perque el tenim aqui,
 pero no importa, és la funció de la classe. Per tant el millorem.
 */
public class ControllerFactoryMethod {//IGNORAR L'IMPLEMENTACIO DE FABRICA ABSTRACTA, NO FA FALTA.

    public static ControllerAbstractFactory createFactory(Resolution resolution) {
        if(resolution == Resolution.HI) {
            return new ControllerFactoryHi();
        }else{
            return new ControllerFactoryLow();
        }
    }

}
