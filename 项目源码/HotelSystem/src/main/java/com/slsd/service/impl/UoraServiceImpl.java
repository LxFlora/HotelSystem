package com.slsd.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.slsd.dao.UoraDao;
import com.slsd.entity.Uora;
import com.slsd.service.UoraService;
@Service("uoraService")//通常作用在业务层
public class UoraServiceImpl implements UoraService {
	@Resource
	private UoraDao uoraDaoImpl;
	public List<Uora> getAllUora() {
		List<Uora> ulist=uoraDaoImpl.getAllUora();
		return ulist;
	}

}
