package cn.com.codepower.util;

import java.util.UUID;

import org.springframework.util.DigestUtils;

/**
 * 公用的工具类
 * @author Shuaishuai
 *
 */
public class CommonUtil {
	
	/**
	 * 生成UUID
	 * @return
	 */
	public static String getUUID() {
		String[] split = UUID.randomUUID().toString().split("-");
		StringBuilder sb = new StringBuilder();
		for(String str : split) {
			sb.append(str);
		}
		return sb.toString();
	}
	
}
