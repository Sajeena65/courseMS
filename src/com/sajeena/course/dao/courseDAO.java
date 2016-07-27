/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sajeena.course.dao;

import com.sajeena.course.entity.course;

/**
 *
 * @author Admin
 */
public interface courseDAO {
    boolean insert(course st);
    boolean delete(int id);
    course getbyId(int id);
    course[] getAll();
    
}
