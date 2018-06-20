package com.slsd.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.slsd.service.RoomService;

@Controller
public class RoomController {
	@Resource
	private RoomService roomService;
}
