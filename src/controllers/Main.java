package controllers;

import lib.CheckAuth;
import pages.home.unregistered.strings.*;
import java.awt.Cursor;

public interface Main {
  public static String home() {
    return CheckAuth.verify(pages.home.registered.Index.getContent(null), pages.home.unregistered.Index.getContent(null), Es.TITLE);
  }
}