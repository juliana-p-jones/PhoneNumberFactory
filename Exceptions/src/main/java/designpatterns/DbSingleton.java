package designpatterns;

public class DbSingleton {
    //private instance!
    private  static DbSingleton instance = new DbSingleton();
    //private constructor with ZERO parameters!!
    private  DbSingleton(){}
    //always need a getInstance so that other classes can refer to it, since it cannot be created as new
    public static DbSingleton getInstance(){
        return instance;
    }
}
