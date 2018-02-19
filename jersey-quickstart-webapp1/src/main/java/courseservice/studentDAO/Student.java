package courseservice.studentDAO;

import java.util.List;

public class Student {
	private String studentName;
	private String studentId;
	private String imageUrl;
	private List<String> enrolledCourse;
	private String enrolledProgram;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public List<String> getEnrolledCourse() {
		return enrolledCourse;
	}
	public void setEnrolledCourse(List<String> enrolledCourse) {
		this.enrolledCourse = enrolledCourse;
	}
	public String getEnrolledProgram() {
		return enrolledProgram;
	}
	public void setEnrolledProgram(String enrolledProgram) {
		this.enrolledProgram = enrolledProgram;
	}
}
 