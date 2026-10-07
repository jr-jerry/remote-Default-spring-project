package com.example.demoproject.Controller;

import com.example.demoproject.DTO.DemoDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class DemoController {
    @PostMapping
    public DemoDTO post(@RequestBody DemoDTO dto) throws Exception {
        throw new Exception("compiler time exception occure ");
    }
    @ExceptionHandler(RuntimeException.class)
    public Map<String,String> handleRuntimeException(RuntimeException e){
        return Map.of("message",e.getMessage());
    }
    @ExceptionHandler(Exception.class)
    public Map<String,String> handleException(Exception e){
        return Map.of("message",e.getMessage());
    }
}
