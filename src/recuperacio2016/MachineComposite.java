package recuperacio2016;

import java.util.ArrayList;
import java.util.List;

public class MachineComposite extends MachineComponent {
    private List<MachineComponent> components = new ArrayList<>();
    private List<MachineComponent> brokenComponents = new ArrayList<>();
    private boolean broken = false;


    @Override
    public boolean isBroken() {
        return broken;
    }

    @Override
    public void setBroken() {
    }

    @Override
    public void repair() {
    }
}
