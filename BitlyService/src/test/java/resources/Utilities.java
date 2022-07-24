package resources;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;


import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Utilities {
	public static RequestSpecification req;
	public RequestSpecification requestSpecification() throws IOException
	{
		if(req==null)
		{
			PrintStream log= new PrintStream(new FileOutputStream("Log.txt"));    
			req =new RequestSpecBuilder().setBaseUri(getGlobalValue("baseURI")).
					addHeader("Authorization","Bearer"+" "+getGlobalValue("token")).
			    		addFilter(RequestLoggingFilter.logRequestTo(log)).
			    		addFilter(ResponseLoggingFilter.logResponseTo(log)).
			    		build();
			return req;
		}
		return req;
	}
	
	public String getGlobalValue(String key) throws IOException
	{
		Properties prop= new Properties();
		String currentDir=System.getProperty("user.dir");
		String location=currentDir+"\\src\\test\\java\\resources\\globalProperties.properties";
		FileInputStream fis=new FileInputStream(location);
		prop.load(fis);
		String value=prop.getProperty(key);		
		return value;
	}
	
	public String retrieveJsonResponse(Response response, String key)
	{
		String resp= response.asString();
	    JsonPath js= new JsonPath(resp);
	    String actual= js.get(key).toString();
	   return actual;
	}
	

}
