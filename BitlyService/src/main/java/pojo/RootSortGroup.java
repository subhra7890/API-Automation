package pojo;

import java.util.ArrayList;
import java.util.List;

public class RootSortGroup {
	private List<Link> links = new ArrayList<Link>();
    private List<SortedLink> sorted_links = new ArrayList<SortedLink>();
    public List<Link> getLinks() {
        return links;
    }
    public void setLinks(List<Link> links) {
        this.links = links;
    }
	public List<SortedLink> getSorted_links() {
		return sorted_links;
	}
	public void setSorted_links(List<SortedLink> sorted_links) {
		this.sorted_links = sorted_links;
	}
    
}
