package com.springwithjdbc;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao //DAO -->Data Access Object
{
	private JdbcTemplate jdbcTemplate;  
	  
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	}  
	  
	public int saveEmployee(Employee e)
	{  
String query="insert into employeejdbc values('"+e.getId()+"','"+e.getName()+"','"+e.getSalary()+"')";
return jdbcTemplate.update(query);
	}
/*public int updateEmployee(Employee e){  
	    String query="update employee set   
	    name='"+e.getName()+"',salary='"+e.getSalary()+"' where id='"+e.getId()+"' ";  
	    return jdbcTemplate.update(query);  
	} */ 
	/*public int deleteEmployee(Employee e){  
	    String query="delete from employee where id='"+e.getId()+"' ";  
	    return jdbcTemplate.update(query);  
	} */
}
