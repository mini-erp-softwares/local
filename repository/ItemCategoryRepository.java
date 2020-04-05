package com.ent.mini.erp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ent.mini.erp.model.ItemCategory;

public interface ItemCategoryRepository extends MongoRepository<ItemCategory,String> {

	List<ItemCategory> findByItemCategory(String itemCategory);

}
