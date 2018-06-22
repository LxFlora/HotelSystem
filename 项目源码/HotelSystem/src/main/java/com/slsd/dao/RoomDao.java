package com.slsd.dao;
/**
 * Room接口
 * @author wmm
 */
import java.util.List;

import com.slsd.entity.Room;

public interface RoomDao {
	/**
	 * 查询所有客房 
	 * @return List<Room>
	 */
    public List<Room> getAllRoom();
    /**
     * 通过id查询客房
     * @param roomId
     * @return Room
     */
    public Room getRoomById(int roomId);
    /**
     * 添加客房
     * @param room
     * @return int
     */
    public int addRoom(Room room);
    /**
     * 编辑客房信息
     * @param room
     * @return int
     */
    public int editRoom(Room room);
    /**
     * 删除客房信息
     * @param room
     * @return
     */
    public int delRoom(int roomId);
    /**
     * 页面查询
     * @param pageStart 开始页
     * @param pageSize  页面大小
     * @return List<Room>
     */
    public List<Room> page(int pageStart,int pageSize);
    /**
     * 数据的总数
     * @return int
     */
    public int count();
}
