// Generated by delombok at Sun Nov 06 10:56:35 CET 2022

import java.util.Map;

public class SingularMap<A, B> {
  private Map rawTypes;
  private Map<Integer, Float> integers;
  private Map<A, B> generics;
  private Map<? extends Number, ? extends String> extendsGenerics;

  public static void main(String[] args) {
  }


  @java.lang.SuppressWarnings("all")
  public static abstract class SingularMapBuilder<A, B, C extends SingularMap<A, B>, B2 extends SingularMap.SingularMapBuilder<A, B, C, B2>> {
    @java.lang.SuppressWarnings("all")
    private java.util.ArrayList<java.lang.Object> rawTypes$key;
    @java.lang.SuppressWarnings("all")
    private java.util.ArrayList<java.lang.Object> rawTypes$value;
    @java.lang.SuppressWarnings("all")
    private java.util.ArrayList<Integer> integers$key;
    @java.lang.SuppressWarnings("all")
    private java.util.ArrayList<Float> integers$value;
    @java.lang.SuppressWarnings("all")
    private java.util.ArrayList<A> generics$key;
    @java.lang.SuppressWarnings("all")
    private java.util.ArrayList<B> generics$value;
    @java.lang.SuppressWarnings("all")
    private java.util.ArrayList<Number> extendsGenerics$key;
    @java.lang.SuppressWarnings("all")
    private java.util.ArrayList<String> extendsGenerics$value;

    @java.lang.SuppressWarnings("all")
    protected abstract B2 self();

    @java.lang.SuppressWarnings("all")
    public abstract C build();

    @java.lang.SuppressWarnings("all")
    public B2 rawType(final java.lang.Object rawTypeKey, final java.lang.Object rawTypeValue) {
      if (this.rawTypes$key == null) {
        this.rawTypes$key = new java.util.ArrayList<java.lang.Object>();
        this.rawTypes$value = new java.util.ArrayList<java.lang.Object>();
      }
      this.rawTypes$key.add(rawTypeKey);
      this.rawTypes$value.add(rawTypeValue);
      return self();
    }

    @java.lang.SuppressWarnings("all")
    public B2 rawTypes(final java.util.Map<?, ?> rawTypes) {
      if (rawTypes == null) {
        throw new java.lang.NullPointerException("rawTypes cannot be null");
      }
      if (this.rawTypes$key == null) {
        this.rawTypes$key = new java.util.ArrayList<java.lang.Object>();
        this.rawTypes$value = new java.util.ArrayList<java.lang.Object>();
      }
      for (final java.util.Map.Entry<?, ?> $lombokEntry : rawTypes.entrySet()) {
        this.rawTypes$key.add($lombokEntry.getKey());
        this.rawTypes$value.add($lombokEntry.getValue());
      }
      return self();
    }

    @java.lang.SuppressWarnings("all")
    public B2 clearRawTypes() {
      if (this.rawTypes$key != null) {
        this.rawTypes$key.clear();
        this.rawTypes$value.clear();
      }
      return self();
    }

    @java.lang.SuppressWarnings("all")
    public B2 integer(final Integer integerKey, final Float integerValue) {
      if (this.integers$key == null) {
        this.integers$key = new java.util.ArrayList<Integer>();
        this.integers$value = new java.util.ArrayList<Float>();
      }
      this.integers$key.add(integerKey);
      this.integers$value.add(integerValue);
      return self();
    }

    @java.lang.SuppressWarnings("all")
    public B2 integers(final java.util.Map<? extends Integer, ? extends Float> integers) {
      if (integers == null) {
        throw new java.lang.NullPointerException("integers cannot be null");
      }
      if (this.integers$key == null) {
        this.integers$key = new java.util.ArrayList<Integer>();
        this.integers$value = new java.util.ArrayList<Float>();
      }
      for (final java.util.Map.Entry<? extends Integer, ? extends Float> $lombokEntry : integers.entrySet()) {
        this.integers$key.add($lombokEntry.getKey());
        this.integers$value.add($lombokEntry.getValue());
      }
      return self();
    }

