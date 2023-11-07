package com.gcu.models;

import java.util.List;

/**
 * This model represent end-users.
 */
public class Blogger 
{
//	public int BloggerId; 
	private String Username;
	private String Password; 
	
//	public String PasswordHash; 
//	public List<Integer> PublishedBlogIds; 
//	public List<Integer> FavoriteBlogIds;\
	
	// get
//	public int getBloggerId() { return this.BloggerId; }
	public String getUsername() { return this.Username; }
	public String getPassword() { return this.Password; }
	
	// set
//	public void setBloggerId(int x) { this.BloggerId = x; }
	public void setUsername(String x) { this.Username = x; }
	public void setPassword(String x) { this.Password = x; }
	
	/**
	 * Our custom toString method.
	 * @return username and password
	 */
	public String ToString()
	{
		return String.format("['Username']=%s, ['Password']=%s", 
				this.Username, this.Password
		);
	}
}