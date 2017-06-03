package problema14;


public class FactoryFixedIncomePlusComissions extends AbstractFactory {
    @Override
    public Employee createEmployee() {
        return new FixedIncomePlusComissions();
    }

    @Override
    public TemporalEmployee createTemporal() {
        return new TemporalFixedIncomePlusComissions();
    }
}
