package layouts.unregistered;

public interface Index {
  public static String getLayout(String content, String title) {
    var layout = "<!DOCTYPE html>"+
      "<html>"+
      "<head>"+
        "<meta charset='utf-8' />"+
        "<meta http-equiv='X-UA-Compatible' content='IE=edge'>"+
        "<title>Polls: " + title + "</title>"+
        "<meta name='viewport' content='width=device-width, initial-scale=1'>"+
      "</head>"+
      "<body>"+
        "<style>"+
          "* {"+
            "margin: 0;"+
            "padding: 0;"+
          "}"+
          "body {"+
            "background-color: #000;"+
          "}"+
        "</style>"+
        content+
      "</body>"+
      "</html>";

    return layout;
  }
}