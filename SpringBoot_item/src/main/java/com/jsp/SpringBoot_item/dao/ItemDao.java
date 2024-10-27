package com.jsp.SpringBoot_item.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.SpringBoot_item.dto.Item;
import com.jsp.SpringBoot_item.repo.ItemRepo;

@Repository
public class ItemDao {
	
	@Autowired
	private ItemRepo itemRepo;
	
	public Item saveItem(Item item) {
		return itemRepo.save(item);
	}
	
	public Item updateItem(int id, Item item) {
		Item item2 = itemRepo.findById(id).get();
		
		if(item2!=null) {
			item.setId(item2.getId());
			itemRepo.save(item);
			return item;
		}else {
			return null;
		}
	}
	
	public Item deleteById(int id) {
		Item item = itemRepo.findById(id).get();
		itemRepo.delete(item);
		return item;
	}
	
	public Item getItemById(int id) {
		return itemRepo.findById(id).orElse(null);
	}
}












