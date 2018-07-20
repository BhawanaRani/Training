package com.training.exilant.RestFullWebServiceSpringBoot.users;

import java.net.URI;
import java.util.List;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.hateoas.mvc.ControllerLinkBuilderFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.training.exilant.RestFullWebServiceSpringBoot.exception.UserNotFoundException;

@RestController
public class UserResource {

	@Autowired
	private UserDaoService userService;
	
	
	@GetMapping("users")
	public List<User> getAllUser()
	{
		return userService.getAllUsers();
	}
	
	
	//will give the user+reference links to the caller
	@GetMapping("/user/{userId}")
	public Resource<User> getOneUser(@PathVariable Integer userId) throws UserNotFoundException
	{
		User getUser= userService.getUser(userId);
		if(getUser==null)
		{
			throw new UserNotFoundException("id-"+userId);
		}
		//link with all the users with meta data all-users   (/users)R
		
		Resource<User> resource=new Resource<User>(getUser);
		ControllerLinkBuilder linkto=new ControllerLinkBuilderFactory().linkTo(methodOn(this.getClass()).getAllUser());
		
		ControllerLinkBuilder linkto1=new ControllerLinkBuilderFactory().linkTo(methodOn(this.getClass()).getOneUser(101));
		
		resource.add(linkto.withRel("all-user"));
		resource.add(linkto1.withRel("another-way"));
		return resource;
	}
	
	
//	@PostMapping("/users2")
//	public ResponseEntity<Object> createUserResponseCode()
	
	
	 @PostMapping("/users1")
	 public Resource<User> createUser(@RequestBody User user) {
	User savedUser = userService.saveUser(user);
	
	
	

	Resource<User> resource=new Resource<User>(savedUser);
	ControllerLinkBuilder linkto=new ControllerLinkBuilderFactory().
			linkTo(methodOn(this.getClass()).getOneUser(savedUser.getUserId()));
	System.out.println("Saved User " + savedUser);
	
	resource.add(linkto.withRel("selected-user"));
	return resource;
	 }

	 @PostMapping("/users2")
	 public ResponseEntity<Object> createUserResponseCode(@RequestBody User user) {
	 User savedUser = userService.saveUser(user);
	 URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{userId}")
	 .buildAndExpand(savedUser.getUserId()).toUri();

	 return ResponseEntity.created(location).build();

	 }
	 
	 @PostMapping("/userUpdate")
	 public void updateUser(@RequestBody int userId,@RequestBody String name) {
	User updatedUser = userService.updateUser(userId,name);
	System.out.println("updatedUser " + updatedUser);
	 }
	 
	 
	 @PostMapping("/userDelete")
	 public void deleteUser(@RequestBody User user) {
	String msg = userService.deleteUser(user);
	System.out.println("Msg" + msg);
	 }
	
	 
}
