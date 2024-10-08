package com.example.springboot_aws_deploy;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hamada")
public class api {
    @GetMapping("/roro")
    public String getData() {
        return "First message from alhusainy AWS Ecs";
    }

    @GetMapping("/bobo")
    public String getMessage() {
        return "Second message from Ya-Ali AWS Ecs";
    }
}
