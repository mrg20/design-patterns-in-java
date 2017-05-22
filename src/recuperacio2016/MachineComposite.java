package recuperacio2016;

import java.util.ArrayList;
import java.util.List;

public class MachineComposite extends MachineComponent {
    private List<MachineComponent> components = new ArrayList<>();
    private List<MachineComponent> brokenComponents = new ArrayList<>();
    private boolean broken = false;


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
}
