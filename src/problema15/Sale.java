package problema15;


import java.awt.peer.ChoicePeer;

public class Sale {
    public void createSalesLineItem(ProductDescription desc, int quantity){
        SLI sli = desc.createSLI(quantity);
        lines.add(sli);
    }
}
