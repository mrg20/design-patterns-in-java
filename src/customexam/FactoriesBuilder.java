package customexam;



import java.util.ArrayList;
import java.util.List;

public class FactoriesBuilder {
    private List<Materials> materials = new ArrayList<>();
    private boolean fusta = false;
    private boolean diamant = true;

    public FactoriesBuilder constructFusta(){
        this.fusta = true;
        return this;
    }

    public FactoriesBuilder constructDiamant(){
        this.diamant = true;
        return this;
    }

    public FactoriesBuilder setMaterials(List<Materials> materials){
        this.materials = materials;
        return this;
    }

    public FactoriesBuilder setMaterial(Materials material){
        this.materials.add(material);
        return this;
    }

    public AbstractFactoryEina create() throws UnsupportedRatException {
        if(fusta && diamant){
            throw new UnsupportedRatException();
        }else if(fusta && materialsAreCorrect()){
            return new FustaAbstractFactory(materials);
        }else if(diamant && materialsAreCorrect()){
            return new DiamantAbstractFactory(materials);
        }else{
            throw new UnsupportedRatException();
        }
    }

    private boolean materialsAreCorrect() {
        return true;//Comprovaries si els materials son els necessitats
    }

}
