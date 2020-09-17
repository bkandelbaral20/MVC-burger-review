package model;

//we want this class  to represent a burger ingredient
public class Ingredient {
//    1. long id
    private long id;
// 2. string name
    private String ingredientName;
// 3. int quantity
    private int quantity;
//// TODO: Create all properties, with correct access type (public/protected/private)

    // TODO: Create a zero-argument constructor
    public Ingredient(){}

    // TODO: Create a constructor with all properties except the ID
    public Ingredient( String ingredientName, int quantity) {
        this.ingredientName = ingredientName;
        this.quantity = quantity;
    }


// TODO: Create all getters & setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
