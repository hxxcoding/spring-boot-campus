package com.thoughtworks.campus;

import com.thoughtworks.campus.entity.User;
import com.thoughtworks.campus.service.IUserService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import java.util.List;

@SpringBootTest
class CampusApplicationTests extends AbstractTransactionalJUnit4SpringContextTests {

	@Autowired
	private IUserService userService;

	@Test
	void testFindAllUser() {
		List<User> userList = userService.lambdaQuery().list();
		assertEquals(3, userList.size());
		System.out.println(userList);
	}

	@Test
	void testInsertUser() {
		User user = new User();
		user.setUsername("lyt");
		user.setPassword("123");
		userService.save(user);
		System.out.println(userService.lambdaQuery().list());
	}

}
