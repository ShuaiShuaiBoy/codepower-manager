package cn.com.codepower.main.service;

import java.util.List;

import cn.com.codepower.main.entity.Tree;

/**
 * 树形菜单的业务接口
 * @author Shuaishuai
 *
 */
public interface TreeService {

	/**
	 * 查询所有菜单
	 * @return
	 */
	List<Tree> queryTreeAll();
	
	/**
	 * 添加菜单
	 * @param tree
	 * @return
	 */
	Boolean addTree(Tree tree);

	/**
	 * 修改菜单
	 * @param tree
	 * @return
	 */
    Boolean editTree(Tree tree); 
}
