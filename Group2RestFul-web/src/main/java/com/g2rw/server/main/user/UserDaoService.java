package com.g2rw.server.main.user;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

//import antlr.collections.List;

@Component
// Data Access Object (DAO)

public class UserDaoService {
	public static int usersCount=5; 
	//creating an instance of ArrayList  
	private static List<User> users=new ArrayList<>();
	//static block   
	static  
	{  
	//adding users to the list  
	users.add(new User(1, "Abebe", new Date()));  
	users.add(new User(2, "Almaz", new Date()));  
	users.add(new User(3, "Yohannes", new Date()));  
	users.add(new User(4, "Chaltu", new Date()));  
	users.add(new User(5, "Martha", new Date()));  
	}  
	//method that retrieve all users from the list  
	public List<User> findAll()  
	{  
	return users;  
	}  
	//method that add the user in the list  
	public User save(User user)  
	{  
	if(user.getId()==null)  
	{  
	//increments the user id  
	user.setId(++usersCount);  
	}  
	users.add(user);  
	return user;  
	}
	//method that find a particular user from the list  
	public User findOne(int id)  
	{  
	for(User user:users)  
	{  
	if(user.getId()==id)  
	return user;  
	}  
	return null;  
	}
	//method that delete a user resource  
	public User deleteById(int id)  
	{  
	Iterator<User> iterator = users.iterator();  
	while(iterator.hasNext())  
	{  
	User user=iterator.next();  
	if(user.getId()==id)  
	{  
	iterator.remove();  
	return user; //returns the deleted resource back  
	}  
	}  
	return null;  
	}  
	 
}
