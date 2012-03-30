package org.cse.springtute;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleStudentRepository implements StudentRepository {

	private Map<Long, Student> studentsDb = new HashMap<Long, Student>();

	@Override
	public void saveStudent(Student stu) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteStudent(Student stu) {
		// TODO Auto-generated method stub

	}

	@Override
	public Student findStudent(long regNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateStudent(Student stu) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Student> findAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

}
