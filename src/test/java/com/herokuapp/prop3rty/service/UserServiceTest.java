package com.herokuapp.prop3rty.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.herokuapp.prop3rty.ApplicationTests;
import com.herokuapp.prop3rty.domain.User;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ApplicationTests.class)
public class UserServiceTest {
	
	@Autowired
	private UserService service;
	
	private User user = new User();

	@Before
	public void setUp() {
		
		user.setEmail("test@email.com");
		user.setPass("pass");
		user.setFirstName("Test");
		user.setLastName("TEST");
		
	}

	@Test
	public void testSave_new_user() {
		User newUser = service.save(user);
		Assert.assertNull(newUser.getErrorMessage());
	}
	
	@Test
	public void testSave_existing_user() {
		User existingUser = service.save(user);
		Assert.assertNotNull(existingUser.getErrorMessage());
		Assert.assertEquals(user.getEmail(), existingUser.getEmail());
	}

}
