import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Logger {
    protected int num = 0;
    private static Logger logger;
    public final static List<String> logList = new ArrayList<>();

    private Logger() {
    }

    public void log(String msg) {
        String sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        num++;
        logList.add("[" + sdf + " " + num + "]"+ msg);
    }

    public void printLog(List<String> list) {
        for (String s : list) {
            System.out.println(s);

        }
    }

    public static Logger getLogger() {
        if (logger == null) logger = new Logger();
        return logger;
    }

}

