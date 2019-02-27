package ru.itis.services;

import ru.itis.models.Product;
import ru.itis.repositories.ProductsRepository;

import java.util.List;

/**
 * 27.11.2018
 * SearchServiceImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class SearchServiceImpl implements SearchService {

    private ProductsRepository productsRepository;

    public SearchServiceImpl(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    @Override
    public List<Product> search(String title) {
        return productsRepository.findAllByTitleSearch(title);
    }
}
