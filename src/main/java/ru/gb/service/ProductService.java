package ru.gb.service;

import org.springframework.stereotype.Service;
import ru.gb.dto.Product;
import ru.gb.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAll(){
        return productRepository.getProductList();
    }

    public Product getProductByID (Integer id){
        return productRepository.getProductByID(id);
    }

    public void saveProduct (Product product) {
        productRepository.saveProduct(product);
    }
}
