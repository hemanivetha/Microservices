package com.hema.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hema.model.Employee;
import com.hema.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository empRepository;
	@Override
	
	public List<Employee> getAllEmployees() {
		List<Employee> lst=(List<Employee>) empRepository.findAll();
		if(lst.size()>0) {
			return lst;
		}
		else {
			return new ArrayList<Employee>();
		}
	}
	@Override
	public String addEmployee(String empStr) {
		JSONArray jsonObject = (JSONArray)JSONValue.parse(empStr); 
		 List<Employee> lst=new ArrayList<Employee>();
		 Employee emp=new Employee();
		 for(int i=0;i<jsonObject.size();i++){
			  JSONObject a= (JSONObject) jsonObject.get(i);
			  long id = (long) a.get("id");
			  emp.setId((int)id);
			  String name = (String) a.get("name");  
			  emp.setName(name);
			  double salary = (double) a.get("salary"); 
			  emp.setSalary(salary);
		 }
			  Employee e=empRepository.save(emp);
			  if(e != null) {
				  return "Employee Successfully Created";
			  }
			  else {
				  return "Not Created";
			  }
		
	}
	
	public String addEmployees(String empStr) {
		JSONArray jsonArray = (JSONArray)JSONValue.parse(empStr); 
		List<Employee> lst=new ArrayList<Employee>();
		 for(int i=0;i<jsonArray.size();i++){
			 Employee emp=new Employee();
			  JSONObject a= (JSONObject) jsonArray.get(i);
			  long id = (long) a.get("id");
			  emp.setId((int)id);
			  String name = (String) a.get("name");  
			  emp.setName(name);
			  double salary = (double) a.get("salary"); 
			  emp.setSalary(salary);
			  lst.add(emp);
		 }
			  List<Employee> e=(List<Employee>)empRepository.saveAll(lst);
			  if(e != null) {
				  return "Employee Successfully Created";
			  }
			  else {
				  return "Not Created";
			  }
	}
	
	@Override
	public String deleteEmployee(int id) {
		empRepository.deleteById(id);
		return "Deleted Successfully";
	}
	
	@Override
	public String deleteEmployees(String empStr) {
		JSONArray jsonArray = (JSONArray)JSONValue.parse(empStr); 
		List<Employee> lst=new ArrayList<Employee>();
		 for(int i=0;i<jsonArray.size();i++){
			 Employee emp=new Employee();
			  JSONObject a= (JSONObject) jsonArray.get(i);
			  long id = (long) a.get("id");
			  emp.setId((int)id);
			  String name = (String) a.get("name");  
			  emp.setName(name);
			  double salary = (double) a.get("salary"); 
			  emp.setSalary(salary);
			  lst.add(emp);
		 }
			  empRepository.deleteAll(lst);
			 return  "Employees Successfully Deleted";
	}
	
	@Override
	public String updateEmployee(String empStr) {
		
		JSONArray jsonObject = (JSONArray)JSONValue.parse(empStr); 
		 Employee emp=new Employee();
		 for(int i=0;i<jsonObject.size();i++){
			  JSONObject a= (JSONObject) jsonObject.get(i);
			  long id = (long) a.get("id");
			  emp.setId((int)id);
			  String name = (String) a.get("name");  
			  emp.setName(name);
			  double salary = (double) a.get("salary"); 
			  emp.setSalary(salary);
		 }
			  Employee e=empRepository.save(emp);
			  return "Employee Successfully Updated";
		
	}
	
	@Override
	public String updateEmployees(String empStr) {
		JSONArray jsonArray = (JSONArray)JSONValue.parse(empStr); 
		List<Employee> lst=new ArrayList<Employee>();
		 for(int i=0;i<jsonArray.size();i++){
			 Employee emp=new Employee();
			  JSONObject a= (JSONObject) jsonArray.get(i);
			  long id = (long) a.get("id");
			  emp.setId((int)id);
			  String name = (String) a.get("name");  
			  emp.setName(name);
			  double salary = (double) a.get("salary"); 
			  emp.setSalary(salary);
			  lst.add(emp);
		 }
			  List<Employee> e=(List<Employee>)empRepository.saveAll(lst);
			  return "Employee Successfully Updated";
	}
	
	@Override
	public Optional<Employee> getEmployee(int id) {
		return empRepository.findById(id);
	}
	
	
	
	

}
