package cn.com.codepower.util;

import java.util.UUID;

import org.springframework.util.DigestUtils;

/**
 * 用户信息的工具类
 * @author Shuaishuai
 *
 */
public class UserUtil {
	
	/**
	 * 密码加密
	 * @return
	 */
	public static String md5Password(String password) {
		String md5DigestAsHex = DigestUtils.md5DigestAsHex(password.getBytes());
		return md5DigestAsHex;
	}
}
