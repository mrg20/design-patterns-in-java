package recuperacio2016;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class MachineComposite extends MachineComponent implements Observer{
    private List<MachineComponent> components = new ArrayList<>();
    private List<MachineComponent> brokenComponents = new ArrayList<>();

    public void addComponent(MachineComponent component){
        components.add(component);
    }//registrar que observem el fill

    @Override
    public void setBroken() {
        if (!isBroken()){
            broken = true;
            notifyObservers();
        }
    }

    @Override
    public void repair() {
        if (isBroken()) {
            for (MachineComponent component : brokenComponents) {
                component.repair();
            }
            broken = true;
            notifyObservers();
        }
    }

    @Override
    public boolean isBroken() {
        updateBrokenComponents();
        return broken && brokenComponents.isEmpty();
    }

    private void updateBrokenComponents() {
        for (MachineComponent component : components) {
            if (component.isBroken()){
                brokenComponents.add(component);
            }
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        //implementar aixó
    }
}
