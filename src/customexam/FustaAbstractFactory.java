package customexam;

/**
 * Created by noki on 4/06/17.
 */
public class FustaAbstractFactory extends AbstractFactoryEina {
    @Override
    public Pic createPic() {
        return new PicFusta();
    }

    @Override
    public Espasa createEspasa() {
        return new EspasaFusta();
    }
}
