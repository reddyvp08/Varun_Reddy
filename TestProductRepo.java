package com.app.Repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.app.pojos.Product;



@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class TestProductRepo {
	@Autowired
	private ProductRepository proRepo;

	@Test
	void test() {
		assertNotNull(proRepo);
	}
	
	@Test
	void testAddEmp() {
		List<Product> stud = List.of (
				new Product("chair","asfgfgfd",2,3000,LocalDate.of(2002, 03, 02)),
				new Product("table","fgdfgb",1,2000,LocalDate.of(2003, 03, 02)));
		
		List<Product> savedprod = proRepo.saveAll(stud);
		assertEquals(2, savedprod.size());
	}

}
