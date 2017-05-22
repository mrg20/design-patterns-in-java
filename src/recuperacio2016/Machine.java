package recuperacio2016;

public class Machine extends MachineComponent {
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
        if(isBroken()){
            broken = false;
            notifyObservers();
        }
    }

    @Override
    public boolean isBroken() {
        return broken;
    }
}
