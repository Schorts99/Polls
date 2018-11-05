package lib;

public interface CheckAuth {
  public static String verify(String pageAuth, String pageNotAuth, String title) {
    var auth = false;

    if(auth) {
      return getLayout(auth, pageAuth, title);
    } else {
      return getLayout(auth, pageNotAuth, title);
    }
  }

  public static String getLayout(boolean isAuth, String page, String title) {
    if(isAuth) {
      return layouts.registered.Index.getLayout(page, title);
    } else {
      return layouts.unregistered.Index.getLayout(page, title);
    }
  }
}