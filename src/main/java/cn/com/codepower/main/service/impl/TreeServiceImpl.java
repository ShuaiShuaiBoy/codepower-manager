package cn.com.codepower.main.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.codepower.main.dao.TreeDao;
import cn.com.codepower.main.entity.Tree;
import cn.com.codepower.main.service.TreeService;

/**
 * 树形菜单的业务实现类
 * @author Shuaishuai
 *
 */
@Service
public class TreeServiceImpl implements TreeService {

	private Logger logger = LoggerFactory.getLogger(TreeServiceImpl.class);
	
	@Autowired
	private TreeDao treeDao;
	
	@Override
	public List<Tree> queryTreeAll() {
		List<Tree> treeAll = treeDao.selectTreeAll();
		return treeAll;
	}

	@Override
	public Boolean addTree(Tree tree) {
		Integer insertTree = treeDao.insertTree(tree);
		logger.debug(insertTree+"");
		return null;
	}

	@Override
	public Boolean editTree(Tree tree) {
		Integer updateTree = treeDao.updateTree(tree);
		logger.debug(updateTree+"");
		return null;
	}

}
