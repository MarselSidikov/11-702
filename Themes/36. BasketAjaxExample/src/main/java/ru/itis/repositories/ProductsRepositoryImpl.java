package ru.itis.repositories;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import ru.itis.models.Product;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * 27.11.2018
 * ProductsRepositoryImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class ProductsRepositoryImpl implements ProductsRepository {

    //language=SQL
    private static final String SQL_SEARCH = "select * from product where product.title ilike ?";

    private JdbcTemplate jdbcTemplate;

    private RowMapper<Product> productRowMapper = (row, rowNum) -> Product.builder()
            .id(row.getLong("id"))
            .title(row.getString("title"))
            .build();

    public ProductsRepositoryImpl(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Product> findAllByTitleSearch(String title) {
        return jdbcTemplate.query(SQL_SEARCH, productRowMapper, "%" + title + "%");
    }

    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public Product find(Long id) {
        return null;
    }

    @Override
    public void save(Product model) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void update(Product model) {

    }
}
