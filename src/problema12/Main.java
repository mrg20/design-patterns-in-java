package problema12;

public class Main {
    public static void main(String[] args) {
        NutritionFacts beverage = new NutritionFacts.Builder(240, 8)
                .calories(100)
                .sodium(35)
                .carbohydrates(27)
                .build();
        beverage.iDoNotWantIntellijToBeSadLmao();
    }
}
