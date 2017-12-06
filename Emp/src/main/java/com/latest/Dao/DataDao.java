package com.latest.Dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.latest.model.Emp;

@Repository
@Component
public class DataDao {
	@PersistenceContext
	private EntityManager entityManager;
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("deprecation")
	public int getEmpCount() {
		String hql = "Select count(*) from Emp";
		Query query = getSessionFactory().openSession().createQuery(hql);
		return (int) query.uniqueResult();
	}

	public void create(Emp emp) {
		entityManager.persist(emp);
	}

	public void update(Emp emp) {
		entityManager.merge(emp);
	}

	public Emp getEmpById(long id) {
		return entityManager.find(Emp.class, id);
	}

	public void delete(long id) {
		Emp emp = getEmpById(id);
		if (emp != null) {
			entityManager.remove(emp);
		}
	}

}
