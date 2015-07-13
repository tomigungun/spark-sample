package spark.sample;

import static spark.Spark.*;

public class HelloWrold {

  public static void main(String[] args) {
    get("/hello", (req, res) -> "Hello world!");
  }
}
