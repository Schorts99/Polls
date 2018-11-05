package pages.home.unregistered;

import java.awt.Cursor;
import pages.home.unregistered.strings.*;

public interface Index {
  public static String getContent(Cursor data) {
    var content = "<style>"+
      ".main_container {"+
        "display: flex;"+
        "position: absolute;"+
        "width: 100%;"+
        "height: 100%;"+
        "justify-content: center;"+
        "align-items: center;"+
      "}"+
      ".sign_div {"+
        "background-color: #FFF;"+
      "}"+
      ".text_center {"+
        "text-align: center;"+
      "}"+
      "@media(max-width: 768px) {"+
        ".sign_div {"+
          "width: 70%;"+
          "padding: 1em 1.5em;"+
        "}"+
      "}"+
      "@media(min-width: 768px) {"+
        ".sign_div {"+
          "width: 80%;"+
          "display: flex;"+
          "padding: 1em 2em;"+
        "}"+
        ".col_middle_in_desktop {"+
          "width: 50%;"+
        "}"+
      "}"+
    "</style>"+
    "<div class='main_container'>"+
      "<div class='sign_div'>"+
        "<div class='col_middle_in_desktop'>"+
          "<h1 class='text_center'>"+Es.SIGN_UP+"</h1>"+
        "</div>"+
        "<div class='col_middle_in_desktop'>"+
          "<h1 class='text_center'>"+Es.SIGN_IN+"</h1>"+
          "<form>"+
          "</form>"+
        "</div>"+
      "</div>"+
    "</div>";

    return content;
  }
}