// Generated by delombok at Sun Nov 06 21:21:45 CET 2022

public final class BuilderWithBuilderClassName {
  private final String name;
  private final int age;

  @java.lang.SuppressWarnings("all")
  BuilderWithBuilderClassName(final String name, final int age) {
    this.name = name;
    this.age = age;
  }


  @java.lang.SuppressWarnings("all")
  public static class Builder {
    @java.lang.SuppressWarnings("all")
    private String name;
    @java.lang.SuppressWarnings("all")
    private int age;

    @java.lang.SuppressWarnings("all")
    Builder() {
    }

    /**
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public BuilderWithBuilderClassName.Builder name(final String name) {
      this.name = name;
      return this;
    }

    /**
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public BuilderWithBuilderClassName.Builder age(final int age) {
      this.age = age;
      return this;
    }

    @java.lang.SuppressWarnings("all")
    public BuilderWithBuilderClassName build() {
      return new BuilderWithBuilderClassName(this.name, this.age);
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
      return "BuilderWithBuilderClassName.Builder(name=" + this.name + ", age=" + this.age + ")";
    }
  }

  @java.lang.SuppressWarnings("all")
  public static BuilderWithBuilderClassName.Builder builder() {
    return new BuilderWithBuilderClassName.Builder();
  }

  @java.lang.SuppressWarnings("all")
  public String getName() {
    return this.name;
  }

  @java.lang.SuppressWarnings("all")
  public int getAge() {
    return this.age;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  public boolean equals(final java.lang.Object o) {
    if (o == this) return true;
    if (!(o instanceof BuilderWithBuilderClassName)) return false;
    final BuilderWithBuilderClassName other = (BuilderWithBuilderClassName)o;
    final Object this$name = this.getName();
    final Object other$name = other.getName();
    if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
    if (this.getAge() != other.getAge()) return false;
    return true;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $name = this.getName();
    result = result * PRIME + ($name == null ? 43 : $name.hashCode());
    result = result * PRIME + this.getAge();
    return result;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  public java.lang.String toString() {
    return "BuilderWithBuilderClassName(name=" + this.getName() + ", age=" + this.getAge() + ")";
  }
}
