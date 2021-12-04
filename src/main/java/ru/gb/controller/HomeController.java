package ru.gb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // контроллер - это бин, который общается с диспатчер-сервлетом и обрабатывает пришедший на него запрос
public class HomeController {

    // http://localhost:8080/app/ GET
    @GetMapping("/") // аннотация для контроллеров, которая показывает, по какому пути будет доступна эта страница
    public String getIndexPage() {
        return "index"; // название темплейта, который будем возвращать
    }
}
