package ch05;
import java.io.IOException;
import java.nio.file.LinkOption;
import java.time.LocalDateTime;
import java.util.logging.*;

public class Test16 {
    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getGlobal();
        logger.setUseParentHandlers(false);
        Handler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);

        //ls ~ 能看到java0.log的文件,里面就是日志

        logger.addHandler(handler);
        logger.setLevel(Level.ALL);
        Filter filter = new Filter() {
            @Override
            public boolean isLoggable(LogRecord record) {
//                if (record.getMessage().length()<6)
//                    return false;
//                    else
//                        return true;
                return record.getMessage().length() < 6 ? false : true;
            }
        };
        logger.setFilter(filter);

        Formatter formatter = new Formatter() {
            @Override
            public String format(LogRecord record) {
                return LocalDateTime.now().toString() +": " + record.getMessage()+";\n";
            }
        };
        handler.setFormatter(formatter);





        Logger.getGlobal().severe("severe");
        Logger.getGlobal().warning("warning");
        Logger.getGlobal().info("info");
        Logger.getGlobal().config("config");
        Logger.getGlobal().fine("fine");
        Logger.getGlobal().finer("finer");
        Logger.getGlobal().finest("finest");
    }
}
