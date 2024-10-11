package com.example.lab10;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("/users")
    public String getAllUsers(Model model) {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "Cesar", "Nuñez", "150604", "cesar@gmail.com"));
        users.add(new User(2, "Eduardo", "Barriga", "120803", "eduardo@gmail.com"));
        users.add(new User(3, "Camila", "Medina", "150605", "camila@gmail.com"));

        model.addAttribute("users", users);

        return "users";
    }
}
