package ru.itis.repositories;

import java.util.List;

/**
 * 22.10.2018
 * CrudRepository
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public interface CrudRepository<T> {
    List<T> findAll();
    T find(Long id);
    void save(T model);
    void delete(Long id);
    void update(T model);
}
