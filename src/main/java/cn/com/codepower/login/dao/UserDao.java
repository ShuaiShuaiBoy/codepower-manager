package cn.com.codepower.login.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import cn.com.codepower.login.entity.User;

/**
 * 用户表数据库操作类
 * @author Shuaishuai
 *
 */
@Mapper
public interface UserDao {

	/**
	 * 查询所有用户
	 */
	List<User> selectUserAll();
	
	/**
	 * 根据用户名查询用户
	 */
	User selectUserByUsername(String username);
	
	/**
	 * 根据id查询用户
	 */
	User selectUserById(String id);
	
	/**
	 * 根据状态查询用户
	 */
	List<User> selectUserByState(String state);
	
	/**
	 * 添加用户
	 */
	Integer insertUser(User user);
	
	/**
	 * 修改用户
	 */
	Integer updateUser(User user);
}
