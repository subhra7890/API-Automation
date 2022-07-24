package pojo;

import java.util.ArrayList;
import java.util.List;

public class Link {
	private String created_at;
    private String id;
    private String link;
    private List<Object> custom_bitlinks = new ArrayList<Object>();
    private String long_url;
    private String title;
    private Boolean archived;
    private String created_by;
    private String client_id;
    private List<String> tags = new ArrayList<String>();
    private List<Object> deeplinks = new ArrayList<Object>();
    private References references;
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public List<Object> getCustom_bitlinks() {
		return custom_bitlinks;
	}
	public void setCustom_bitlinks(List<Object> custom_bitlinks) {
		this.custom_bitlinks = custom_bitlinks;
	}
	public String getLong_url() {
		return long_url;
	}
	public void setLong_url(String long_url) {
		this.long_url = long_url;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Boolean getArchived() {
		return archived;
	}
	public void setArchived(Boolean archived) {
		this.archived = archived;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public String getClient_id() {
		return client_id;
	}
	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	public List<Object> getDeeplinks() {
		return deeplinks;
	}
	public void setDeeplinks(List<Object> deeplinks) {
		this.deeplinks = deeplinks;
	}
	public References getReferences() {
		return references;
	}
	public void setReferences(References references) {
		this.references = references;
	}
    
}
