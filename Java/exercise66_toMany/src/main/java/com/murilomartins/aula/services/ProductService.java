package com.murilomartins.aula.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.murilomartins.aula.dto.CategoryDTO;
import com.murilomartins.aula.dto.ProductDTO;
import com.murilomartins.aula.entities.Category;
import com.murilomartins.aula.entities.Product;
import com.murilomartins.aula.repositories.CategoryRepository;
import com.murilomartins.aula.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public ProductDTO insert(ProductDTO dto) {
		
		Product entity = new Product();
		
		entity.setName(dto.getName());
		entity.setPrice(dto.getPrice());
				
		for(CategoryDTO catDto : dto.getCategories()) {
			Category cat = categoryRepository.getReferenceById(catDto.getId());
			//Category cat = new Category();
			//cat.setId(catDto.getId());
			entity.getCategories().add(cat);
		};
		
		entity = repository.save(entity);
		
		return new ProductDTO(entity);
	}
		
}
