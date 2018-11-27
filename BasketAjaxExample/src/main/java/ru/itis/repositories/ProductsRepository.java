package ru.itis.repositories;

import ru.itis.models.Product;

import java.util.List;

/**
 * 27.11.2018
 * ProductsRepository
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public interface ProductsRepository extends CrudRepository<Product> {
    List<Product> findAllByTitleSearch(String title);
}