    @java.lang.SuppressWarnings("all")
    public B2 clearIntegers() {
      if (this.integers$key != null) {
        this.integers$key.clear();
        this.integers$value.clear();
      }
      return self();
    }

    @java.lang.SuppressWarnings("all")
    public B2 generic(final A genericKey, final B genericValue) {
      if (this.generics$key == null) {
        this.generics$key = new java.util.ArrayList<A>();
        this.generics$value = new java.util.ArrayList<B>();
      }
      this.generics$key.add(genericKey);
      this.generics$value.add(genericValue);
      return self();
    }

    @java.lang.SuppressWarnings("all")
    public B2 generics(final java.util.Map<? extends A, ? extends B> generics) {
      if (generics == null) {
        throw new java.lang.NullPointerException("generics cannot be null");
      }
      if (this.generics$key == null) {
        this.generics$key = new java.util.ArrayList<A>();
        this.generics$value = new java.util.ArrayList<B>();
      }
      for (final java.util.Map.Entry<? extends A, ? extends B> $lombokEntry : generics.entrySet()) {
        this.generics$key.add($lombokEntry.getKey());
        this.generics$value.add($lombokEntry.getValue());
      }
      return self();
    }

    @java.lang.SuppressWarnings("all")
    public B2 clearGenerics() {
      if (this.generics$key != null) {
        this.generics$key.clear();
        this.generics$value.clear();
      }
      return self();
    }

    @java.lang.SuppressWarnings("all")
    public B2 extendsGeneric(final Number extendsGenericKey, final String extendsGenericValue) {
      if (this.extendsGenerics$key == null) {
        this.extendsGenerics$key = new java.util.ArrayList<Number>();
        this.extendsGenerics$value = new java.util.ArrayList<String>();
      }
      this.extendsGenerics$key.add(extendsGenericKey);
      this.extendsGenerics$value.add(extendsGenericValue);
      return self();
    }

    @java.lang.SuppressWarnings("all")
    public B2 extendsGenerics(final java.util.Map<? extends Number, ? extends String> extendsGenerics) {
      if (extendsGenerics == null) {
        throw new java.lang.NullPointerException("extendsGenerics cannot be null");
      }
      if (this.extendsGenerics$key == null) {
        this.extendsGenerics$key = new java.util.ArrayList<Number>();
        this.extendsGenerics$value = new java.util.ArrayList<String>();
      }
      for (final java.util.Map.Entry<? extends Number, ? extends String> $lombokEntry : extendsGenerics.entrySet()) {
        this.extendsGenerics$key.add($lombokEntry.getKey());
        this.extendsGenerics$value.add($lombokEntry.getValue());
      }
      return self();
    }

    @java.lang.SuppressWarnings("all")
    public B2 clearExtendsGenerics() {
      if (this.extendsGenerics$key != null) {
        this.extendsGenerics$key.clear();
        this.extendsGenerics$value.clear();
      }
      return self();
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
      return "SingularMap.SingularMapBuilder(rawTypes$key=" + this.rawTypes$key + ", rawTypes$value=" + this.rawTypes$value + ", integers$key=" + this.integers$key + ", integers$value=" + this.integers$value + ", generics$key=" + this.generics$key + ", generics$value=" + this.generics$value + ", extendsGenerics$key=" + this.extendsGenerics$key + ", extendsGenerics$value=" + this.extendsGenerics$value + ")";
    }
  }


