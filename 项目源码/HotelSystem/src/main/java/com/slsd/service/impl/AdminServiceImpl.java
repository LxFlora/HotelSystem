package com.slsd.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.slsd.dao.AdminDao;
import com.slsd.entity.Admin;
import com.slsd.service.AdminService;
@Service("adminService")//通常作用在业务层
public class AdminServiceImpl implements AdminService {
	@Resource
	private AdminDao adminDaoImpl;
	
	public List<Admin> getAllAdmin() {
		List<Admin> alist=adminDaoImpl.getAllAdmin();
		return alist;
	}

	public boolean addAdmin(Admin admin) {
		
		return (adminDaoImpl.addAdmin(admin))>0?true:false;
	}

	public boolean editAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return (adminDaoImpl.editAdmin(admin))>0?true:false;
	}

	public boolean delAdmin(int aId) {
		// TODO Auto-generated method stub
		return (adminDaoImpl.delAdmin(aId))>0?true:false;
	}

}
