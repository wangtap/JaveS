package com.lanou3g;

public interface BaseDao<T> {
    T add(T t);
    T delect(T t);
    T update(T t);
    T get(Class<T> tClass,long id);
}
