package cn.com.codepower.main.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.com.codepower.main.entity.Tree;
import cn.com.codepower.main.service.TreeService;

/**
 * 树形菜单控制类
 * @author Shuaishuai
 *
 */
@Controller
@EnableAutoConfiguration
@RequestMapping("/tree")
public class TreeController {
    
	private Logger logger = LoggerFactory.getLogger(TreeController.class);
	
	private TreeService treeService;
	
	@RequestMapping("/add")
	public String addTree(Tree tree) {
		treeService.addTree(tree);
		return null;
	}
}
