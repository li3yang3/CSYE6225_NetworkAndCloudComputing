package data;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Singleton;

import courseservice.studentDAO.Board;
import courseservice.studentDAO.Lecture;
import courseservice.studentDAO.Roster;
import creator.CourseCreator;
import creator.StudentCreator;

@Singleton
public class Data {
	private static Map<String, StudentCreator> STUDENT_DATA = new HashMap<>();
	private static Map<String, CourseCreator> COURSE_DATA = new HashMap<>();

			
	public Data() {
		STUDENT_DATA.put("stu1", new StudentCreator("John", "http://profile1.img",
				Arrays.asList("INFO3400", "INFO3500"), "info"));
	
		COURSE_DATA.put("INFO3400",new CourseCreator("Cloud Computing", Arrays.asList(new Lecture()),
			new Board(), new Roster(), Arrays.asList("stu1")));
	};
	
			
	public Map<String, StudentCreator> getSTUDENT_DATA() {
		return STUDENT_DATA;
	}

	public Map<String, CourseCreator> getCOURSE_DATA() {
		return COURSE_DATA;
	}		
}
