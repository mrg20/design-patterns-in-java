package recuperacio2016;

import java.util.Observable;

public abstract class MachineComponent extends Observable{

    public abstract boolean isBroken();
    public abstract void setBroken();
    public abstract void repair();

}
