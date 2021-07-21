package com.akhilesh.expensetrackerapi.services;

import com.akhilesh.expensetrackerapi.domain.User;
import com.akhilesh.expensetrackerapi.exceptions.EtAuthException;

public interface UserService {

    User validateUser(String email, String password) throws EtAuthException;

    User registerUser(String firstName, String lastName, String email, String password ) throws EtAuthException;

}
