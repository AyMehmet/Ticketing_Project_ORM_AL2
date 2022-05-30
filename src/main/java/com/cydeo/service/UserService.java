package com.cydeo.service;

import com.cydeo.dto.UserDTO;
import com.cydeo.entity.User;

import java.util.List;

public interface UserService  {

    List<UserDTO> listAllUsers();
    UserDTO findbyUserName(String username);
    UserDTO update(Long id);
    void save(UserDTO user);

    void deleteById(String username);
}
