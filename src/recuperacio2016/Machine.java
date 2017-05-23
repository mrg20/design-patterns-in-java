package recuperacio2016;

public class Machine extends MachineComponent {

    @Override
    public void setBroken() {
        if (!isBroken()){
            broken = true;
            setChanged();
            notifyObservers();
        }
    }

    @Override
    public void repair() {
        if(isBroken()){
            broken = false;
            setChanged();
            notifyObservers();
        }
    }

    @Override
    public boolean isBroken() {
        return broken;
    }
}
