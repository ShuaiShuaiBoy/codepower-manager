package cn.com.codepower.content.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.com.codepower.content.entity.Article;
import cn.com.codepower.content.service.ArticleService;
import cn.com.codepower.login.entity.User;

/**
 * 文章的控制类
 * @author Shuaishuai
 *
 */
@Controller
@EnableAutoConfiguration
@RequestMapping("/article")
public class ArticleController {
	
	private static final int BiConsumer = 0;

	private Logger logger = LoggerFactory.getLogger(ArticleController.class);
	
	@Autowired
	private ArticleService articleService;
	
	
	/**
	 * 创建新文章
	 * @return
	 */
	@RequestMapping("/createArticle")
	public String createArticle(Article article,HttpServletRequest request,HttpSession session) {
		User user = (User)session.getAttribute("user");
		article.setUserId(user.getId());
		Article addArticle = articleService.addArticle(article);
		request.setAttribute("article", addArticle);
		return "redirect:/article/getArticleById/"+addArticle.getId();
	}
	
	/**
	 * 查询所有文章
	 * @return 
	 */
	@RequestMapping("/getArticleAll")
	public String getArticleAll(HttpServletRequest request) {
		List<Article> articleAll = articleService.queryArticleAll();
		request.setAttribute("articleAll", articleAll);
		return "";
	}
	
	/**
	 * 根据id查询文章
	 */
	@RequestMapping("/getArticleById/{id}")
	public String getArticleById(@PathVariable(value="id")String id,HttpServletRequest request) {
		Article article = articleService.queryArticleById(id);
		request.setAttribute("article", article);
		return "examples/article-show";
	}
}
