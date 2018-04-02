package cn.com.codepower.login.service.impl;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.codepower.login.dao.UserDao;
import cn.com.codepower.login.entity.User;
import cn.com.codepower.login.service.UserService;
import cn.com.codepower.util.CommonUtil;
import cn.com.codepower.util.UserUtil;

/**
 * User的业务实现类
 * 
 * @author Shuaishuai
 *
 */
@Service
public class UserServiceImpl implements UserService {

	private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	private UserDao userDao;

	@Override
	public List<User> queryUserAll() {
		List<User> userAll = userDao.selectUserAll();
		if (userAll == null || userAll.isEmpty()) {
			logger.warn("此列表没有数据！");
		}
		return userAll;
	}

	@Override
	public User login(User user) {
		User byUsername = userDao.selectUserByUsername(user.getUserName());

		if (byUsername == null) {
			throw new RuntimeException("用户不存在!");
		}
		if (!byUsername.getPassword().equals(UserUtil.md5Password(user.getPassword()))) {
			throw new RuntimeException("密码错误!");
		}

		return byUsername;
	}

	@Override
	public User register(User user) {
		User byUsername = userDao.selectUserByUsername(user.getUserName());
		if (byUsername != null) {
			throw new RuntimeException("用户名已存在！");
		}
		user.setId(CommonUtil.getUUID());
		user.setPassword(UserUtil.md5Password(user.getPassword()));
		user.setRegTime(new Date());
		user.setState("1");
		Integer insertUser = userDao.insertUser(user);
		logger.info(insertUser.toString());
		User userByUsername = userDao.selectUserByUsername(user.getUserName());
		return userByUsername;
	}

	@Override
	public User queryUserById(String id) {
		User userById = userDao.selectUserById(id);
		if (userById == null) {
			throw new RuntimeException("没有此用户！");
		}

		return userById;
	}

	@Override
	public User reviseUser(User user) {
		User userById = userDao.selectUserById(user.getId());
		if (userById == null) {
			throw new RuntimeException("没有此用户！");
		}
		//判断是否修改密码
		if(user.getPassword()!=null && !user.getPassword().equals("") && !UserUtil.md5Password(user.getPassword()).equals(UserUtil.md5Password(userById.getPassword()))) {
			user.setPassword(UserUtil.md5Password(user.getPassword()));
		}
		Integer integer = userDao.updateUser(user);
		logger.info(integer.toString());
		User updateUser = userDao.selectUserById(user.getId());
		return updateUser;
	}

}
