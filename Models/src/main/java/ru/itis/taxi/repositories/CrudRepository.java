package ru.itis.taxi.repositories;

import java.util.List;

/**
 * 04.09.2018
 * CrudRepository
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public interface CrudRepository<T, V> {
    void save(T model);
    void update(T model);
    void delete(V id);
    T findOne(V id);
    List<T> findAll();
}
