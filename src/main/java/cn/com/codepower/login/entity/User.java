package cn.com.codepower.login.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户类（cop_user）
 * 
 * @author Shuaishuai
 *
 */
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7753782211743066109L;

	/**
	 * ID
	 */
	private String id;
	/**
	 * 用户名
	 */
	private String userName;

	/**
	 * 密码
	 */
	private String password;

	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 性别
	 */
	private Integer sex;

	/**
	 * 出生日期
	 */
	private Date birthday;

	/**
	 * 出生地
	 */
	private String city;

	/**
	 * QQ
	 */
	private Integer qq;
	/**
	 * 微信号
	 */
	private String weChat;
	/**
	 * 邮箱
	 */
	private String email;
	/**
	 * 手机号
	 */
	private Integer mobile;
	/**
	 * 注册时间
	 */
	private Date regTime;
	/**
	 * 状态
	 */
	private String state;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getQq() {
		return qq;
	}

	public void setQq(Integer qq) {
		this.qq = qq;
	}

	public String getWeChat() {
		return weChat;
	}

	public void setWeChat(String weChat) {
		this.weChat = weChat;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getMobile() {
		return mobile;
	}

	public void setMobile(Integer mobile) {
		this.mobile = mobile;
	}

	public Date getRegTime() {
		return regTime;
	}

	public void setRegTime(Date regTime) {
		this.regTime = regTime;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
