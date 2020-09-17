package model;
//This DAO factories class is used as a window into every Bean type we create.
//this class has a magic Claaw for each Bean type
class DaoFactory {

//    we do not want to require accessing the BurgersDAO directly, instead we will reference its interface
    private static Burgers burgersDao;

//    any Bean type we have will get a method called get[Bean]Dao()
    public static Burgers getBurgersDao(){
        if(burgersDao == null){
            burgersDao = new BurgersDAO();
        }
        return burgersDao;
    }
}
