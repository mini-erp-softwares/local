package com.ent.mini.erp.service;

import java.util.List;

import com.ent.mini.erp.model.StorageBin;

public interface StorageBinService {

	StorageBin save(StorageBin plant);

	StorageBin update(StorageBin plant);

	List<StorageBin> findAll();

	void delete(String id);

	List<StorageBin> getStorageBin(String storageBin);

}
