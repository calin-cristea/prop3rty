package com.cristeanet.prop3rty.service;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cristeanet.prop3rty.ApplicationTests;
import com.cristeanet.prop3rty.domain.User;
import com.cristeanet.prop3rty.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ApplicationTests.class)
public class UserServiceTest {
	
	@Autowired
	private UserService service;
	
	private User user;

	@Before
	public void setUp() {
		user = new User();
		user.setEmail("test@email.com");
		user.setPass("pass");
		user.setFirstName("Test");
		user.setLastName("TEST");
	}
	
	@After
	public void tearDown() {
		service.delete(user.getEmail());
	}

	@Test
	public void testSave_new_user() {
		User newUser = service.save(user);
		Assert.assertNull(newUser.getErrorMessage());
	}
	
	@Test
	public void testSave_existing_user() {
		User newUser = service.save(user);
		User existingUser = service.save(newUser);
		Assert.assertNotNull(existingUser.getErrorMessage());
	}

	@Test
	public void testDelete() {
		User existingUser = service.save(user);
		Assert.assertTrue(service.delete(existingUser.getEmail()));
	}
	
}
