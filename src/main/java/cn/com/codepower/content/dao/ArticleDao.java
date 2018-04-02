package cn.com.codepower.content.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import cn.com.codepower.content.entity.Article;

/**
 * 文章表的操作类
 * @author Shuaishuai
 *
 */
@Mapper
public interface ArticleDao {
	
	/**
	 * 根据id查询文章
	 * @param id
	 * @return
	 */
	Article selectArticleById(String id);

	/**
	 * 查询所有文章
	 * @return
	 */
	List<Article> selectArticleAll();
	
	/**
	 * 根据用户id查询文章
	 * @param userId
	 * @return
	 */
	List<Article> selectArticleByUserId(String userId);

	/**
	 * 根据状态查询文章
	 * @param state
	 * @return
	 */
	List<Article> selectArticleByState(String state);

	/**
	 * 添加文章
	 * @param article
	 * @return
	 */
	Integer insertArticle(Article article);
	
	/**
	 * 修改文章
	 * @param article
	 * @return
	 */
	Integer updateArticle(Article article);
}
