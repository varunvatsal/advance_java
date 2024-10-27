package com.jsp.SpringBoot_item.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.SpringBoot_item.dao.ItemDao;
import com.jsp.SpringBoot_item.dto.Item;

@RestController
public class ItemController {
	
	@Autowired
	private ItemDao itemDao;
	
	@PostMapping("/saveItem")
	public Item saveItem(@RequestBody Item item) {
		return itemDao.saveItem(item);
	}
	
	@PutMapping("/updateItem")
	public Item updateItem(@RequestParam int id, @RequestBody Item item) {
		return itemDao.updateItem(id, item);
	}
	
	@DeleteMapping("/deleteItem")
	public Item deleteItem(@RequestParam int id) {
		return itemDao.deleteById(id);
	}
	
	@GetMapping("/getItemById")
	public Item getItemById(@RequestParam int id) {
		return itemDao.getItemById(id);
	}
}











