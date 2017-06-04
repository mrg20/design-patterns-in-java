package customexam;

import java.util.ArrayList;

public class ExecuteCreations {
    public static void main(String[] args) throws UnsupportedRatException {
        FustaAbstractFactory faf = (FustaAbstractFactory) new FactoriesBuilder()
                .constructDiamant()
                .setMaterials(new ArrayList<>())
                .create();
    }
}