  @java.lang.SuppressWarnings("all")
  private static final class SingularMapBuilderImpl<A, B> extends SingularMap.SingularMapBuilder<A, B, SingularMap<A, B>, SingularMap.SingularMapBuilderImpl<A, B>> {
    @java.lang.SuppressWarnings("all")
    private SingularMapBuilderImpl() {
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    protected SingularMap.SingularMapBuilderImpl<A, B> self() {
      return this;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public SingularMap<A, B> build() {
      return new SingularMap<A, B>(this);
    }
  }

  @java.lang.SuppressWarnings("all")
  protected SingularMap(final SingularMap.SingularMapBuilder<A, B, ?, ?> b) {
    java.util.Map<java.lang.Object, java.lang.Object> rawTypes;
    switch (b.rawTypes$key == null ? 0 : b.rawTypes$key.size()) {
    case 0: 
      rawTypes = java.util.Collections.emptyMap();
      break;
    case 1: 
      rawTypes = java.util.Collections.singletonMap(b.rawTypes$key.get(0), b.rawTypes$value.get(0));
      break;
    default: 
      rawTypes = new java.util.LinkedHashMap<java.lang.Object, java.lang.Object>(b.rawTypes$key.size() < 1073741824 ? 1 + b.rawTypes$key.size() + (b.rawTypes$key.size() - 3) / 3 : java.lang.Integer.MAX_VALUE);
      for (int $i = 0; $i < b.rawTypes$key.size(); $i++) rawTypes.put(b.rawTypes$key.get($i), (java.lang.Object) b.rawTypes$value.get($i));
      rawTypes = java.util.Collections.unmodifiableMap(rawTypes);
    }
    this.rawTypes = rawTypes;
    java.util.Map<Integer, Float> integers;
    switch (b.integers$key == null ? 0 : b.integers$key.size()) {
    case 0: 
      integers = java.util.Collections.emptyMap();
      break;
    case 1: 
      integers = java.util.Collections.singletonMap(b.integers$key.get(0), b.integers$value.get(0));
      break;
    default: 
      integers = new java.util.LinkedHashMap<Integer, Float>(b.integers$key.size() < 1073741824 ? 1 + b.integers$key.size() + (b.integers$key.size() - 3) / 3 : java.lang.Integer.MAX_VALUE);
      for (int $i = 0; $i < b.integers$key.size(); $i++) integers.put(b.integers$key.get($i), (Float) b.integers$value.get($i));
      integers = java.util.Collections.unmodifiableMap(integers);
    }
    this.integers = integers;
    java.util.Map<A, B> generics;
    switch (b.generics$key == null ? 0 : b.generics$key.size()) {
    case 0: 
      generics = java.util.Collections.emptyMap();
      break;
    case 1: 
      generics = java.util.Collections.singletonMap(b.generics$key.get(0), b.generics$value.get(0));
      break;
    default: 
      generics = new java.util.LinkedHashMap<A, B>(b.generics$key.size() < 1073741824 ? 1 + b.generics$key.size() + (b.generics$key.size() - 3) / 3 : java.lang.Integer.MAX_VALUE);
      for (int $i = 0; $i < b.generics$key.size(); $i++) generics.put(b.generics$key.get($i), (B) b.generics$value.get($i));
      generics = java.util.Collections.unmodifiableMap(generics);
    }
    this.generics = generics;
    java.util.Map<Number, String> extendsGenerics;
    switch (b.extendsGenerics$key == null ? 0 : b.extendsGenerics$key.size()) {
    case 0: 
      extendsGenerics = java.util.Collections.emptyMap();
      break;
    case 1: 
      extendsGenerics = java.util.Collections.singletonMap(b.extendsGenerics$key.get(0), b.extendsGenerics$value.get(0));
      break;
    default: 
      extendsGenerics = new java.util.LinkedHashMap<Number, String>(b.extendsGenerics$key.size() < 1073741824 ? 1 + b.extendsGenerics$key.size() + (b.extendsGenerics$key.size() - 3) / 3 : java.lang.Integer.MAX_VALUE);
      for (int $i = 0; $i < b.extendsGenerics$key.size(); $i++) extendsGenerics.put(b.extendsGenerics$key.get($i), (String) b.extendsGenerics$value.get($i));
      extendsGenerics = java.util.Collections.unmodifiableMap(extendsGenerics);
    }
    this.extendsGenerics = extendsGenerics;
  }

  @java.lang.SuppressWarnings("all")
  public static <A, B> SingularMap.SingularMapBuilder<A, B, ?, ?> builder() {
    return new SingularMap.SingularMapBuilderImpl<A, B>();
  }
}
