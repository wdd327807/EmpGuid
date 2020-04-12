package com.heaven.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.heaven.bean.Announcement;
import com.heaven.bean.Banner;
import com.heaven.bean.General;
import com.heaven.bean.User;
import com.heaven.bean.extend.UserVO;
import com.heaven.service.IAnnouncementService;
import com.heaven.service.IBannerService;
import com.heaven.service.IGeneralService;
import com.heaven.service.IUserService;
import com.heaven.service.impl.UserServiceImpl;
import com.heaven.utils.CookieUtil;

@RestController
public class RegistController {
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Autowired
	private UserServiceImpl userService;

	@GetMapping("/regist")
	public ModelAndView regist() {
		return new ModelAndView("reception/regist");
	}

	@PostMapping("/checkRegist")
	public void checkRegist(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String result = "";
		String username = request.getParameter("username");
		UserVO userVO = userService.login(username);
		if (userVO != null) {
			result = "<font color='red'>用户名已被占用</font>";
			response.setContentType("text/html");
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write(result);
			return;
		}
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");
		String typeId = request.getParameter("typeId");
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setGender(gender);
		user.setEmail(email);

		user.setTypeId(Integer.parseInt(typeId));
		setUser(user);
		result = "ok";
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(result);
	}
	
	@Autowired
	private IAnnouncementService announcementService;
	@Autowired
	private IGeneralService generalService;
	@Autowired
	private IBannerService bannerSerice;
	
	
	@GetMapping("/doRegist")
	public ModelAndView doRegist(HttpServletRequest request, Map<String, Object> map) throws IOException {
		    User us = getUser();
		    userService.save(us);
			List<Announcement> announcementList = announcementService.selectEight();
			List<Banner> genImgList = bannerSerice.selectByName("招聘简章");
			List<Banner> annoImgList = bannerSerice.selectByName("招聘宣传");
			PageHelper.startPage(1,8);
			List<General> generalList = generalService.selectAll();
			PageInfo<General> pageInfo = new PageInfo<>(generalList);
			List<General> list = pageInfo.getList();
			map.put("announcementList", announcementList);
			map.put("generalList", list);
			map.put("genImgList", genImgList);
			map.put("annoImgList", annoImgList);
			return new ModelAndView("reception/index", map);
	
		
	}
}
