package employeereg.web;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import employeereg.demo.Employeejdbc;
import employeereg.model.Employee;

@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	private Employeejdbc employeeJdbc;
	
	public void init()
	{
		employeeJdbc = new Employeejdbc();
	}
	 
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String fullName = req.getParameter("fn");
		String email = req.getParameter("email");
		String mobNo = req.getParameter("mobno");
		String qualification = req.getParameter("qualification");
		String course = req.getParameter("course");
		String branch = req.getParameter("branch");
		String year = req.getParameter("year");
		String skills = req.getParameter("skills");
		String country = req.getParameter("country");
		String state = req.getParameter("state");
		String address = req.getParameter("address");
		String pinCode = req.getParameter("pincode");
		String gender = req.getParameter("gender");
		String aadhar = req.getParameter("aadhar");

		Part filePart = req.getPart("file");
		InputStream fileName = filePart.getInputStream();
		
		Employee emp = new Employee();
			
		emp.setFullName(fullName);
		emp.setEmail(email);
		emp.setMobileNo(mobNo);
		emp.setQualification(qualification);
		emp.setCourse(course);
		emp.setBrach(branch);
		emp.setYearofpass(year);
		emp.setSkills(skills);
		emp.setCountry(country);
		emp.setState(state);
		emp.setAddress(address);
		emp.setPincode(pinCode);
		emp.setGender(gender);
		emp.setAadharNo(aadhar);
		emp.setFile(fileName);
		
		try {
			employeeJdbc.registerEmployee(emp);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		resp.sendRedirect("employeedetails.jsp");
	}
}
			
			
