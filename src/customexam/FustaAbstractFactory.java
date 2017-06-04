package customexam;

import java.util.ArrayList;
import java.util.List;

public class FustaAbstractFactory extends AbstractFactoryEina {
    List<Materials> materials = new ArrayList<Materials>();

    public FustaAbstractFactory(List<Materials> materials){
        this.materials = materials;
    }

    @Override
    public Pic createPic() {
        return new PicFusta(materials);
    }

    @Override
    public Espasa createEspasa() {
        return new EspasaFusta(materials);
    }
}
