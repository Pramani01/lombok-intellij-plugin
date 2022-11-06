// Generated by delombok at Sun Nov 06 10:56:35 CET 2022

import java.util.List;

public class SingularList<T> {
	private List rawTypes;
	private List<Integer> integers;
	private List<T> generics;
	private List<? extends Number> extendsGenerics;


	@java.lang.SuppressWarnings("all")
	public static abstract class SingularListBuilder<T, C extends SingularList<T>, B extends SingularList.SingularListBuilder<T, C, B>> {
		@java.lang.SuppressWarnings("all")
		private java.util.ArrayList<java.lang.Object> rawTypes;
		@java.lang.SuppressWarnings("all")
		private java.util.ArrayList<Integer> integers;
		@java.lang.SuppressWarnings("all")
		private java.util.ArrayList<T> generics;
		@java.lang.SuppressWarnings("all")
		private java.util.ArrayList<Number> extendsGenerics;

		@java.lang.SuppressWarnings("all")
		protected abstract B self();

		@java.lang.SuppressWarnings("all")
		public abstract C build();

		@java.lang.SuppressWarnings("all")
		public B rawType(final java.lang.Object rawType) {
			if (this.rawTypes == null) this.rawTypes = new java.util.ArrayList<java.lang.Object>();
			this.rawTypes.add(rawType);
			return self();
		}

		@java.lang.SuppressWarnings("all")
		public B rawTypes(final java.util.Collection<?> rawTypes) {
			if (rawTypes == null) {
				throw new java.lang.NullPointerException("rawTypes cannot be null");
			}
			if (this.rawTypes == null) this.rawTypes = new java.util.ArrayList<java.lang.Object>();
			this.rawTypes.addAll(rawTypes);
			return self();
		}

		@java.lang.SuppressWarnings("all")
		public B clearRawTypes() {
			if (this.rawTypes != null) this.rawTypes.clear();
			return self();
		}

		@java.lang.SuppressWarnings("all")
		public B integer(final Integer integer) {
			if (this.integers == null) this.integers = new java.util.ArrayList<Integer>();
			this.integers.add(integer);
			return self();
		}

		@java.lang.SuppressWarnings("all")
		public B integers(final java.util.Collection<? extends Integer> integers) {
			if (integers == null) {
				throw new java.lang.NullPointerException("integers cannot be null");
			}
			if (this.integers == null) this.integers = new java.util.ArrayList<Integer>();
			this.integers.addAll(integers);
			return self();
		}

		@java.lang.SuppressWarnings("all")
		public B clearIntegers() {
			if (this.integers != null) this.integers.clear();
			return self();
		}

		@java.lang.SuppressWarnings("all")
		public B generic(final T generic) {
			if (this.generics == null) this.generics = new java.util.ArrayList<T>();
			this.generics.add(generic);
			return self();
		}

		@java.lang.SuppressWarnings("all")
		public B generics(final java.util.Collection<? extends T> generics) {
			if (generics == null) {
				throw new java.lang.NullPointerException("generics cannot be null");
			}
			if (this.generics == null) this.generics = new java.util.ArrayList<T>();
			this.generics.addAll(generics);
			return self();
		}

		@java.lang.SuppressWarnings("all")
		public B clearGenerics() {
			if (this.generics != null) this.generics.clear();
			return self();
		}

		@java.lang.SuppressWarnings("all")
		public B extendsGeneric(final Number extendsGeneric) {
			if (this.extendsGenerics == null) this.extendsGenerics = new java.util.ArrayList<Number>();
			this.extendsGenerics.add(extendsGeneric);
			return self();
		}

		@java.lang.SuppressWarnings("all")
		public B extendsGenerics(final java.util.Collection<? extends Number> extendsGenerics) {
			if (extendsGenerics == null) {
				throw new java.lang.NullPointerException("extendsGenerics cannot be null");
			}
			if (this.extendsGenerics == null) this.extendsGenerics = new java.util.ArrayList<Number>();
			this.extendsGenerics.addAll(extendsGenerics);
			return self();
		}

		@java.lang.SuppressWarnings("all")
		public B clearExtendsGenerics() {
			if (this.extendsGenerics != null) this.extendsGenerics.clear();
			return self();
		}

		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		public java.lang.String toString() {
			return "SingularList.SingularListBuilder(rawTypes=" + this.rawTypes + ", integers=" + this.integers + ", generics=" + this.generics + ", extendsGenerics=" + this.extendsGenerics + ")";
		}
	}


	@java.lang.SuppressWarnings("all")
	private static final class SingularListBuilderImpl<T> extends SingularList.SingularListBuilder<T, SingularList<T>, SingularList.SingularListBuilderImpl<T>> {
		@java.lang.SuppressWarnings("all")
		private SingularListBuilderImpl() {
		}

		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		protected SingularList.SingularListBuilderImpl<T> self() {
			return this;
		}

		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		public SingularList<T> build() {
			return new SingularList<T>(this);
		}
	}

	@java.lang.SuppressWarnings("all")
	protected SingularList(final SingularList.SingularListBuilder<T, ?, ?> b) {
		java.util.List<java.lang.Object> rawTypes;
		switch (b.rawTypes == null ? 0 : b.rawTypes.size()) {
		case 0: 
			rawTypes = java.util.Collections.emptyList();
			break;
		case 1: 
			rawTypes = java.util.Collections.singletonList(b.rawTypes.get(0));
			break;
		default: 
			rawTypes = java.util.Collections.unmodifiableList(new java.util.ArrayList<java.lang.Object>(b.rawTypes));
		}
		this.rawTypes = rawTypes;
		java.util.List<Integer> integers;
		switch (b.integers == null ? 0 : b.integers.size()) {
		case 0: 
			integers = java.util.Collections.emptyList();
			break;
		case 1: 
			integers = java.util.Collections.singletonList(b.integers.get(0));
			break;
		default: 
			integers = java.util.Collections.unmodifiableList(new java.util.ArrayList<Integer>(b.integers));
		}
		this.integers = integers;
		java.util.List<T> generics;
		switch (b.generics == null ? 0 : b.generics.size()) {
		case 0: 
			generics = java.util.Collections.emptyList();
			break;
		case 1: 
			generics = java.util.Collections.singletonList(b.generics.get(0));
			break;
		default: 
			generics = java.util.Collections.unmodifiableList(new java.util.ArrayList<T>(b.generics));
		}
		this.generics = generics;
		java.util.List<Number> extendsGenerics;
		switch (b.extendsGenerics == null ? 0 : b.extendsGenerics.size()) {
		case 0: 
			extendsGenerics = java.util.Collections.emptyList();
			break;
		case 1: 
			extendsGenerics = java.util.Collections.singletonList(b.extendsGenerics.get(0));
			break;
		default: 
			extendsGenerics = java.util.Collections.unmodifiableList(new java.util.ArrayList<Number>(b.extendsGenerics));
		}
		this.extendsGenerics = extendsGenerics;
	}

	@java.lang.SuppressWarnings("all")
	public static <T> SingularList.SingularListBuilder<T, ?, ?> builder() {
		return new SingularList.SingularListBuilderImpl<T>();
	}
}
