package com;


import com.dao.StudentDao;
import com.github.pagehelper.PageHelper;
import com.javase.Student;
import com.util.MyBatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyApp {
    public static void main(String[] args) {
//        String config = "mybatis.xml";
//        InputStream in = Resources.getResourceAsStream("mybatis.xml");
//        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
//        SqlSessionFactory factory = builder.build(in);
//        SqlSession sqlSession = factory.openSession();
//        String sqlId = "com.dao.StudentDao.selectStudents";
//        List<Student> students = sqlSession.selectList(sqlId);
//        for (Student  student: students) {
//            System.out.println(student);
//        }
//        sqlSession.close();
//    }
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        PageHelper.startPage(1,1);
        List<Student> lists = dao.selectStudents();
        for (Student student : lists) {
            System.out.println(student);
        }
    }
}