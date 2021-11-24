package com.sonata.login;


import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class DemoController {

	
	@Autowired
	TaskInterface task;
	
	@Autowired
	TaskInterface list;
	
	@Autowired
	TaskInterface priority;
	
	int row = 0;
	
	@RequestMapping(value ="/list", method = RequestMethod.GET,produces = {"application/json","application/xml"})
	public List<Task> getData1() throws SQLException{
		
		return task.getData1();
		
	}
	
	@RequestMapping(value="/priority/{Task_ID}/{Priority}", method = RequestMethod.GET)
	public List<Task> setPriority( @PathVariable int Task_ID, @PathVariable String Priority) throws SQLException
	{
		int row=task.setPriority(Task_ID, Priority);
		
		return task.getData1();
		
	}
	
	@RequestMapping(value="/notes/{Task_ID}/{Notes}", method = RequestMethod.GET)
	
	public List<Task> setNotes(@PathVariable int Task_ID, @PathVariable String Notes) throws SQLException
	{
		int row=task.setNotes(Task_ID, Notes);
		return task.getData1();
	}
	
	@RequestMapping(value="/bookmark/{Task_ID}/{IsBookmarked}", method = RequestMethod.GET)
	public List<Task> setBookmarks(@PathVariable int Task_ID,@PathVariable boolean IsBookmarked) throws SQLException
	{
		int row = task.setBookmarks(Task_ID, IsBookmarked);
		return task.getData1();
	}
	

	
	


	
	
}
