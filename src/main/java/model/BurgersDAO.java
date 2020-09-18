package model;

import java.util.ArrayList;
import java.util.List;

//This class will implement the `Burgers` interface therefore it must have all the methods defined in `Burgers`
public class BurgersDAO implements Burgers {

//    Create a temporary list, to hold the burgers as they are created
    private List<Burger> burgers = new ArrayList<>();

public  BurgersDAO (){
   // Create some burgers that contain those ingredients
    // BigMac = Patty x2, Buns x3, cheese (x1), pickles (x3)
    List<Ingredient> bigMacIngredients =  new ArrayList<>();
    bigMacIngredients.add(DaoFactoryI.getIngredientsDao().findById(5L)); //
    bigMacIngredients.add(DaoFactoryI.getIngredientsDao().findById(7L)); //
    bigMacIngredients.add(DaoFactoryI.getIngredientsDao().findById(3L)); //
    bigMacIngredients.add(DaoFactoryI.getIngredientsDao().findById(1L)); //

    Burger bigMac = new Burger("big Mac", bigMacIngredients);
    bigMac.setId(1L);
    //add it to the local array list of burgers
    burgers.add(bigMac);

    // Homestyle = Patty x1, Buns x2, pickles (x3), tomatoes (x2)

    List<Ingredient> homeStyleIngredients =  new ArrayList<>();
    homeStyleIngredients.add(DaoFactoryI.getIngredientsDao().findById(4L)); //
    homeStyleIngredients.add(DaoFactoryI.getIngredientsDao().findById(6L)); //
    homeStyleIngredients.add(DaoFactoryI.getIngredientsDao().findById(1L)); //
    homeStyleIngredients.add(DaoFactoryI.getIngredientsDao().findById(2L)); //

    Burger homeStyle = new Burger("HomeStyle", homeStyleIngredients);
    homeStyle.setId(2L);
    //add it to the local array list of burgers
    burgers.add(homeStyle);


// Quarter Pounder = Buns x2, Patty x2, Pickles (x3), Cheese (x1)
    List<Ingredient> qpIngredients =  new ArrayList<>();
    qpIngredients.add(DaoFactoryI.getIngredientsDao().findById(6L)); //
    qpIngredients.add(DaoFactoryI.getIngredientsDao().findById(5L)); //
    qpIngredients.add(DaoFactoryI.getIngredientsDao().findById(1L)); //
    qpIngredients.add(DaoFactoryI.getIngredientsDao().findById(3L)); //

    Burger quarterPounder = new Burger("quarterPounder", qpIngredients);
    quarterPounder.setId(3L);
    //add it to the local array list of burgers
    burgers.add(quarterPounder);

}
//    This method will search for a burgers by their ID and return the full Burger object
    @Override
    public Burger findById(long id) {

//we want to find the burger with the ID that's passed in as an argument to this method so to get the burger with an
// ID of 1, we need to get the element at index 0 of our `burgers` ArrayList
 // ArrayList.get(index) expects `index` to be an int , so we  have to type-caste id from a long to an int
        return  burgers.get((int)id-1);
    }

//    This method will create a Burger object in our local repo of burgers and return the newly added burger's ID
    @Override
    public long createBurger(Burger burger) {
//        the Id for each burger should be 1 indexed to get the ID of a newly created burger, we'll get the size
//        of the current `burgers` list and add 1 to it
        burger.setId(burgers.size() + 1);
//        we need to add the passed in burger object (burger) to our ArrayList
        burgers.add(burger);

//        returning newly added burger's ID as along value
        return burger.getId();
    }
}
