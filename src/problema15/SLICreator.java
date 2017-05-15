package problema15;

public class SLICreator {
    public static SLI createSLI(ProductDescription desc) {
        if(containsTwoForThreeDiscount(desc)){
            return new SLITwoForThree();
        }else if(containsSecondCostsHalf(desc)){
            return new SLISecondCostsHalf();
        }else{
            return new SLINormal();
        }
    }

    private static boolean containsTwoForThreeDiscount(ProductDescription desc) {
        return false;/*not implemented*/
    }

    private static boolean containsSecondCostsHalf(ProductDescription desc) {
        return false;/*not implemented*/
    }
}
