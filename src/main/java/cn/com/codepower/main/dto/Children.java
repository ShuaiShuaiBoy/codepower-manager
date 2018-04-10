package cn.com.codepower.main.dto;


import java.io.Serializable;

public class Children implements Serializable {
	private Integer id;
	private String text;
	private String iconCls;
	private String url;

	public Children() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Children(Integer id, String text, String iconCls, String url) {
		super();
		this.id = id;
		this.text = text;
		this.iconCls = iconCls;
		this.url = url;
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Children [id=" + id + ", text=" + text + ", iconCls=" + iconCls
				+ ", url=" + url + "]";
	}

}
