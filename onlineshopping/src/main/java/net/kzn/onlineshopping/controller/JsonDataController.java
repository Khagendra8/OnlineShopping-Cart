package net.kzn.onlineshopping.controller;

import java.util.List;

import net.kzn.shoppingbackend.dao.ProductDAO;
import net.kzn.shoppingbackend.dto.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/json/data")
public class JsonDataController {

	@Autowired
	private ProductDAO productDAO;
	
	@RequestMapping("/all/products")
	@ResponseBody			//this annotation is used for retun the product in the json format
	public List<Product> getAllProducts()
	{
		return productDAO.listActiveProducts();
		
	}
	
	@RequestMapping("/category/{id}/products")
	@ResponseBody			//this annotation is used for retun the product in the json format
	public List<Product> getProductsByCategory(@PathVariable int id)
	{
		return productDAO.listActiveProductsByCategory(id);
		
	}

}
