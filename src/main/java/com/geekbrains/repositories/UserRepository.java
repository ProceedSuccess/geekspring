package com.geekbrains.repositories;

import com.geekbrains.entities.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {
    public User findOneById(long id);
    public User findOneByUserName(String name);
}
