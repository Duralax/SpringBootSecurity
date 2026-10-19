package ru.davydov.Security2DBThymeleaf.service;

import ru.davydov.Security2DBThymeleaf.dto.UserDto;
import ru.davydov.Security2DBThymeleaf.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
