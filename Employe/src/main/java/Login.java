

import java.io.IOException;
import java.sql.SQLException;

import com.dao.EmpDAO;
import com.dto.Employee;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int EmploId=Integer.parseInt(request.getParameter("empId"));
		
		EmpDAO dao=new EmpDAO(null);
		
		 try {
			 
			 Employee emp=dao.getSalary(EmploId);
			double salary=emp.getBasicSal() ;
			double hra=(20.0/100.0)*salary;
			double da=(30.0/100.0)*salary;
			double gs=salary+hra+da;
			double pf=(12.5/100)*salary;
			double ns=gs-pf;
			
			request.setAttribute("emp", emp);
			request.setAttribute("salary", salary);
			request.setAttribute("hra", hra);
			request.setAttribute("da", da);
			request.setAttribute("gs", gs);
			request.setAttribute("pf", pf);
			request.setAttribute("ns", ns);
			 String employee=emp.toString();
			 request.setAttribute("employee", employee);
        	RequestDispatcher rd=request.getRequestDispatcher("sucess.jsp");
        	rd.forward(request, response);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	 
}