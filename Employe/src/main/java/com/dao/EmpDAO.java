package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dto.Employee;

public class EmpDAO {
    private Connection connection;

    // Constructor that takes a Connection parameter
    public EmpDAO(Connection connection) {
        this.connection = connection;
    }


    public  boolean registerUser(Employee  employee ) throws SQLException {
        String query = "INSERT into employees VALUES (?, ?, ?, ?)";

        try (PreparedStatement ps = connection.prepareStatement(query)) {
        	
        	  ps.setString(1, employee .getEmploId());
        	  ps.setString(2, employee .getEmpName());
              ps.setString(3,employee .getDOJ());
              ps.setDouble(4, employee .getBasicSal());
           

            int count = ps.executeUpdate();

            return count > 0;
        }
    }


    public boolean validateUser(String EmploId) throws SQLException {
        String loginQuery = "SELECT name FROM employees WHERE EmploId=? ";

        try (PreparedStatement ps = connection.prepareStatement(loginQuery)) {
            ps.setString(1,EmploId);
        

            try (ResultSet rs = ps.executeQuery()) {
                return rs.next(); 
            }
        }
    }


    
    public   Employee getSalary(int empID) throws SQLException {
    	 Employee emp= new  Employee();
        try (Connection connection =  ConnectionDAO.connect()){;
        	String sql="SELECT * FROM employees WHERE EmploId=?";
          try(PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, empID);
            try (ResultSet rs = statement.executeQuery()) {
                if (rs.next()) {
                	
                	emp.setEmploId(rs.getString("EmploId"));
                	emp. setEmpName(rs.getString("EmpName"));
                	emp.setDOJ(rs.getString("DOJ"));
                	emp.setBasicSal(rs.getDouble("BasicSal"));
                	
                	return emp;	
                	
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
       
    }
		
		return emp;
    }
    
    
    
    
    
    
    
    
    
    
    public Employee  getUserDetails(String EmploId ) throws SQLException {
    	Employee  employee = null;

        String userDetailsQuery = "SELECT * FROM dem WHERE EmploId=?" ;

        try (PreparedStatement ps = connection.prepareStatement(userDetailsQuery)) {
            ps.setString(1, EmploId);
         

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    
                	employee = new Employee();
                	employee .setEmploId(rs.getString("EmploId"));
                	employee .setEmpName(rs.getString("EmpName"));
                	employee .setDOJ(rs.getString("DOJ"));
                	employee .setBasicSal(rs.getDouble("BasicSal"));
                	
                   
                }
            }
        }

        return employee;

}
}