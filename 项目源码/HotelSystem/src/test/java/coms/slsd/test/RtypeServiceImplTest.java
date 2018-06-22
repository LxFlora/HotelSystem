package coms.slsd.test;

import static org.junit.Assert.*;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.slsd.entity.Rtype;
import com.slsd.service.RtypeService;
@RunWith(SpringJUnit4ClassRunner.class) // 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring/root-context.xml" })
public class RtypeServiceImplTest {
	@Resource
	private RtypeService rtypeService=null;
	@Test
	public void testGetAllRtype() {
		List<Rtype> rlist=rtypeService.getAllRtype();
		System.out.println(rlist);
	}

	@Test
	public void testGetRtypeById() {
		Rtype rtype=rtypeService.getRtypeById(2);
		System.out.println(rtype);
	}

	@Test
	public void testAddRtype() {
		Rtype rtype = new Rtype("2222", 23, "2222", 22, 1, 0, 1, "", "");
		boolean flag=rtypeService.addRtype(rtype);
		System.out.println(flag);
	}

	@Test
	public void testEditRtype() {
		Rtype rtype = new Rtype(7,"23", 23, "2222", 22, 1, 0, 1, "", "");
		boolean flag=rtypeService.editRtype(rtype);
		System.out.println(flag);
	}

	@Test
	public void testDelRtype() {
		boolean flag=rtypeService.delRtype(7);
		System.out.println(flag);
	}

}
