package model;

public class DaoFactoryI {
    private static Ingredients IngredientsDao;

    public static Ingredients getIngredientsDao(){
        if(IngredientsDao == null){
            IngredientsDao = new IngredientsDao();
        }
        return IngredientsDao;
    }
}
