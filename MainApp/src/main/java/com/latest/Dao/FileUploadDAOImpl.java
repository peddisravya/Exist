package com.latest.Dao;
 
import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.latest.model.UploadFile;

@Service
public class FileUploadDAOImpl {

	@Autowired
	private FileUploadDAO fileUploadDAO;
	
	@Autowired
	EntityManager entitymanager;  
	
	public UploadFile Save(UploadFile uploadFile) {
		return fileUploadDAO.save(uploadFile);
	}


	
}
/*@Repository
public class FileUploadDAOImpl implements FileUploadDAO {
    @Autowired
    private SessionFactory sessionFactory;
     
    public FileUploadDAOImpl() {
    }
 
    public FileUploadDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
 
    @Override
    @Transactional
    public void save(UploadFile uploadFile) {
        sessionFactory.getCurrentSession().save(uploadFile);
    }
}*/