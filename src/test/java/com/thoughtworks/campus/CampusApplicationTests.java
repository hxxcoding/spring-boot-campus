package com.thoughtworks.campus;

import com.thoughtworks.campus.entity.User;
import com.thoughtworks.campus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import java.util.List;

@SpringBootTest
class CampusApplicationTests extends AbstractTransactionalJUnit4SpringContextTests {

	@Autowired
	private UserMapper userMapper;

	@Test
	void testFindAllUser() {
		List<User> userList = userMapper.queryAllUser();
		assertEquals(3, userList.size());
		System.out.println(userList);
	}

	@Test
	void testInsertUser() {
		User user = new User();
		user.setId(4);
		user.setUsername("lyt");
		user.setPassword("123");
		userMapper.insertUser(user);
		System.out.println(userMapper.queryAllUser());
	}
}
