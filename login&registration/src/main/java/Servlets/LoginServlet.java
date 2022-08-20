package Servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
    public LoginServlet() {
        super();
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "2206");
			String name = request.getParameter("name");
			String pwd = request.getParameter("pwd");
			
			Statement stmt = con.createStatement();
		    ResultSet rs = stmt.executeQuery("select * from user_info");
		    
		    while(rs.next()) {
		    	if(rs.getString("uname").equals(name))
		    		if(rs.getString("upassword").equals(pwd)) {
		    			RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
		        		rd.forward(request, response);
		    		}
		    }
		    
			RequestDispatcher rd = request.getRequestDispatcher("login_error.jsp");
    		rd.forward(request, response);			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 		
	}
}
