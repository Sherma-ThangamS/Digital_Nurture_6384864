package Code;

public class Logger{
    private static Logger logger;

    private Logger(){}

    public static Logger getLogger(){
        if(logger==null) return logger=new Logger();
        return logger;
    }

}

