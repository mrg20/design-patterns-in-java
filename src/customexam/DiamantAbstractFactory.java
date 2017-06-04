package customexam;

/**
 * Created by noki on 4/06/17.
 */
public class DiamantAbstractFactory extends AbstractFactoryEina {
    @Override
    public Pic createPic() {
        return new PicDiamant();
    }

    @Override
    public Espasa createEspasa() {
        return new EspasaDiamant();
    }
}
