package coms.slsd.test;

import static org.junit.Assert.*;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.slsd.entity.Uora;
import com.slsd.service.UoraService;
@RunWith(SpringJUnit4ClassRunner.class) // 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring/root-context.xml" })
public class UoraServiceImplTest {
	@Resource
	private UoraService uoraService=null;
	@Test
	public void testGetAllUora() {
		List<Uora> ulist=uoraService.getAllUora();
		System.out.println(ulist);
	}

}
