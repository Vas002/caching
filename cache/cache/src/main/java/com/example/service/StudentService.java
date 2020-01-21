package com.example.service;

import com.example.model.Student;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import com.example.model.Student;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentService
{
    @Cacheable("student")
    public Object getStudentByID(int id)
    {
       /* Student s=null;
                Student s1=null;
        List<Student> s2= Arrays.asList(
                new Student(1,"Vishal","jnu"),
                new Student(2,"navneet","jamiya"),
                new Student(3,"mayuri","DU"),
                new Student(4,"sujaya","SRM"),
                new Student(5,"kush","VIT"));*/
        try
        {
            System.out.println("Going to sleep for 5 Secs.. to simulate backend call.");
            Thread.sleep(1000*5);
           /* for(int i=1;i<=id;i++){
                if(s2.get(id).equals(id))
                {
                    return s2;
                }
            }*/
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        return new Student(id,"Sajal" ,"V");
       /* return s1;*/
    }
   /* public List<Student> getAllStudents(){
        return Arrays.asList(
                new Student(1,"Vishal","jnu"),
                new Student(2,"navneet","jamiya"),
                new Student(3,"mayuri","DU"),
                new Student(4,"sujaya","SRM"),
                new Student(5,"kush","VIT")
        );*/
    }

