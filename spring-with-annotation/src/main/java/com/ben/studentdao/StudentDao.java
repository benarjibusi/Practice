package com.ben.studentdao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ben.model.Student;
import com.ben.util.ConnectionUtil;
@Repository
public class StudentDao {

	Student student ;
@Autowired
	private  ConnectionUtil util;

	

	

	public ConnectionUtil getUtil() {
	return util;
}

public void setUtil(ConnectionUtil util) {
	this.util = util;
}

	public void savestudentDao(Student student) {
		String insertQuery = "insert into student1 values (" + student.getsId() + "," + "'" + student.getsName()+ "'"+")";
 
		Connection con = null;
		Statement stmt = null;
		try {
			con = util.getConnection();
			stmt = con.createStatement();
			stmt.execute(insertQuery);
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Student selectstudentBystudentIdDao(int studentId) {
		String selectQuery = "select* from student1 where studentid=" + studentId;
		Connection con = null;
		Statement stmt = null;
		try {
			con = util.getConnection();
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(selectQuery);
			while (rs.next()) {
//				student student1 = new student();
				student.setsId(rs.getInt(1));
				student.setsName(rs.getString(2));
				
			}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return student;
	}

	public List<Student> selectAllstudentDao() {
		String selectQuery = "select* from student1 ";
		List<Student> studentList = new ArrayList<Student>();
		Connection con = null;
		Statement stmt = null;
		try {
			con = util.getConnection();
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(selectQuery);
			while (rs.next()) {
				Student student1 = new Student();
				student1.setsId(rs.getInt(1));
				student1.setsName(rs.getString(2));
				
				studentList.add(student1);
			}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return studentList;
	}

	public void deletestudentDao(int studentId) {
		String deleteQuery = "delete from student1 where studentid=" + studentId;
		Connection con = null;
		Statement stmt = null;
		try {
			con = util.getConnection();
			stmt = con.createStatement();
			stmt.execute(deleteQuery);
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updatstudentDao(Student student) {

	}

}
