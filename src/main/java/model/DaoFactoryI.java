package model;

public class DaoFactoryI {
    private static Ingredients ingredientsDao;
    private static Sodas sodasDao;

    public static Ingredients getIngredientsDao(){
        if(ingredientsDao == null){
            ingredientsDao = new IngredientsDao();
        }
        return ingredientsDao;
    }
    public static Sodas getSodasDao (){
        if(sodasDao == null){
            sodasDao = new SodasDao();
        }
        return sodasDao;
    }
}
