
package com.nasreen.product.dao;

import static org.junit.Assert.*;


import org.junit.Test;

import com.nasreen.product.dto.Product;

public class ProductDAOimplTest {

	@Test
	public void createShouldCreateAProduct() {
		ProductDAO dao=new ProductDAOimpl();
		Product product = new Product();
		product.setId(1);
		product.setName("IPhone");
		product.setDescription("Its Awesome!!");
		product.setPrice(800);
		dao.create(product);
		Product result = dao.read(1);
		
		assertNotNull(result);
		assertEquals("IPhone",result.getName());
	}

}
