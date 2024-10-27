package com.jsp.SpringBoot_item.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.SpringBoot_item.dto.Item;

public interface ItemRepo extends JpaRepository<Item, Integer>{

}
