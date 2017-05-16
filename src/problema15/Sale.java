package problema15;


public class Sale {
    public void createSalesLineItem(ProductDescription desc, int quantity){
        SLI sli = desc.createSLI(qty);
        lines.add(sli);
    }
}
