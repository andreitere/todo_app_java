package ro.tere.todoapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class TodoAppApplicationTests {

    @Autowired
    private HelloController controller;

    @Test
    void contextLoads() throws Exception {
        assertThat(controller).isNotNull();
        assertThat(controller.sayHello()).isEqualTo("Hello, World!");
    }

}
