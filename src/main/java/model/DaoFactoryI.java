package model;

public class DaoFactoryI {
    private static Ingredients ingredientsDao;
    private static Sodas sodasDao;
    private static Burgers burgersDao;

    //    any Bean type we have will get a method called get[Bean]Dao()
    public static Burgers getBurgersDao(){
        if(burgersDao == null){
            burgersDao = new BurgersDAO();
        }
        return burgersDao;
    }

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
