import java.util.logging.Level;

// mock logger class to make things compile without external libraries
public class Logger {
  private static Logger singleton = null;

  public static Logger getLogger(String name) {
    if (singleton == null) {
      singleton = new Logger();
    }

    return singleton;
  }

  public boolean log(Level level, String s, Throwable ex) {
    return level.getName().equals(s) || level.equals(ex);
  }
}
