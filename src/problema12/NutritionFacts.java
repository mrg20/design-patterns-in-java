package problema12;

import java.security.cert.CertPathBuilder;

public class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    //constructors ....
    public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }

    public static class Builder{
        private int servingSize;
        private int servings;
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int calories) {
            this.calories = calories;
            return this;
        }

        public Builder sodium(int sodium) {
            this.sodium = sodium;
            return this;
        }

        public Builder carbohydrates(int carbohydrate) {
            this.carbohydrate = carbohydrate;
            return this;
        }

        public NutritionFacts build() {
            //Maybe add constructor in NutritionFacts with a parameter this(?)
            return new NutritionFacts(servingSize, servings, calories, fat, sodium, carbohydrate);
        }
    }
    public void iDoNotWantIntellijToBeSadLmao(){
        System.out.println(servings+servingSize+calories+carbohydrate+fat+sodium);
    }
}
