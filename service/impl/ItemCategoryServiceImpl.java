package com.ent.mini.erp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ent.mini.erp.model.ItemCategory;
import com.ent.mini.erp.repository.ItemCategoryRepository;
import com.ent.mini.erp.service.ItemCategoryService;

/**
 * Created by mini erp on 2020.
 */

@Service
public class ItemCategoryServiceImpl implements ItemCategoryService {

    @Autowired
    private ItemCategoryRepository itemCategoryRepository;

    @Override
    public List<ItemCategory> findAll() {
        return itemCategoryRepository.findAll();
    }

    
    @Override
    public void delete(String itemCategoryId) {
    	itemCategoryRepository.delete(itemCategoryRepository.findOne(itemCategoryId));
    }

    @Override
    public ItemCategory save(ItemCategory itemCategory) {
        return itemCategoryRepository.save(itemCategory);
    }

    @Override
    public ItemCategory update(ItemCategory itemCategory) {
        return itemCategoryRepository.save(itemCategory);
    }

	@Override
	public List<ItemCategory> getItemCategory(String itemCategory) {
		return itemCategoryRepository.findByItemCategory(itemCategory);
	}
}