package gnipaanton.clear_solutions_test_task.repository;

import gnipaanton.clear_solutions_test_task.repository.model.enitity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    List<UserEntity> findUserEntitiesByBirthdateBetween(String dateFrom, String dateTo);
}
