// Generated by delombok at Sun Nov 06 21:25:42 CET 2022

import java.io.IOException;
import java.io.IOException;

public class BuilderMultipleConstructorException {
  private int first;
  private float second;

  public BuilderMultipleConstructorException(int i) throws IOException {
    throw new IOException("Some Exception");
  }

  public BuilderMultipleConstructorException(int i, String someString) throws IOException {
    throw new IOException("Some other Exception");
  }

  public static void main(String[] args) {
    System.out.println(builder().first(2).second(2.0F).build());
  }


  @java.lang.SuppressWarnings("all")
  public static class BuilderMultipleConstructorExceptionBuilder {
    @java.lang.SuppressWarnings("all")
    private int first;
    @java.lang.SuppressWarnings("all")
    private float second;

    @java.lang.SuppressWarnings("all")
    BuilderMultipleConstructorExceptionBuilder() {
    }

    /**
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public BuilderMultipleConstructorException.BuilderMultipleConstructorExceptionBuilder first(final int first) {
      this.first = first;
      return this;
    }

    /**
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public BuilderMultipleConstructorException.BuilderMultipleConstructorExceptionBuilder second(final float second) {
      this.second = second;
      return this;
    }

    @java.lang.SuppressWarnings("all")
    public BuilderMultipleConstructorException build() {
      return new BuilderMultipleConstructorException(this.first, this.second);
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
      return "BuilderMultipleConstructorException.BuilderMultipleConstructorExceptionBuilder(first=" + this.first + ", second=" + this.second + ")";
    }
  }

  @java.lang.SuppressWarnings("all")
  public static BuilderMultipleConstructorException.BuilderMultipleConstructorExceptionBuilder builder() {
    return new BuilderMultipleConstructorException.BuilderMultipleConstructorExceptionBuilder();
  }

  @java.lang.SuppressWarnings("all")
  public BuilderMultipleConstructorException(final int first, final float second) {
    this.first = first;
    this.second = second;
  }
}
