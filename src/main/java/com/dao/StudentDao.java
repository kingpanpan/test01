package com.dao;

import com.javase.Student;

import java.util.List;

public interface StudentDao {
    public List<Student> selectStudents();
    public int insertStudent();
}
