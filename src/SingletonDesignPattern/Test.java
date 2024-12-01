package SingletonDesignPattern;

import sun.rmi.runtime.Log;

public class Test {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("Logger1 is logging!!");

        Logger logger2 = Logger.getInstance();
        logger2.log("Logger2 is logging !!");

        System.out.println("Whether logger1 is equals to logger2->" + (logger1==logger2));
        System.out.println("logger1->"+logger1);
        System.out.println("logger2->"+logger2);
    }

}
