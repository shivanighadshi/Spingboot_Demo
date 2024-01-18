package com.students.students;

import java.util.List;

public interface StudentService {

	StudentPOJO createStud(StudentPOJO stud);

	StudentPOJO getStudById(int studId);

    List<StudentPOJO> getAllUsers();

}