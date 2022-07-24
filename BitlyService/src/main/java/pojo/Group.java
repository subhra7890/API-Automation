package pojo;

import java.util.ArrayList;
import java.util.List;

public class Group {
	private String created;
    private String modified;
    private List<Object> bsds = new ArrayList<Object>();
    private String guid;
    private String organization_guid;
    private String name;
    private Boolean is_active;
	private String role;
    private References references;
    public String getCreated() {
        return created;
    }
    public void setCreated(String created) {
        this.created = created;
    }
    public String getModified() {
        return modified;
    }
    public void setModified(String modified) {
        this.modified = modified;
    }
    public List<Object> getBsds() {
        return bsds;
    }
    public void setBsds(List<Object> bsds) {
        this.bsds = bsds;
    }
    public String getGuid() {
        return guid;
    }
    public void setGuid(String guid) {
        this.guid = guid;
    }
    public String getOrganization_guid() {
		return organization_guid;
	}
	public void setOrganization_guid(String organization_guid) {
		this.organization_guid = organization_guid;
	}
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIs_active() {
		return is_active;
	}
	public void setIs_active(Boolean is_active) {
		this.is_active = is_active;
	}
	public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public References getReferences() {
        return references;
    }
    public void setReferences(References references) {
        this.references = references;
    }

}
