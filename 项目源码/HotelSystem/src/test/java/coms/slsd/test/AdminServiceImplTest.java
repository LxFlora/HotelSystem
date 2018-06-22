package coms.slsd.test;

import static org.junit.Assert.*;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.slsd.entity.Admin;
import com.slsd.service.AdminService;

@RunWith(SpringJUnit4ClassRunner.class) // 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring/root-context.xml" })
public class AdminServiceImplTest {
	@Resource
	private AdminService adminService=null;
	@Test
	public void testGetAllAdmin() {
		List<Admin> alist=adminService.getAllAdmin();
		System.out.println(alist);
	}

	@Test
	public void testAddAdmin() {
//		Admin admin = new Admin(1,"", "");
//		System.out.println(adminService.addAdmin(admin));
	}

	@Test
	public void testEditAdmin() {
//		Admin admin = new Admin(,1,"", "");
//		System.out.println(adminService.editAdmin(admin));
	}

	@Test
	public void testDelAdmin() {
		System.out.println(adminService.delAdmin(6));
	}

}
