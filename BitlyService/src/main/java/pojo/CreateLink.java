package pojo;

import java.util.ArrayList;

public class CreateLink {
	private String long_url;
	private String domain;
	private String group_guid;
	private String title;
	private ArrayList<String> tags;
	
	public String getLong_url() {
		return long_url;
	}
	public void setLong_url(String long_url) {
		this.long_url = long_url;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getGroup_guid() {
		return group_guid;
	}
	public void setGroup_guid(String group_guid) {
		this.group_guid = group_guid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public ArrayList<String> getTags() {
		return tags;
	}
	public void setTags(ArrayList<String> tags) {
		this.tags = tags;
	}
}
