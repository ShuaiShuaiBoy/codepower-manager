package cn.com.codepower.content.entity;

import java.io.Serializable;
import java.util.Date;

import cn.com.codepower.login.entity.User;

/**
 * 文章类（cop_article）
 * 
 * @author Shuaishuai
 *
 */
public class Article implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -297162414589578675L;

	/**
	 * id
	 */
	private String id;

	/**
	 * 所属用户
	 */
	private String userId;

	/**
	 * 标题
	 */
	private String title;

	/**
	 * 内容
	 */
	private String content;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 修改时间
	 */
	private Date updateTime;

	/**
	 * 状态
	 */
	private String state;

	/**
	 * 用户信息类
	 */
	private User user;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
