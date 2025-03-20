package org.example.java8;

@FunctionalInterface
public interface ReduceFunction<T>{
    T apply(T t1, T t2);
}
