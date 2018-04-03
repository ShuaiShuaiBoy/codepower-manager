package cn.com.codepower.main.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import cn.com.codepower.main.entity.Tree;

/**
 * 菜单表的操作类
 * @author Shuaishuai
 *
 */
@Mapper
public interface TreeDao {

	/**
	 * 查询所有菜单
	 * @return
	 */
	List<Tree> selectTreeAll();
	
	/**
	 * 添加菜单
	 * @param tree
	 * @return
	 */
	Integer insertTree(Tree tree);
	
	/**
	 * 修改菜单
	 * @param tree
	 * @return
	 */
    Integer updateTree(Tree tree);
}
