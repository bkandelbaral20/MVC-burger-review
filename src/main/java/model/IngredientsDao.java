package model;

import java.util.ArrayList;
import java.util.List;

public class IngredientsDao implements Ingredients {

    //    Create a variable storage, to hold the  all the ingredients as they are created
    private List<Ingredient> ingredients = new ArrayList<>();

    //    Create some ingredients to be used by default
    public IngredientsDao () {
        Ingredient pickles = new Ingredient();
        pickles.setId(1L);
        pickles.setIngredientName("Pickles (x3)");
        pickles.setQuantity(3);
        ingredients.add(pickles);

//        tomatoes(x2)
       Ingredient tomatoes = new Ingredient();
        tomatoes.setId(2L);
        tomatoes.setIngredientName("TOMATOES (x2)");
        tomatoes.setQuantity(2);
        ingredients.add(tomatoes);

//        cheese(x2)
        Ingredient cheese = new Ingredient();
        cheese.setId(3L);
        cheese.setIngredientName("Cheese (x1)");
        cheese.setQuantity(2);
        ingredients.add(cheese);

//        patty(x1)
        Ingredient Singlepatty = new Ingredient();
        Singlepatty.setId(4L);
        Singlepatty.setIngredientName("Singlepatty (x1)");
        Singlepatty.setQuantity(1);
        ingredients.add(Singlepatty);

       // Doublepatty(x2)
        Ingredient Doublepatty = new Ingredient();
        Doublepatty.setId(5L);
        Doublepatty.setIngredientName("Doublepatty (x2)");
        Doublepatty.setQuantity(1);
        ingredients.add(Doublepatty);

//        twoBuns(x2)
        Ingredient twoBuns = new Ingredient();
        twoBuns.setId(6L);
        twoBuns.setIngredientName("twoBuns (x2)");
        twoBuns.setQuantity(1);
        ingredients.add(twoBuns);

//        ThreeBuns(x3)
        Ingredient ThreeBuns = new Ingredient();
        ThreeBuns.setId(7L);
        ThreeBuns.setIngredientName("ThreeBuns (x3)");
        ThreeBuns.setQuantity(1);
        ingredients.add(ThreeBuns);
    }

    @Override
    public Ingredient findById(long id) {
        return  ingredients.get((int)id-1);
    }

    @Override
    public int createIn(Ingredient ingredient) {
        ingredient.setId(ingredients.size() + 1);
//        we need to add the passed in burger object (burger) to our ArrayList
        ingredients.add(ingredient);

//        returning newly added burger's ID as along value
        return (int) ingredient.getId();
    }
}
