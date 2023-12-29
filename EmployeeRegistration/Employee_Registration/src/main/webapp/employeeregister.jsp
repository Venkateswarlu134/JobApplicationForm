<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Employee Registration </title>
<link rel="stylesheet" href="reg.css" ></link>
<script src="regs.js"></script>
</head>
<body>
		<div class ="container" align="center">
		<h1>Employee Registration Form</h1>
		<form action="EmployeeServlet" name="empreg" onsubmit="return validateForm()" method="post">
			<table class="formdesign" >
				<tr>
					<td>Full Name</td>
					<td><input type="text" name="fn" required/></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="email" name="email"  required/><span class="fromerror"><b></b></span></td>
				</tr>
				<tr>
					<td>Mobile Number</td>
					<td><input type="number" name="mobno" required/><span class="fromerror"><b></b></span></td>
				</tr>
				<tr>
					<td>Qualification Type</td>
					<td>
						<input type="text" placeholder="Qualification" required list="qualification" name="qualification" />
						<datalist id="qualification">
  							<option value="SSC/10th"/>
  							<option value="ITI"/>
  							<option value="Intermediate"/>
  							<option value="Diploma">
  							<option value="Under Graduate"/>
  							<option value="Post Graduate">
  							<option value="Others">
						</datalist>
					</td>
				</tr>
				<tr>
					<td>Course</td>
					<td>
						<input type="text" placeholder="Course" required list="course" name="course" />
						<datalist id="course">
							<option value="BBA">
  							<option value="BCA"/>
  							<option value="BE"/>
  							<option value="BS"/>
  							<option value="B.SC">
  							<option value="B.Tech"/>
  							<option value="Others">
						</datalist>
					</td>
				</tr>
				<tr>
					<td>Branch</td>
					<td><input type="text" name="branch" required/></td>
				</tr>
				<tr>
					<td>Year of Pass</td>
					<td>
					<select required name="year">
						<option value="SelectYear">Select Year</option>
						<option value="2018">2018</option>
						<option value="2019">2019</option>
						<option value="2020">2020</option>
						<option value="2021">2021</option>
						<option value="2022">2022</option>
						<option value="2023">2023</option>
						<option value="2024">2024</option>
					</select>
					</td>
				</tr>
				<tr>
					<td>Skills</td>
					<td><input type="text" placeholder="ex:Java,python,sql" required name="skills"/></td>
				</tr>
				<tr>
					<td>Country</td>
					<td><input type="text" name="country" required/></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><input type="text" name="address" required/></td>
				</tr>
				<tr>
					<td>Pin Code</td>
					<td><input type="number" name="pincode" required/></td>
				</tr>
				<tr>
				<td>Gender</td>
					<td><select name="gender" required>
							<option>Gender</option>
								<option>Male</option>
							<option>Female</option>
						</select>
					</td>
				</tr>
				<tr>
					<td>Enter AadharNumber</td>
					<td><input type="number" name="aadhar" required/><span class="formerror"><b></b></span></td>
				</tr>
				<tr>
					<td>Resume</td>
					<td><input type="file" name="file" required/></td>
				</tr>
				<tr>
					<td><button type="reset" value="Reset" onclick="resetForm()" > Clear </button></td>
					<td><button type="submit" value="Submit" > Submit </button></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>
