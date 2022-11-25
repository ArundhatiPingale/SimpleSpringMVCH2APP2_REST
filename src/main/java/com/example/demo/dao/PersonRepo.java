package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Person;

public interface PersonRepo extends JpaRepository<Person , Integer>
{
	  @Query("from Person where pname=?1 ")
	  
  List<Person> findbypname (String pname);
	  
	  @Query("from Person where name=?1 ")
  List<Person>  findbyname (String name);
  
  @Query("from Person where pname=?1 order by name")
  List<Person> findbypnamesorted(String pname);
}
