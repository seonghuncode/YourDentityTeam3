package com.yourdentity.team3.controller;

import com.yourdentity.team3.entity.TestEntity;
import com.yourdentity.team3.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class TestController {

    private final TestRepository testRepository;

    @GetMapping("/test")
    public String test(){
        return "test";
    }

    @GetMapping("/test2")
    public String dbTest(){
        TestEntity testEntity = TestEntity.builder()
                .content("test")
                .build();
        testRepository.save(testEntity);
        return "test2";
    }

}
