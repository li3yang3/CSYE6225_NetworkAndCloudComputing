package courseservice.studentDAO;

import java.util.List;

public class Course {
	private String courseId;
	private String courseName;
	private List<Lecture> lectureList;
	private Board board;
	private Roster roster;
	private List<String> studentIds;
	
	public List<String> getStudentIds() {
		return studentIds;
	}
	public void setStudentIds(List<String> studentIds) {
		this.studentIds = studentIds;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public List<Lecture> getLectureList() {
		return lectureList;
	}
	public void setLectureList(List<Lecture> lectureList) {
		this.lectureList = lectureList;
	}
	public Board getBoard() {
		return board;
	}
	public void setBoard(Board board) {
		this.board = board;
	}
	public Roster getRoster() {
		return roster;
	}
	public void setRoster(Roster roster) {
		this.roster = roster;
	}

}
