// Generated by delombok at Sun Nov 06 10:56:35 CET 2022

import com.google.common.collect.ImmutableCollection;

public class SingularGuavaCollection<T> {
  private ImmutableCollection rawTypes;
  private ImmutableCollection<Integer> integers;
  private ImmutableCollection<T> generics;
  private ImmutableCollection<? extends Number> extendsGenerics;

  public static void main(String[] args) {
  }


  @java.lang.SuppressWarnings("all")
  public static abstract class SingularGuavaCollectionBuilder<T, C extends SingularGuavaCollection<T>, B extends SingularGuavaCollection.SingularGuavaCollectionBuilder<T, C, B>> {
    @java.lang.SuppressWarnings("all")
    private com.google.common.collect.ImmutableList.Builder<java.lang.Object> rawTypes;
    @java.lang.SuppressWarnings("all")
    private com.google.common.collect.ImmutableList.Builder<Integer> integers;
    @java.lang.SuppressWarnings("all")
    private com.google.common.collect.ImmutableList.Builder<T> generics;
    @java.lang.SuppressWarnings("all")
    private com.google.common.collect.ImmutableList.Builder<Number> extendsGenerics;

    @java.lang.SuppressWarnings("all")
    protected abstract B self();

    @java.lang.SuppressWarnings("all")
    public abstract C build();

    @java.lang.SuppressWarnings("all")
    public B rawType(final java.lang.Object rawType) {
      if (this.rawTypes == null) this.rawTypes = com.google.common.collect.ImmutableList.builder();
      this.rawTypes.add(rawType);
      return self();
    }

    @java.lang.SuppressWarnings("all")
    public B rawTypes(final java.lang.Iterable<?> rawTypes) {
      if (rawTypes == null) {
        throw new java.lang.NullPointerException("rawTypes cannot be null");
      }
      if (this.rawTypes == null) this.rawTypes = com.google.common.collect.ImmutableList.builder();
      this.rawTypes.addAll(rawTypes);
      return self();
    }

    @java.lang.SuppressWarnings("all")
    public B clearRawTypes() {
      this.rawTypes = null;
      return self();
    }

    @java.lang.SuppressWarnings("all")
    public B integer(final Integer integer) {
      if (this.integers == null) this.integers = com.google.common.collect.ImmutableList.builder();
      this.integers.add(integer);
      return self();
    }

    @java.lang.SuppressWarnings("all")
    public B integers(final java.lang.Iterable<? extends Integer> integers) {
      if (integers == null) {
        throw new java.lang.NullPointerException("integers cannot be null");
      }
      if (this.integers == null) this.integers = com.google.common.collect.ImmutableList.builder();
      this.integers.addAll(integers);
      return self();
    }

    @java.lang.SuppressWarnings("all")
    public B clearIntegers() {
      this.integers = null;
      return self();
    }

    @java.lang.SuppressWarnings("all")
    public B generic(final T generic) {
      if (this.generics == null) this.generics = com.google.common.collect.ImmutableList.builder();
      this.generics.add(generic);
      return self();
    }

    @java.lang.SuppressWarnings("all")
    public B generics(final java.lang.Iterable<? extends T> generics) {
      if (generics == null) {
        throw new java.lang.NullPointerException("generics cannot be null");
      }
      if (this.generics == null) this.generics = com.google.common.collect.ImmutableList.builder();
      this.generics.addAll(generics);
      return self();
    }

    @java.lang.SuppressWarnings("all")
    public B clearGenerics() {
      this.generics = null;
      return self();
    }

    @java.lang.SuppressWarnings("all")
    public B extendsGeneric(final Number extendsGeneric) {
      if (this.extendsGenerics == null) this.extendsGenerics = com.google.common.collect.ImmutableList.builder();
      this.extendsGenerics.add(extendsGeneric);
      return self();
    }

    @java.lang.SuppressWarnings("all")
    public B extendsGenerics(final java.lang.Iterable<? extends Number> extendsGenerics) {
      if (extendsGenerics == null) {
        throw new java.lang.NullPointerException("extendsGenerics cannot be null");
      }
      if (this.extendsGenerics == null) this.extendsGenerics = com.google.common.collect.ImmutableList.builder();
      this.extendsGenerics.addAll(extendsGenerics);
      return self();
    }

    @java.lang.SuppressWarnings("all")
    public B clearExtendsGenerics() {
      this.extendsGenerics = null;
      return self();
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
      return "SingularGuavaCollection.SingularGuavaCollectionBuilder(rawTypes=" + this.rawTypes + ", integers=" + this.integers + ", generics=" + this.generics + ", extendsGenerics=" + this.extendsGenerics + ")";
    }
  }


  @java.lang.SuppressWarnings("all")
  private static final class SingularGuavaCollectionBuilderImpl<T> extends SingularGuavaCollection.SingularGuavaCollectionBuilder<T, SingularGuavaCollection<T>, SingularGuavaCollection.SingularGuavaCollectionBuilderImpl<T>> {
    @java.lang.SuppressWarnings("all")
    private SingularGuavaCollectionBuilderImpl() {
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    protected SingularGuavaCollection.SingularGuavaCollectionBuilderImpl<T> self() {
      return this;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public SingularGuavaCollection<T> build() {
      return new SingularGuavaCollection<T>(this);
    }
  }

  @java.lang.SuppressWarnings("all")
  protected SingularGuavaCollection(final SingularGuavaCollection.SingularGuavaCollectionBuilder<T, ?, ?> b) {
    com.google.common.collect.ImmutableCollection<java.lang.Object> rawTypes = b.rawTypes == null ? com.google.common.collect.ImmutableList.<java.lang.Object>of() : b.rawTypes.build();
    this.rawTypes = rawTypes;
    com.google.common.collect.ImmutableCollection<Integer> integers = b.integers == null ? com.google.common.collect.ImmutableList.<Integer>of() : b.integers.build();
    this.integers = integers;
    com.google.common.collect.ImmutableCollection<T> generics = b.generics == null ? com.google.common.collect.ImmutableList.<T>of() : b.generics.build();
    this.generics = generics;
    com.google.common.collect.ImmutableCollection<Number> extendsGenerics = b.extendsGenerics == null ? com.google.common.collect.ImmutableList.<Number>of() : b.extendsGenerics.build();
    this.extendsGenerics = extendsGenerics;
  }

  @java.lang.SuppressWarnings("all")
  public static <T> SingularGuavaCollection.SingularGuavaCollectionBuilder<T, ?, ?> builder() {
    return new SingularGuavaCollection.SingularGuavaCollectionBuilderImpl<T>();
  }
}
