package ru.itis.services;

import ru.itis.models.Product;

import java.util.List;

/**
 * 27.11.2018
 * SearchService
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public interface SearchService {
    List<Product> search(String title);
}
