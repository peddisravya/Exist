package com.latest.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.latest.Dao.DataDao;
import com.latest.model.Emp;

@Transactional
@Service
public class EmpService {
	private static List<Emp> Emps = new ArrayList<Emp>();
	private static int empCount = 3;
	@Autowired
	private DataDao dao;

	public void create(Emp emp) {
		dao.create(emp);
	}

	public void count(int count) {
		count = dao.getEmpCount();
		System.out.println(dao.getEmpCount());
	}

	static {
		Emps.add(new Emp(1, "sravya", "Ramya D", new Date(), false));
		Emps.add(new Emp(2, "sravya", "Keshav sharma", new Date(), false));
		Emps.add(new Emp(3, "sravya", "Shree ram", new Date(), false));
	}

	public List<Emp> retrieveemps(String user) {
		List<Emp> filteredemps = new ArrayList<Emp>();
		for (Emp emp : Emps) {
			if (emp.getUser().equalsIgnoreCase(user)) {
				filteredemps.add(emp);
			}
		}
		return filteredemps;
	}

	public Emp retrieveemp(int id) {
		for (Emp emp : Emps) {
			if (emp.getId() == id) {
				return emp;
			}
		}
		return null;
	}

	public void updateemp(Emp emp) {
		Emps.remove(emp);
		Emps.add(emp);
	}

	public void addemp(String name, String empName, Date joinDate, boolean isDone) {
		Emps.add(new Emp(++empCount, name, empName, joinDate, isDone));
	}

	public void deleteemp(int id) {
		Iterator<Emp> iterator = Emps.iterator();
		while (iterator.hasNext()) {
			Emp emp = iterator.next();
			if (emp.getId() == id) {
				iterator.remove();
			}
		}
	}

}