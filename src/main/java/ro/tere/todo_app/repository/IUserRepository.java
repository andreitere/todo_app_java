package ro.tere.todo_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.tere.todo_app.entity.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {
}