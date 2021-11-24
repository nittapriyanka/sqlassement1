package com.sonata.login;

import java.sql.SQLException;
import java.util.List;


public interface TaskInterface {
	
	
	public List<Task> getData1() throws SQLException;
	

	public int setPriority(int Task_ID,String Priority) throws SQLException;
	
	public int setNotes(int Task_ID,String Notes) throws SQLException;
	
	
	
	public int setBookmarks(int Task_ID, boolean IsBookmarked) throws SQLException;

}
