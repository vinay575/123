import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

import com.dao.ConnectionDAO;
import com.dao.EmpDAO;
import com.dto.Employee;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/RegistrationServlet")
public class EmployeeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

     
        String EmploId = request.getParameter("EmploId");
        String EmpName = request.getParameter("empName");
        String DOJ = request.getParameter("doj");
        double  basicSalary  = Double.parseDouble(request.getParameter("basicSal")) ;
      

       
        Employee employee = new Employee(EmploId, EmpName,  DOJ, basicSalary);

      
       

        try (Connection con = ConnectionDAO.connect()) {

            
            EmpDAO empDAO = new EmpDAO(con);

          
            if (empDAO.registerUser(employee)) {
               
                RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
                rd.forward(request, response);
            } else {
                
                PrintWriter pw = response.getWriter();
                pw.println("Registration failed");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
