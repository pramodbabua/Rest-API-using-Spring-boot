package com.rest.template.springbootresttemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rest.template.springbootresttemplate.model.Item;
import com.rest.template.springbootresttemplate.model.ItemRepository;

@SpringBootApplication
public class SpringBootRestTemplateApplication implements CommandLineRunner
{
	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestTemplateApplication.class, args);
	}

	@Autowired
	ItemRepository itemRepository;

  	@Override
  	public void run(String... args) throws Exception 
	{
    	itemRepository.save(new Item(null, "Item 1"));
    	itemRepository.save(new Item(null, "Item 2"));
  	}
}
