package com.sspringboot.test;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sspringboot.test.dao.UserRepo;
import com.sspringboot.test.entities.User;

@SpringBootApplication
public class SpringjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(SpringjpaexampleApplication.class, args);
		
		UserRepo userRepo=context.getBean(UserRepo.class);
//		User user = new User();
//		user.setName("ranjan");
//		user.setCity("bmp");
//		user.setStatus("noob");
//		
//		List<User> users = List.of(user);
//		//to save multiple entities
//		Iterable<User> u=userRepo.saveAll(users);
////		//to save single entity
////		User u = userRepo.save(user);
//		
//		for(User u1:u) {
//			System.out.println(u1);
//		}
		
		
		//update code
		
//		Optional<User> result=userRepo.findById(1);
//		User user = result.get();
//		user.setName("jinu");
//		User u = userRepo.save(user);
//		System.out.println(u);
		
		
		
		//how to get data
		//findById(id)-returns optional containing your data
		
		//retrieve all data from db
		
//		Iterable<User> res=userRepo.findAll();
//		res.forEach(user->{System.out.println(user);});
//		
		
		//delete
		
//		userRepo.deleteById(1);
//		Iterable<User> res=userRepo.findAll();
//    	res.forEach(user->{System.out.println(user);});
		
		
	}

}
