package Logger;

public class MyLogger {
    private static MyLogger ourInstance = null;

    public static MyLogger getInstance() {
        if (ourInstance == null)
            ourInstance= new MyLogger();

            return ourInstance;
    }

    private MyLogger() {
    }

    public void write(String info, String type){
        System.out.println(type+"> \t"+info);
    }
}
