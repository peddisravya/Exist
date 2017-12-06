package com.latest.Dao;
 
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.latest.model.UploadFile;
@Repository
public interface FileUploadDAO extends CrudRepository<UploadFile, String>{

	void save(byte[] data);
}