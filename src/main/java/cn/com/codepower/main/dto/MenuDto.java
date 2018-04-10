package cn.com.codepower.main.dto;

import java.io.Serializable;
import java.util.List;

public class MenuDto implements Serializable {
	private Integer id;
	private String text;
	private String iconCls;
	private List<Children> children;

	public MenuDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MenuDto(Integer id, String text, String iconCls,
			List<Children> children) {
		super();
		this.id = id;
		this.text = text;
		this.iconCls = iconCls;
		this.children = children;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getIconCls() {
		return iconCls;
	}

	public void setIconCls(String iconCls) {
		this.iconCls = iconCls;
	}

	public List<Children> getChildren() {
		return children;
	}

	public void setChildren(List<Children> children) {
		this.children = children;
	}

	@Override
	public String toString() {
		return "MenuDto [id=" + id + ", text=" + text + ", iconCls=" + iconCls
				+ ", children=" + children + "]";
	}

}
