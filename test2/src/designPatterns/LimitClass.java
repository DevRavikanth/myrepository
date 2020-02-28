package designPatterns;

public class LimitClass {

    private static LimitClass limInstance;
    public static int objCount = 0;

    private LimitClass(){
        objCount++;
    }

    public static synchronized LimitClass getLimInstance(){
        if(objCount < 3 ){
            limInstance = new LimitClass();
        }
        return limInstance;
    }
}
