// Generated by delombok at Sun Nov 06 21:17:29 CET 2022

import com.google.common.collect.ImmutableTable;
import java.util.Map;

public class SingularGuavaTable<A, B, C> {
  private ImmutableTable rawTypes;
  private ImmutableTable<Integer, Float, String> integers;
  private ImmutableTable<A, B, C> generics;
  private ImmutableTable<? extends Number, ? extends Float, ? extends String> extendsGenerics;

  public static void main(String[] args) {
  }

  @java.lang.SuppressWarnings("all")
  SingularGuavaTable(final ImmutableTable rawTypes, final ImmutableTable<Integer, Float, String> integers, final ImmutableTable<A, B, C> generics, final ImmutableTable<? extends Number, ? extends Float, ? extends String> extendsGenerics) {
    this.rawTypes = rawTypes;
    this.integers = integers;
    this.generics = generics;
    this.extendsGenerics = extendsGenerics;
  }


  @java.lang.SuppressWarnings("all")
  public static class SingularGuavaTableBuilder<A, B, C> {
    @java.lang.SuppressWarnings("all")
    private com.google.common.collect.ImmutableTable.Builder<java.lang.Object, java.lang.Object, java.lang.Object> rawTypes;
    @java.lang.SuppressWarnings("all")
    private com.google.common.collect.ImmutableTable.Builder<Integer, Float, String> integers;
    @java.lang.SuppressWarnings("all")
    private com.google.common.collect.ImmutableTable.Builder<A, B, C> generics;
    @java.lang.SuppressWarnings("all")
    private com.google.common.collect.ImmutableTable.Builder<Number, Float, String> extendsGenerics;

    @java.lang.SuppressWarnings("all")
    SingularGuavaTableBuilder() {
    }

    @java.lang.SuppressWarnings("all")
    public SingularGuavaTable.SingularGuavaTableBuilder<A, B, C> rawType(final java.lang.Object rowKey, final java.lang.Object columnKey, final java.lang.Object value) {
      if (this.rawTypes == null) this.rawTypes = com.google.common.collect.ImmutableTable.builder();
      this.rawTypes.put(rowKey, columnKey, value);
      return this;
    }

    @java.lang.SuppressWarnings("all")
    public SingularGuavaTable.SingularGuavaTableBuilder<A, B, C> rawTypes(final com.google.common.collect.Table<?, ?, ?> rawTypes) {
      if (rawTypes == null) {
        throw new java.lang.NullPointerException("rawTypes cannot be null");
      }
      if (this.rawTypes == null) this.rawTypes = com.google.common.collect.ImmutableTable.builder();
      this.rawTypes.putAll(rawTypes);
      return this;
    }

    @java.lang.SuppressWarnings("all")
    public SingularGuavaTable.SingularGuavaTableBuilder<A, B, C> clearRawTypes() {
      this.rawTypes = null;
      return this;
    }

    @java.lang.SuppressWarnings("all")
    public SingularGuavaTable.SingularGuavaTableBuilder<A, B, C> integer(final Integer rowKey, final Float columnKey, final String value) {
      if (this.integers == null) this.integers = com.google.common.collect.ImmutableTable.builder();
      this.integers.put(rowKey, columnKey, value);
      return this;
    }

    @java.lang.SuppressWarnings("all")
    public SingularGuavaTable.SingularGuavaTableBuilder<A, B, C> integers(final com.google.common.collect.Table<? extends Integer, ? extends Float, ? extends String> integers) {
      if (integers == null) {
        throw new java.lang.NullPointerException("integers cannot be null");
      }
      if (this.integers == null) this.integers = com.google.common.collect.ImmutableTable.builder();
      this.integers.putAll(integers);
      return this;
    }

    @java.lang.SuppressWarnings("all")
    public SingularGuavaTable.SingularGuavaTableBuilder<A, B, C> clearIntegers() {
      this.integers = null;
      return this;
    }

    @java.lang.SuppressWarnings("all")
    public SingularGuavaTable.SingularGuavaTableBuilder<A, B, C> generic(final A rowKey, final B columnKey, final C value) {
      if (this.generics == null) this.generics = com.google.common.collect.ImmutableTable.builder();
      this.generics.put(rowKey, columnKey, value);
      return this;
    }

    @java.lang.SuppressWarnings("all")
    public SingularGuavaTable.SingularGuavaTableBuilder<A, B, C> generics(final com.google.common.collect.Table<? extends A, ? extends B, ? extends C> generics) {
      if (generics == null) {
        throw new java.lang.NullPointerException("generics cannot be null");
      }
      if (this.generics == null) this.generics = com.google.common.collect.ImmutableTable.builder();
      this.generics.putAll(generics);
      return this;
    }

    @java.lang.SuppressWarnings("all")
    public SingularGuavaTable.SingularGuavaTableBuilder<A, B, C> clearGenerics() {
      this.generics = null;
      return this;
    }

    @java.lang.SuppressWarnings("all")
    public SingularGuavaTable.SingularGuavaTableBuilder<A, B, C> extendsGeneric(final Number rowKey, final Float columnKey, final String value) {
      if (this.extendsGenerics == null) this.extendsGenerics = com.google.common.collect.ImmutableTable.builder();
      this.extendsGenerics.put(rowKey, columnKey, value);
      return this;
    }

    @java.lang.SuppressWarnings("all")
    public SingularGuavaTable.SingularGuavaTableBuilder<A, B, C> extendsGenerics(final com.google.common.collect.Table<? extends Number, ? extends Float, ? extends String> extendsGenerics) {
      if (extendsGenerics == null) {
        throw new java.lang.NullPointerException("extendsGenerics cannot be null");
      }
      if (this.extendsGenerics == null) this.extendsGenerics = com.google.common.collect.ImmutableTable.builder();
      this.extendsGenerics.putAll(extendsGenerics);
      return this;
    }

    @java.lang.SuppressWarnings("all")
    public SingularGuavaTable.SingularGuavaTableBuilder<A, B, C> clearExtendsGenerics() {
      this.extendsGenerics = null;
      return this;
    }

    @java.lang.SuppressWarnings("all")
    public SingularGuavaTable<A, B, C> build() {
      com.google.common.collect.ImmutableTable<java.lang.Object, java.lang.Object, java.lang.Object> rawTypes = this.rawTypes == null ? com.google.common.collect.ImmutableTable.<java.lang.Object, java.lang.Object, java.lang.Object>of() : this.rawTypes.build();
      com.google.common.collect.ImmutableTable<Integer, Float, String> integers = this.integers == null ? com.google.common.collect.ImmutableTable.<Integer, Float, String>of() : this.integers.build();
      com.google.common.collect.ImmutableTable<A, B, C> generics = this.generics == null ? com.google.common.collect.ImmutableTable.<A, B, C>of() : this.generics.build();
      com.google.common.collect.ImmutableTable<Number, Float, String> extendsGenerics = this.extendsGenerics == null ? com.google.common.collect.ImmutableTable.<Number, Float, String>of() : this.extendsGenerics.build();
      return new SingularGuavaTable<A, B, C>(rawTypes, integers, generics, extendsGenerics);
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
      return "SingularGuavaTable.SingularGuavaTableBuilder(rawTypes=" + this.rawTypes + ", integers=" + this.integers + ", generics=" + this.generics + ", extendsGenerics=" + this.extendsGenerics + ")";
    }
  }

  @java.lang.SuppressWarnings("all")
  public static <A, B, C> SingularGuavaTable.SingularGuavaTableBuilder<A, B, C> builder() {
    return new SingularGuavaTable.SingularGuavaTableBuilder<A, B, C>();
  }
}
