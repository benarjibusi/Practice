package com.ben.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ben.model.Student;
import com.ben.studentdao.StudentDao;



@Service
public class StudentService {
	
	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	@Autowired
	 StudentDao studentDao;
	 
		


		

		public void saveStudent(Student Student) {
			studentDao.savestudentDao(Student);
		}
		
		public Student selectStudentByStudentId(int StudentId) {
			Student StudentById =studentDao.selectstudentBystudentIdDao(StudentId);
			return StudentById;
		}
		
		public List<Student> selectAllStudent(){
			List<Student> StudentList=studentDao.selectAllstudentDao();
			return StudentList;
		}
		
		public void deleteStudent(int StudentId) {
			studentDao.deletestudentDao(StudentId);
		}
		public void updatStudent(Student Student) {
			
		}


}
