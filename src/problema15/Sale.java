package problema15;


import javax.management.AttributeList;
import java.awt.peer.ChoicePeer;

public class Sale {
    public void createSalesLineItem(ProductDescription desc, int quantity){
        SLI sli = desc.createSLI(quantity);
        AttributeList lines = new AttributeList();//Yeah i know, not correct, but the IDE will shut up
        lines.add(sli);
    }
}
