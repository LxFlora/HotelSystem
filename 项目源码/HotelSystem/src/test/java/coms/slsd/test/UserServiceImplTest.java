package coms.slsd.test;


import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.slsd.entity.User;
import com.slsd.service.UserService;


@RunWith(SpringJUnit4ClassRunner.class) // 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring/root-context.xml" })
public class UserServiceImplTest {
	@Resource
	private UserService userService=null;
	@Test
	public void testGetAllUser() {
		List<User> ulist=userService.getAllUser();
		System.out.println(ulist);
	}

	@Test
	public void testAddUser() {
		User user = new User(2, "22123", "222", "", "", "", "", "",new Date());
		System.out.println(userService.addUser(user));
	}

	@Test
	public void testEditUser() {
		User user = new User(7,2, "22123", "222", "324", "", "", "", "",new Date());
		System.out.println(userService.editUser(user));
	}

	@Test
	public void testDelUser() {
		System.out.println(userService.delUser(7));
	}

}
