/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sajeena.course;

import com.sajeena.course.dao.courseDAO;
import com.sajeena.course.dao.impl.courseDAOImpl;
import com.sajeena.course.entity.course;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         courseDAO coursedao = new courseDAOImpl();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("1.Enter name of course:");
            System.out.println("2.Delete record:");
            System.out.println("3.Show all:");
            System.out.println("4.Search by Id:");
            System.out.println("5.Exit");
            System.out.println("Enter your choice [1-5]:");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter student detail:");
                    course c=new course();
                    System.out.println("Enter Course ID: ");
                    c.setId(input.nextInt());
                    System.out.println("Enter Course Name: ");
                    c.setCoursename(input.next());
                    
                    System.out.println("Enter Institution: ");
                    c.setInstitution(input.next());
                    
                   System.out.println("Enter phone no:");
                    c.setContactNo(input.next());
                    System.out.println("Enter Price: ");
                    c.setPrice(input.nextInt());
                    System.out.println("Enter Time: ");
                    c.setTime(input.next());
                    
                    System.out.println("Enter Status: ");
                    c.setStatus(input.nextBoolean());
                    if(coursedao.insert(c)){
                        System.out.println("Inserted successfully");
                        
                    }else
                        System.out.println("Data Full");
                    break;
                case 2:
                     System.out.println("Enter the Id to delete: ");
                    int id= input.nextInt();
                    if (coursedao.delete(id)) {
                        System.out.println("Id No " + id + " is deleted successfully.");
                    } else {
                        System.out.println("Id not found.");
                    }

                    break;
                case 3:
                    System.out.println("Listing all student:");
                    course[] cs=coursedao.getAll();
                    for(int i=0;i<cs.length;i++){
                        course a=cs[i];
                      if(a!=null){
                         System.out.println("Id:"+a.getId());
                         System.out.println("Name:"+a.getCoursename());
                         System.out.println("Institution:"+a.getInstitution());
                         System.out.println("Phone no:"+a.getContactNo());
                         System.out.println("Time:"+a.getTime());
                         System.out.println("Status:"+a.isStatus());
                         
                      }  
                    }
                    break;
                case 4:
                    System.out.println("Enter Id of course:");
                    int a= input.nextInt();
                    course x=coursedao.getbyId(a);
                  
                         System.out.println("Id:"+x.getId());
                         System.out.println("Name:"+x.getCoursename());
                         System.out.println("Institution:"+x.getInstitution());
                         System.out.println("Phone no:"+x.getContactNo());
                         System.out.println("Time:"+x.getTime());
                         System.out.println("Status:"+x.isStatus());
                         
                       
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }

}

    
    

