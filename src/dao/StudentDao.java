package dao;

import java.sql.ResultSet;

public class StudentDao extends Dao {

	private String baseSql;

	public Student get(String no) throws Exception {

	}

	private List<Student> postFilter(ResultSet rSet, School school) throws Exception {

	}

	private List<Student> filter(School school, int entYear, String classNum, boolean isAttend) throws Exception {

	}

	private List<Student> filter(School school, int entYear, boolean isAttend) throws Exception {

	}

	private List<Student> filter(School school, boolean isAttend) throws Exception {

	}

	public boolean save(Student student) throws Exception {

	}

}