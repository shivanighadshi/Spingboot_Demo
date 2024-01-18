package com.students.students;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
    private StudentRepo studentRepo;

	@Override
	public StudentPOJO createStud(StudentPOJO stud) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentPOJO getStudById(int studId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentPOJO> getAllUsers() {
		List<StudentPOJO> list = new ArrayList<StudentPOJO>();
		list.add(new StudentPOJO(1, "PRIYANKA", "Chembur"));
		list.add(new StudentPOJO(2, "Rajesh", "Dadar"));
		list.add(new StudentPOJO(3, "Yash", "Andheri"));
		
		studentRepo.saveAll(list);
		
		List<StudentPOJO> display = studentRepo.findAll();
		
		
		return display;
	}

   

}
