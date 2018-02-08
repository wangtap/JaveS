package com.wt.study.base.basedao;

import java.util.List;

public interface BaseDao<T> {
    void insert(T t);
    void delete(T t);
    void update(T t);
    List<T> queryAll();

}
