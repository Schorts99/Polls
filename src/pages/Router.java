package pages;

import controllers.Main;

public interface Router {
  public static String getRequested(String path) {
    switch(path) {
      case "/":
        return Main.home();
      default:
        return "404 Not Found :c";
    }
  }
}