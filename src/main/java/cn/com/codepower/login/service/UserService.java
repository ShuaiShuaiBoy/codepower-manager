package cn.com.codepower.login.service;

import java.util.List;

import cn.com.codepower.login.entity.User;

/**
 * User的业务接口
 * @author Shuaishuai
 *
 */
public interface UserService {
	
	/**
	 * 查询所有用户
	 * @return
	 */
	List<User> queryUserAll();
	
	/**
	 * 登陆
	 * @param user
	 * @return
	 */
	User login(User user);
	
	/**
	 * 注册
	 * @param user
	 * @return
	 */
	User register(User user);
	
	/**
	 * 根据id查询用户
	 * @param id
	 * @return
	 */
	User queryUserById(String id);

	/**
	 * 修改用户
	 * @param user
	 * @return
	 */
	User reviseUser(User user);
	
	
}
