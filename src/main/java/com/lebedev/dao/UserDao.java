package com.lebedev.dao;


import com.lebedev.entity.TicketEntity;
import com.lebedev.entity.UserEntity;

import java.util.List;
import java.util.Optional;

public interface UserDao {

    List<UserEntity> findAllUser();

    Optional<UserEntity> findUserById(Long id);

    Optional<UserEntity> findUserByName(String name);

    boolean saveUser(UserEntity user);

    boolean updateUser(UserEntity user);

    boolean deleteUser(UserEntity user);

    void addTicketToUser(UserEntity user, TicketEntity ticket);
}
