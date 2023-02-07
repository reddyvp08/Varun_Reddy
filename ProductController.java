package com.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Service.ProductService;
import com.app.pojos.Product;

@RestController
@RequestMapping("/products")
public class ProductController {
	@Autowired
	private ProductService proserv;
	
	@GetMapping
	 public List<Product> getProducts(){
		return proserv.getAllProducts();
	}
	
	@PostMapping
	public Product addnewProduct(@RequestBody Product newprod) {
		return proserv.addproduct(newprod);
	}
	@DeleteMapping("/{id}")
	public String DeleteProduct( @PathVariable Long id) {
		proserv.deleteById(id);
		return "Deleted Successful";
	}
	
	@PutMapping
	public String UpdateProduct(@RequestBody Product updatedProd) {
		proserv.updateProduct(updatedProd);
		return "Updated Successfully";
		
	}
	
}
