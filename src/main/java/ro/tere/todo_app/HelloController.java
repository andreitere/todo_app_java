package ro.tere.todo_app;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.tere.todo_app.service.UserService;

@RestController
@RequestMapping("/api")
public class HelloController {

    @Autowired
    private UserService userService;

    @Operation(summary = "Say Hello", description = "Returns a simple 'Hello, World!' message", responses = {
            @ApiResponse(responseCode = "200", description = "Successful response"),
            @ApiResponse(responseCode = "500", description = "Internal server error")
    })
    @GetMapping("/hello")
    public Object sayHello() {
        return userService.getAllUsers();
    }
}