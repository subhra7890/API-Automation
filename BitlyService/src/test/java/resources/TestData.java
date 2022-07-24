package resources;


import java.util.ArrayList;
import pojo.CreateLink;

public class TestData {
	public CreateLink postBodyTestData(String url,String groupId, String title, String tags)
	{
		CreateLink cl=new CreateLink();
		cl.setLong_url(url);
		cl.setDomain("bit.ly");
		cl.setGroup_guid(groupId);
		cl.setTitle(title);
		System.out.println(tags);
		String[] split=tags.split(",");
		ArrayList<String> list=new ArrayList<>();
		for(int i=0;i<split.length;i++)
		{
			list.add(split[i]);
		}
		cl.setTags(list);
		return cl;
		
	}

}
