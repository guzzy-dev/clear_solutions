package gnipaanton.clear_solutions_test_task.service;

import gnipaanton.clear_solutions_test_task.repository.UserRepository;
import gnipaanton.clear_solutions_test_task.repository.model.enitity.UserEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserEntity save(UserEntity user){
        userRepository.save(user);
        return user;
    }
}
