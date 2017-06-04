package customexam;

import java.util.List;

/**
 * Created by noki on 4/06/17.
 */
public class PicFusta extends Pic {
    public PicFusta(List<Materials> materials) {

    }

    @Override
    public void restarDurabilitat() {

    }

    @Override
    public void utilitzar() {

    }

    @Override
    public void destruir() {

    }

    @Override
    public void accept(EinaVisitor visitor) {
        visitor.visit(this);
    }
}
