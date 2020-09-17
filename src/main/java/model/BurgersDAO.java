package model;

import java.util.ArrayList;
import java.util.List;

//This class will implement the `Burgers` interface therefore it must have all the methods defined in `Burgers`
public class BurgersDAO implements Burgers {

//    Create a temporary list, to hold the burgers as they are created
    private List<Burger> burgers = new ArrayList<>();

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
