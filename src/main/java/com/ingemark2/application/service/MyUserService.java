package com.ingemark2.application.service;


import com.ingemark2.application.dto.MyUserDto;
import com.ingemark2.application.entity.MyUser;
import com.ingemark2.application.entity.Role;

import java.util.List;
import java.util.UUID;

public interface MyUserService {
    Object getUsers(Integer pageSize, Integer pageNumber, String search, Integer sortBy, Integer sortDirection);

    void newUsers(List<MyUserDto> myUserDtos);

    void updateUser(MyUserDto myUserDto);

    void deleteUser(UUID userUuid);

    void suspendUser(UUID userUuid);

    void createMyUser(String username, String firstName, String lastName, String password, Role role);
}
