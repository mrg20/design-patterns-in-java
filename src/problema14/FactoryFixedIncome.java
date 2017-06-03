package problema14;

/**
 * Created by noki on 3/06/17.
 */
public class FactoryFixedIncome extends AbstractFactory {
    @Override
    public Employee createEmployee() {
        return new FixedIncome();
    }

    @Override
    public TemporalEmployee createTemporal() {
        return new TemporalFixedIncome();
    }
}
