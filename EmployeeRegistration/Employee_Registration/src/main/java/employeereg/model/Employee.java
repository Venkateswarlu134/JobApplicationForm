package employeereg.model;

import java.io.InputStream;
import java.io.Serializable;
import java.sql.Blob;

public class Employee implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String fullName;
	private String email;
	private String mobileNo;
	private String qualification;
	private String course;
	private String brach;
	private String yearofpass;
	private String skills;
	private String country;
	private String state;
	private String address;
	private String pincode;
	private String gender;
	private String aadharNo;
	private InputStream file;
	
	public Blob getFile;
	public InputStream getFile() {
		return file;
	}
	public void setFile(InputStream fileName) {
		this.file = fileName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getBrach() {
		return brach;
	}
	public void setBrach(String brach) {
		this.brach = brach;
	}
	public String getYearofpass() {
		return yearofpass;
	}
	public void setYearofpass(String yearofpass) {
		this.yearofpass = yearofpass;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
