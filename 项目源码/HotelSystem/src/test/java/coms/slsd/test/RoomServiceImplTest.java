package coms.slsd.test;

import static org.junit.Assert.*;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.slsd.entity.Room;
import com.slsd.entity.Rtype;
import com.slsd.service.RoomService;
import com.slsd.service.RtypeService;

@RunWith(SpringJUnit4ClassRunner.class) // 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring/root-context.xml" })
public class RoomServiceImplTest {
	@Resource
	private RoomService roomService=null;

	@Test
	public void testGetAllRoom() {
		List<Room> rlist=roomService.getAllRoom();
		System.out.println(rlist);
	}

	@Test
	public void testGetRoomById() {
	Room room=roomService.getRoomById(1);
	System.out.println(room);
	}

	@Test
	public void testAddRoom() {
	  
		Room room = new Room(2, 23, 34, "fdsdfv", 44, 0, 1, 1, "vv", "dd", "dd", "", "");
		boolean flag=roomService.addRoom(room);
		System.out.println(flag);
	}

	@Test
	public void testEditRoom() {
		Room room = new Room(7,2, 23, 34, "fdsdfv", 44, 0, 1, 1, "vv", "dd", "dd", "", "");
		boolean flag=roomService.editRoom(room);
		System.out.println(flag);
	}

	@Test
	public void testDelRoom() {
		boolean flag=roomService.delRoom(7);
		System.out.println(flag);
	}

	@Test
	public void testPage() {
		fail("Not yet implemented");
	}

	@Test
	public void testCount() {
		fail("Not yet implemented");
	}

}
