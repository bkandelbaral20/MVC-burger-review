package model;

//this interface wil  define all the methods we need to access the data from our Bean

//this is the interface the DAO will implement
public interface Burgers {
    //we need a method to go find a burger by its ID
    // we want the return object to be type `Burger`

    Burger findById(long id);

    //we need a method to create a new burger  and the ID(long) once it is successfully created
     long createBurger(Burger burger);
}
