package recuperacio2016;

public class Machine extends MachineComponent {
    private boolean broken = false;

    @Override
    public boolean isBroken() {
        return broken;
    }

    @Override
    public void setBroken() {
        if (!broken){
            broken = true;
            notifyObservers();
        }
    }

    @Override
    public void repair() {
        if(broken){
            broken = false;
            notifyObservers();
        }
    }
}
