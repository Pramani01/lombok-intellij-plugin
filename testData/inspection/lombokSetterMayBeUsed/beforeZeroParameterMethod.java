// "Use lombok @Setter for 'bar'" "false"

public class Foo {
  private int bar;
  private int fieldWithoutSetter;

  public void setBar() {
    bar<caret> = bar;
  }
}