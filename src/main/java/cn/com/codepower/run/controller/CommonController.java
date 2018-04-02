package cn.com.codepower.run.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import cn.com.codepower.content.entity.Article;
import cn.com.codepower.content.service.ArticleService;
import cn.com.codepower.login.controller.UserController;

/**
 * 负责静态资源跳转的页面
 * @author Shuaishuai
 *
 */
@Controller
@EnableAutoConfiguration
public class CommonController {
	
	private Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private ArticleService articleService;
	
	/**
	 * 页面布局
	 * @return
	 */
	@RequestMapping("/layout")
	public String layout() {
		return "layout/layout";
	}
	
	/**
	 * 菜单栏
	 * @return
	 */
	@RequestMapping("/tree")
    public String tree(HttpServletRequest request) {
		return "layout/tree";
    }
	
}
