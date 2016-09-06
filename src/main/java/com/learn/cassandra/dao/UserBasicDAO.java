package com.learn.cassandra.dao;

import java.util.List;

import com.learn.cassandra.entity.UserBasic;

/**
 * DAO interface for Employee to perform CRUD operation.
 * @author Ranga Reddy
 * @version 1.0
 */
public interface UserBasicDAO {
    /**
     * Used to Create the Employee Information
     * @param employee
     * @return {@link Employee}
     */
    public UserBasic createUserBasic(UserBasic employee);
    
    /**
     * Getting the Employee Information using Id
     * @param id
     * @return {@link Employee}
     */
    public UserBasic getUserBasic(int id);
    
    /**
     * Used to Update the Employee Information
     * @param employee
     * @return {@link Employee}
     */
    
    public UserBasic updateUserBasic(UserBasic employee);
    
    /**
     * Deleting the Employee Information using Id
     * @param id
     */
    public void deleteUserBasic(int id);
    
    /**
     * Getting the All Employees information
     * @return
     */
    public List<UserBasic> getAllUserBasics();
}