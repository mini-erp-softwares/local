package com.ent.mini.erp.service;

import java.util.List;

import com.ent.mini.erp.model.ItemCategory;

public interface ItemCategoryService {

	ItemCategory save(ItemCategory plant);

	ItemCategory update(ItemCategory plant);

	List<ItemCategory> findAll();

	void delete(String id);

	List<ItemCategory> getItemCategory(String itemCategory);

}
