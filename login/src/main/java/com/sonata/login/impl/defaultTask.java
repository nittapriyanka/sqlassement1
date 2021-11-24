package com.sonata.login.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sonata.login.Task;
import com.sonata.login.TaskInterface;
@Component
public class defaultTask implements TaskInterface{
	
	
	@Autowired
	DbConnection db;
	
	public List<Task> getData1(){
		List<Task> tasklist = new ArrayList<>();
		try {
		PreparedStatement cs1 = db.getConnection().prepareStatement
				("select * from task");
		
		ResultSet rs = cs1.executeQuery();
		while(rs.next()) {
			
			Task t1= new Task();
			
			 
			t1.setTask_ID(rs.getInt(1));
			t1.setOwner_ID(rs.getInt(2));
			t1.setCreator_ID(rs.getInt(3));
			t1.setName(rs.getString(4));
			t1.setDescription(rs.getString(5));
			t1.setStatus(rs.getString(6));
			t1.setPriority(rs.getString(7));
			t1.setNotes(rs.getString(8));
			t1.setIsBookmarked(rs.getBoolean(9));
			t1.setCreated_On(rs.getTimestamp(10));
			t1.setStatus_Changed_On(rs.getTimestamp(11));
			tasklist.add(t1);
		}
			
		}catch(SQLException se) {se.printStackTrace();}
		return tasklist;}
		

		
		
		@Override
		public int setPriority(int Task_ID, String Priority) throws SQLException {
			PreparedStatement cs2 = db.getConnection().prepareStatement
					("update task set Priority = ? where Task_ID=?");
			cs2.setString(1, Priority);
			cs2.setInt(2, Task_ID);
			
			int row = cs2.executeUpdate();
			return row;
		}


		@Override
		public int setNotes(int Task_ID, String Notes) throws SQLException {
			
			PreparedStatement cs3 = db.getConnection().prepareStatement
					("update task set Notes = ? where Task_ID=?");
			cs3.setString(1, Notes);
			cs3.setInt(2, Task_ID);
			
			int row = cs3.executeUpdate();
			return row;
			
		
		}
		
		@Override
		public int setBookmarks(int Task_ID , boolean IsBookmarked) throws SQLException{
			
			PreparedStatement cs4 = db.getConnection().prepareStatement
					("update task set IsBookmarked = ? where Task_ID = ?");
			cs4.setBoolean(1,IsBookmarked);
			cs4.setInt(2,Task_ID);
			
			int row = cs4.executeUpdate();
			return row;
		}
		
				
		







		






		










}
