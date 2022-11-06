// Generated by delombok at Sun Nov 06 21:17:29 CET 2022

import com.google.common.collect.ImmutableCollection;

public class SingularGuavaCollection<T> {
  private ImmutableCollection rawTypes;
  private ImmutableCollection<Integer> integers;
  private ImmutableCollection<T> generics;
  private ImmutableCollection<? extends Number> extendsGenerics;

  public static void main(String[] args) {
  }

  @java.lang.SuppressWarnings("all")
  SingularGuavaCollection(final ImmutableCollection rawTypes, final ImmutableCollection<Integer> integers, final ImmutableCollection<T> generics, final ImmutableCollection<? extends Number> extendsGenerics) {
    this.rawTypes = rawTypes;
    this.integers = integers;
    this.generics = generics;
    this.extendsGenerics = extendsGenerics;
  }


  @java.lang.SuppressWarnings("all")
  public static class SingularGuavaCollectionBuilder<T> {
    @java.lang.SuppressWarnings("all")
    private com.google.common.collect.ImmutableList.Builder<java.lang.Object> rawTypes;
    @java.lang.SuppressWarnings("all")
    private com.google.common.collect.ImmutableList.Builder<Integer> integers;
    @java.lang.SuppressWarnings("all")
    private com.google.common.collect.ImmutableList.Builder<T> generics;
    @java.lang.SuppressWarnings("all")
    private com.google.common.collect.ImmutableList.Builder<Number> extendsGenerics;

    @java.lang.SuppressWarnings("all")
    SingularGuavaCollectionBuilder() {
    }

    @java.lang.SuppressWarnings("all")
    public SingularGuavaCollection.SingularGuavaCollectionBuilder<T> rawType(final java.lang.Object rawType) {
      if (this.rawTypes == null) this.rawTypes = com.google.common.collect.ImmutableList.builder();
      this.rawTypes.add(rawType);
      return this;
    }

    @java.lang.SuppressWarnings("all")
    public SingularGuavaCollection.SingularGuavaCollectionBuilder<T> rawTypes(final java.lang.Iterable<?> rawTypes) {
      if (rawTypes == null) {
        throw new java.lang.NullPointerException("rawTypes cannot be null");
      }
      if (this.rawTypes == null) this.rawTypes = com.google.common.collect.ImmutableList.builder();
      this.rawTypes.addAll(rawTypes);
      return this;
    }

    @java.lang.SuppressWarnings("all")
    public SingularGuavaCollection.SingularGuavaCollectionBuilder<T> clearRawTypes() {
      this.rawTypes = null;
      return this;
    }

    @java.lang.SuppressWarnings("all")
    public SingularGuavaCollection.SingularGuavaCollectionBuilder<T> integer(final Integer integer) {
      if (this.integers == null) this.integers = com.google.common.collect.ImmutableList.builder();
      this.integers.add(integer);
      return this;
    }

    @java.lang.SuppressWarnings("all")
    public SingularGuavaCollection.SingularGuavaCollectionBuilder<T> integers(final java.lang.Iterable<? extends Integer> integers) {
      if (integers == null) {
        throw new java.lang.NullPointerException("integers cannot be null");
      }
      if (this.integers == null) this.integers = com.google.common.collect.ImmutableList.builder();
      this.integers.addAll(integers);
      return this;
    }

    @java.lang.SuppressWarnings("all")
    public SingularGuavaCollection.SingularGuavaCollectionBuilder<T> clearIntegers() {
      this.integers = null;
      return this;
    }

    @java.lang.SuppressWarnings("all")
    public SingularGuavaCollection.SingularGuavaCollectionBuilder<T> generic(final T generic) {
      if (this.generics == null) this.generics = com.google.common.collect.ImmutableList.builder();
      this.generics.add(generic);
      return this;
    }

    @java.lang.SuppressWarnings("all")
    public SingularGuavaCollection.SingularGuavaCollectionBuilder<T> generics(final java.lang.Iterable<? extends T> generics) {
      if (generics == null) {
        throw new java.lang.NullPointerException("generics cannot be null");
      }
      if (this.generics == null) this.generics = com.google.common.collect.ImmutableList.builder();
      this.generics.addAll(generics);
      return this;
    }

    @java.lang.SuppressWarnings("all")
    public SingularGuavaCollection.SingularGuavaCollectionBuilder<T> clearGenerics() {
      this.generics = null;
      return this;
    }

    @java.lang.SuppressWarnings("all")
    public SingularGuavaCollection.SingularGuavaCollectionBuilder<T> extendsGeneric(final Number extendsGeneric) {
      if (this.extendsGenerics == null) this.extendsGenerics = com.google.common.collect.ImmutableList.builder();
      this.extendsGenerics.add(extendsGeneric);
      return this;
    }

    @java.lang.SuppressWarnings("all")
    public SingularGuavaCollection.SingularGuavaCollectionBuilder<T> extendsGenerics(final java.lang.Iterable<? extends Number> extendsGenerics) {
      if (extendsGenerics == null) {
        throw new java.lang.NullPointerException("extendsGenerics cannot be null");
      }
      if (this.extendsGenerics == null) this.extendsGenerics = com.google.common.collect.ImmutableList.builder();
      this.extendsGenerics.addAll(extendsGenerics);
      return this;
    }

    @java.lang.SuppressWarnings("all")
    public SingularGuavaCollection.SingularGuavaCollectionBuilder<T> clearExtendsGenerics() {
      this.extendsGenerics = null;
      return this;
    }

    @java.lang.SuppressWarnings("all")
    public SingularGuavaCollection<T> build() {
      com.google.common.collect.ImmutableCollection<java.lang.Object> rawTypes = this.rawTypes == null ? com.google.common.collect.ImmutableList.<java.lang.Object>of() : this.rawTypes.build();
      com.google.common.collect.ImmutableCollection<Integer> integers = this.integers == null ? com.google.common.collect.ImmutableList.<Integer>of() : this.integers.build();
      com.google.common.collect.ImmutableCollection<T> generics = this.generics == null ? com.google.common.collect.ImmutableList.<T>of() : this.generics.build();
      com.google.common.collect.ImmutableCollection<Number> extendsGenerics = this.extendsGenerics == null ? com.google.common.collect.ImmutableList.<Number>of() : this.extendsGenerics.build();
      return new SingularGuavaCollection<T>(rawTypes, integers, generics, extendsGenerics);
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
      return "SingularGuavaCollection.SingularGuavaCollectionBuilder(rawTypes=" + this.rawTypes + ", integers=" + this.integers + ", generics=" + this.generics + ", extendsGenerics=" + this.extendsGenerics + ")";
    }
  }

  @java.lang.SuppressWarnings("all")
  public static <T> SingularGuavaCollection.SingularGuavaCollectionBuilder<T> builder() {
    return new SingularGuavaCollection.SingularGuavaCollectionBuilder<T>();
  }
}
