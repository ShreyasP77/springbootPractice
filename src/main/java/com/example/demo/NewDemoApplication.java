package com.example.demo;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.dao.UserRepository;
import com.example.demo.models.Users123;

@SpringBootApplication
public class NewDemoApplication {

	public static void main(String[] args) {
		try {
	ApplicationContext context = SpringApplication.run(NewDemoApplication.class, args);
	UserRepository userRep = context.getBean(UserRepository.class);
	
	
//	INSERTION


//	Users123 user1_1 = new Users123();
//	user1_1.setName("shreyas");
////	Users123 user1 = userRep.save(user1_1);
//	
//	Users123 user2_1 = new Users123();
//	user2_1.setName("ramesh");
////	Saving single user
//	Users123 user2 = userRep.save(user2_1);
//
////	For saving multiple objects
//	List<Users123> users = List.of(user1_1,user2_1); //Method from JAVA 9
////	OR ELSE
////	Create an Arraylist then add objects to it
//	Iterable<Users123> result = userRep.saveAll(users);
//	result.forEach(user->{System.out.println(user);});
		
	
	
////	UPDATIION
	
	
//	Optional<Users123> optional =  userRep.findById(44953);
//	
//	Users123 user = optional.get();
//	System.out.println(user);
//	user.setName("Khebdi");
//	Users123 userupdated = userRep.save(user);
	
	
	
//	// TO GET
	
	
//	// to fetch all the elements - .findAll()
//	// to fetch single element - findById(id);	
//	System.out.println(userRep.findAll()); 
//	
////	Or By traditional way Using Iterator
//	Iterable<Users123> itr1 = userRep.findAll();
//	Iterator<Users123> iterator = itr.iterator();
//	while(iterator.hasNext()) {
//		Users123 user = iterator.next();
//		System.out.println(user);;
//	}
//	
////	OR USING LAMBDA func
//	itr1.forEach(user->{System.out.println(user);});
	
	
	
//	DELETION
//	userRep.deleteById(44953);
//		System.out.println("Successfully deleted");
	
//	Iterable<Users123> allUsers = userRep.findAll();
//	
//	allUsers.forEach(user->{System.out.println(user);});
//	
//	System.out.println("----Now Deleting----");
//	
//	
//	userRep.deleteAll(allUsers);
//	System.out.println("-----After Deletion-----");
//	
//Iterable<Users123> itr = userRep.findAll();
//	
//	itr.forEach(user->{System.out.println(user);});
//	
	
		}catch(Exception e) {
			
			e.getMessage();
		}
	
	}

}
