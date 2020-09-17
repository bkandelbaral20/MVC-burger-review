package model;

import java.util.ArrayList;
import java.util.List;

public class IngredientsDao implements Ingredients {

    //    Create a temporary list, to hold the ingredients as they are created
    private List<Ingredient> ingredients = new ArrayList<>();


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
