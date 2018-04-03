package cn.com.codepower.main.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 树状菜单(cop_tree)
 * 
 * @author Shuaishuai
 *
 */
public class Tree implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 674882965760741528L;

	/**
	 * id
	 */
	private String id;

	/**
	 * 名称
	 */
	private String name;

	/**
	 * 链接地址
	 */
	private String url;

	/**
	 * 图标
	 */
	private String icon;
	
	/**
	 * 父菜单Id
	 */
	private String parentId;

	/**
	 * 子菜单
	 */
	private List<Tree> tree = new ArrayList<Tree>();
	
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public List<Tree> getTree() {
		return tree;
	}

	public void setTree(List<Tree> tree) {
		this.tree = tree;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
