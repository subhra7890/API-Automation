package pojo;

import java.util.ArrayList;
import java.util.List;

public class Root {
	private List<Group> groups = new ArrayList<Group>();
    public List<Group> getGroups() {
        return groups;
    }
    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

}
