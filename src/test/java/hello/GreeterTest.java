package hello;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

public class GreeterTest {
  
  private final Greeter greeter = new Greeter();

  @Test
  public void greeterSaysHello() {
    assertThat(greeter.sayHello(), containsString("Hello"));
  }
  @Test
  public void greeterSaysAnyThing() {
    String result = greeter.sayAnything("テストメソッド");
    assertThat(result, containsString("テストメソッドが呼ばれた!"));
    System.out.println(result);
  }

}