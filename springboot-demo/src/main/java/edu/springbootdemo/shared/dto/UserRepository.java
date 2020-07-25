package edu.springbootdemo.shared.dto;

import edu.springbootdemo.edu.springbootdemo.model.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {
}
