
Feature: Feature to test bit.ly service
  Scenario: Retrieve group details for groupId
  Given user adds base uri and query parameter
	When user calls "GET" request
	Then API call return status code as "200"
	And validate "subhra7890","Bm7n6dnTb2r" available in response
		
	Scenario: Retrive group details with sorted details
	Given user adds base url and "month",  5 and "2022-07-22T06:42:00+0000" as query parameters
	When user calls "GET" request with groupID "Bm7n6dnTb2r"
	Then API call return status code as "200"
	And validate "bit.ly","subhra7890" and "sports, enter" available in response under link,createdBy and tags field
		
	Scenario: Create a new bitlink
	Given user add body details with "https://www.cricbuzz.com/", "Bm7n6dnTb2r", "API document" and  tags "sports, enter"
	When user calls "POST" request
	Then API call return status code as "200"
	And verify shortlink is created with "bit.ly"
		
		
	
