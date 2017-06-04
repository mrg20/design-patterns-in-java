package customexam;

import java.util.ArrayList;
import java.util.List;

public class DiamantAbstractFactory extends AbstractFactoryEina {
    List<Materials> materials = new ArrayList<Materials>();

    public DiamantAbstractFactory(List<Materials> materials){
        this.materials = materials;
    }

    @Override
    public Pic createPic() {
        return new PicDiamant(materials);
    }

    @Override
    public Espasa createEspasa() {
        return new EspasaDiamant(materials);
    }
}
