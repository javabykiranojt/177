package com.tka.dao;

import java.util.ArrayList;
import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.Address;
import com.tka.entity.Employee;

@Repository
public class ElectionDao {

	@Autowired
	SessionFactory factory;

	public ArrayList<String> fetchCandidatesFromAllStates() {
		System.out.println("I am in dao");
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Employee employee = new Employee("kiran", "4444", "8888");
		Address address1 = new Address("karve");
		Address address2 = new Address("deccan");
		HashSet<Address> addresses = new HashSet<>();
		addresses.add(address1);
		addresses.add(address2);
		employee.setAddress(addresses);
		session.save(employee);// insert query
		transaction.commit();
		session.close();

		ArrayList<String> al = new ArrayList<>();
		al.add("MH");
		al.add("UP");
		al.add("MP");
		al.add("SIKKIM");
		return al;

	}


}
