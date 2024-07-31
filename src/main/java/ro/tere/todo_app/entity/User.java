package ro.tere.todo_app.entity;

import jakarta.persistence.*;
import ro.tere.todo_app.config.Constants;

import java.time.LocalDate;
import java.util.Date;


@Entity
@Table(schema = "todo_app_java")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false, length = 50)
    private String username;

    @Column(nullable = false, length = 100)
    private String password;

    @Column(nullable = false, unique = true, length = 100)
    private String email;

    @Column(nullable = false)
    private Date dateOfBirth;

    @Column(nullable = false)
    private Boolean active;

    // Constructors
    public User() {
    }

    public User(String username, String password, String email, Date dateOfBirth, Boolean active) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.active = active;
    }
}
