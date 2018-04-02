package cn.com.codepower.content.service;

import java.util.List;

import cn.com.codepower.content.entity.Article;

/**
 * 文章的业务接口
 * @author Shuaishuai
 *
 */
public interface ArticleService {
	
	/**
	 * 查询所有文章
	 * @return
	 */
	List<Article> queryArticleAll();
	
	/**
	 * 根据状态查询文章
	 * @param state
	 * @return
	 */
	List<Article> queryArticleByState(String state);

	/**
	 * 根据id查询文章
	 * @param id
	 * @return
	 */
	Article queryArticleById(String id);

	/**
	 * 添加文章
	 * @param article
	 * @return
	 */
	Article addArticle(Article article);
	
	/**
	 * 修改文章
	 * @param article
	 * @return
	 */
	Article enditArticle(Article article);
	
}
