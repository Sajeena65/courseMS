/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sajeena.course.dao.impl;

import com.sajeena.course.dao.courseDAO;
import com.sajeena.course.entity.course;

/**
 *
 * @author Admin
 */
public class courseDAOImpl implements courseDAO {
    private int count=0;
    private course[] courselist=new course[10];

    @Override
    public boolean insert(course st) {
 if(count==courselist.length){
        return false;
        }
    courselist[count]=st;
    count++;
    return true;
    }

    @Override
    public boolean delete(int id) {
for(int i=0;i<courselist.length;i++){
      course c=courselist[i];
      if(c!=null && c.getId()==id){
          courselist[i]=null;
          return true;
      }
              }
     return false;    }

    @Override
    public course getbyId(int id) {
 for(int i=0;i<courselist.length;i++){
      course c=courselist[i];
      if(c!=null && c.getId()==id){
        
          return c;
      }
              }
     return null;    }

    @Override
    public course[] getAll() {
                return courselist;

    }
 }

   

   
    

