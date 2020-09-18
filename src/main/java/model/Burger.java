package model;

import java.io.Serializable;
import java.util.List;

//Must implements Serializable for our Beans(main java class) when using MVC
public class Burger implements Serializable {

    // properties for bun, pickles, numPatties, Cheese
    //properties all need to be private when implementing MVC structure to our code

    private long id;
    private String burgerName;
//    private int numBuns; // 3 for big mac, etc
//    private int numPickles;
//    private int numPatties;
//    private boolean cheese; // true or

    //Segment the condiments out into their own Bean(i.e public class Ingredient)
    private List<Ingredient> ingredients;

    //there must default constructors while using MVC because java can reserve space and memory for this object
    public Burger() {}

    // constructor
    public Burger(String burgerName,List<Ingredient> ingredients ) {
        // set each of the local class properties, to the arguments passed into this constructor
        this.burgerName = burgerName;
        this.ingredients = ingredients;

    }

//    getters and setters
    public String getBurgerName() {
        return burgerName;
    }

    public void setBurgerName(String burgerName) {
        this.burgerName = burgerName;
    }


    // ctrl - enter (to get the menu where you can create getters/setters)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
//
}