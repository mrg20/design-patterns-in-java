package problema15;

/**
 * Created by noki on 15/05/17.
 */
public class ProductDescription {
    enum ProductType{
        T42, NORMAL, FP;
    }

    /*Without using the static part.*/
    public SLI createSLI(int qty){
        return new SLINormal(this, qty);
    }

}
