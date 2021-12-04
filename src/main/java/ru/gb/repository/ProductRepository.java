package ru.gb.repository;


import org.springframework.stereotype.Component;
import ru.gb.dto.Product;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class ProductRepository {

    private List<Product> productList;

    @PostConstruct
    public void init() {
        productList = new ArrayList<>();
        productList.add(new Product(1, "Notebook Lenovo", 1000));
        productList.add(new Product(2, "Notebook Dell", 900));
        productList.add(new Product(3, "Notebook Acer", 1100));
        productList.add(new Product(4, "Notebook HP", 800));
        productList.add(new Product(5, "Notebook Asus", 600));
    }

    public List<Product> getProductList(){
        return List.copyOf(productList);
    }

    public Product getProductByID(Integer id){
        return productList.stream().
                filter(product -> product.getId() == id).
                findFirst().
                orElse(null);
    }

    public void saveProduct (Product product){
        productList.add(product);
    }
}
