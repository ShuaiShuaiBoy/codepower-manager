package cn.com.codepower.content.service.impl;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.codepower.content.dao.ArticleDao;
import cn.com.codepower.content.entity.Article;
import cn.com.codepower.content.service.ArticleService;
import cn.com.codepower.util.CommonUtil;

/**
 * 文章的业务时限类
 * @author Shuaishuai
 *
 */
@Service
public class ArticleServiceImpl implements ArticleService {
	
	private Logger logger = LoggerFactory.getLogger(ArticleServiceImpl.class);

	@Autowired
	private ArticleDao  articleDao;
	
	@Override
	public List<Article> queryArticleAll() {
		List<Article> articleAll = articleDao.selectArticleAll();
		return articleAll;
	}

	@Override
	public List<Article> queryArticleByState(String state) {
		List<Article> articleByState = articleDao.selectArticleByState(state);
		return articleByState;
	}

	@Override
	public Article queryArticleById(String id) {
		Article articleById = articleDao.selectArticleById(id);
		return articleById;
	}

	@Override
	public Article addArticle(Article article) {
		article.setId(CommonUtil.getUUID());
		article.setCreateTime(new Date());
		article.setUpdateTime(new Date());
		article.setState("1");
		articleDao.insertArticle(article);
		Article articleById = articleDao.selectArticleById(article.getId());
		return articleById;
	}

	@Override
	public Article enditArticle(Article article) {
		articleDao.updateArticle(article);
		Article articleById = articleDao.selectArticleById(article.getId());
		return articleById;
	}

}
