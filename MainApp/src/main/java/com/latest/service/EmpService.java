package com.latest.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.latest.model.Emp;

@Service
public class EmpService {
    private static List<Emp> Emps = new ArrayList<Emp>();
    private static int empCount = 3;

    static {
        Emps.add(new Emp(1, "sravya", "Ramya D", new Date(),
                false));
        Emps.add(new Emp(2, "sravya", "Keshav sharma", new Date(), false));
        Emps.add(new Emp(3, "sravya", "Shree ram", new Date(),
                false));
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
            if (emp.getId()==id) {
                return emp;
            }
        }
        return null;
    }

    public void updateemp(Emp emp){
    		Emps.remove(emp);
    		Emps.add(emp);
    }

    public void addemp(String name, String empName, Date joinDate,
            boolean isDone) {
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