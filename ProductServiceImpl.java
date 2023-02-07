package com.app.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Repository.ProductRepository;
import com.app.pojos.Product;
@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository proRepo;
	@Override
	public List<Product> getAllProducts() {
	
		return proRepo.findAll() ;
	}
	@Override
	public Product addproduct(Product newprod) {
		
		return proRepo.save(newprod);
	}
	@Override
	public void deleteById(Long Id) {
		
		// TODO Auto-generated method stub
		if (proRepo.existsById(Id)) {
		proRepo.deleteById(Id);
		}
	}
	@Override
	public void updateProduct(Product updatedproduct) {
		if (proRepo.existsById(updatedproduct.getId())) {
			proRepo.save(updatedproduct);
		}
		
	}

}
