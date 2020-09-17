package model;

public interface Ingredients {

// want a storage variable to hold all the ingredients

// want a method to find an ingredient by its ID
Ingredient findById(long id);

// method to add an ingredient to our list/cupboard/aresenal/repository
int createIn(Ingredient ingredient);
}
