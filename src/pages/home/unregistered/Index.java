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
        "border-radius: 10px;"+
      "}"+
      ".text_center {"+
        "text-align: center;"+
      "}"+
      ".row {"+
        "display: flex;"+
      "}"+
      ".justify_content {"+
        "justify-content: center;"+
      "}"+
      "form {"+
        "margin: 2em 0.5em;"+
      "}"+
      "input[type=text],"+
       "input[type=email],"+
       "input[type=password] {"+
        "width: 95%;"+
        "padding: 0.5em;"+
        "margin: 0.5em;"+
        "display: inline-block;"+
        "border-radius: 4px;"+
        "box-sizing: border-box;"+
      "}"+
      ".full_width {"+
        "width: 100% !important;"+
      "}"+
      "@media(max-width: 768px) {"+
        ".sign_div {"+
          "width: 70%;"+
          "padding: 1em 1.5em;"+
        "}"+
        ".border_bottom {"+
          "border-bottom: 1px solid #000;"+
          "margin-bottom: 1em;"+
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
        ".sign_container_left {"+
          "padding: 1em 2em 1em 0;"+
        "}"+
        ".sign_container_right {"+
          "padding: 1em 0 1em 2em;"+
        "}"+
        ".right_border {"+
          "border-right: 1px solid #000;"+
        "}"+
      "}"+
    "</style>"+
    "<div class='main_container'>"+
      "<div class='sign_div'>"+
        "<div class='col_middle_in_desktop right_border sign_container_left border_bottom'>"+
          "<h1 class='text_center'>"+Es.SIGN_UP+"</h1>"+
          "<form>"+
            "<div class='row justify_content'>"+
              "<div class='col_middle_in_desktop'>"+
                "<input type='text'"+
                  "name='name'"+
                  "required "+
                  "placeholder='"+Es.NAME+"'/>"+
              "</div>"+
              "<div class='col_middle_in_desktop'>"+
                "<input type='text'"+
                  "name='last_name'"+
                  "required "+
                  "placeholder='"+Es.LAST_NAME+"'/>"+
              "</div>"+
            "</div>"+
            "<div class='row'>"+
              "<input type='email'"+
                "class='full_width'"+
                "name='email'"+
                "required "+
                "placeholder='"+Es.EMAIL+"'/>"+ 
            "</div>"+
            "<div class='row justify_content'>"+
              "<div class='col_middle_in_desktop'>"+
                "<input type='password'"+
                  "name='password'"+
                  "required "+
                  "placeholder='"+Es.PASSWORD+"'/>"+
              "</div>"+
              "<div class='col_middle_in_desktop'>"+
                "<input type='password'"+
                  "name='confirm_password'"+
                  "required "+
                  "placeholder='"+Es.CONFIRM_PASSWORD+"'/>"+
              "</div>"+
            "</div>"+
          "</form>"+
        "</div>"+
        "<div class='col_middle_in_desktop sign_container_right'>"+
          "<h1 class='text_center'>"+Es.SIGN_IN+"</h1>"+
          "<form>"+
            "<div class='row'>"+
              "<input type='email'"+
                "class='full_width'"+
                "name='email'"+
                "required "+
                "placeholder='"+Es.EMAIL+"'/>"+ 
            "</div>"+
            "<div class='row'>"+
              "<input type='password'"+
                "class='full_width'"+
                "name='password'"+
                "required "+
                "placeholder='"+Es.PASSWORD+"'/>"+ 
            "</div>"+
          "</form>"+
        "</div>"+
      "</div>"+
    "</div>";

    return content;
  }
}