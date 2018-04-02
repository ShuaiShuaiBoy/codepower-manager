package cn.com.codepower.login.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.com.codepower.login.entity.User;
import cn.com.codepower.login.service.UserService;

/**
 * 用户的控制类
 * @author Shuaishuai
 *
 */
@Controller
@EnableAutoConfiguration
public class UserController {
	
	private Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	/**
	 * 登陆
	 * @return
	 */
	@RequestMapping("/login")
	public String login(HttpSession session,User user,HttpServletRequest request) {
		try {
			User newUser = userService.login(user);
			session.setAttribute("user", newUser);
			logger.info("ID:"+newUser.getId()+",登陆成功.");
			return "redirect:/";
		}catch(Exception e) {
			logger.error("login", e);
			String message = e.getMessage();
			request.setAttribute("msg", message);
			return "forward:/";
		}
	}
	
	/**
	 * 注册
	 * @return
	 */
	@RequestMapping("/register")
	public String register(HttpSession session,User user,HttpServletRequest request) {
		try {
			User newUser = userService.register(user);
			session.setAttribute("user", newUser);
			logger.info("ID:"+newUser.getId()+",登陆成功.");
			return "redirect:/";
		}catch(Exception e) {
			logger.error("register", e);
			String message = e.getMessage();
			request.setAttribute("msg", message);
			return "forward:/signupPage";
		}
	}
	
	/**
	 * 修改用户信息
	 * @return
	 */
	@RequestMapping("/revisUser")
	public String reviseUser(HttpSession session,User user) {
		User newUser = userService.reviseUser(user);
		session.setAttribute("user", newUser);
		logger.info("ID:"+newUser.getId()+",登陆成功.");
		return "redirect:/";
	}
	
	/**
	 * 注销
	 * @return
	 */
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.setAttribute("user", null);
		return "redirect:/";
	}
}
