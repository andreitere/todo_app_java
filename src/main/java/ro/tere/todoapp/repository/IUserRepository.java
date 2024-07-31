package ro.tere.todoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.tere.todoapp.entity.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {
}