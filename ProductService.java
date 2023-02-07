package com.app.Service;

import java.util.List;

import com.app.pojos.Product;

public interface ProductService {
 List<Product> getAllProducts();
 Product addproduct(Product newprod);
 void deleteById(Long Id);
 void updateProduct(Product updatedproduct);
}
