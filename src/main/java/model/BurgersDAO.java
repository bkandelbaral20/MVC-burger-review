package model;

import java.util.List;

//This class will implement the `Burgers` interface therefore it must have all the methods defined in `Burgers`
public class BurgersDAO implements Burgers {

//    Create a temporary list, to hold the burgers as they are created
    private List<>

//    This method will search for a burgers by their ID and return the full Burger object
    @Override
    public Burger findById(long id) {
//
        return null;
    }

//    This method will create a Burger object in our local repo of burgers and return the newly added burger's ID
    @Override
    public long createBurger(Burger burger) {
//        the Id for each burger should be 1 indexed to get the ID of a newly created burger, we'll get the size
//        of the current `burgers` list and add 1 to it

        return 0;
    }
}
