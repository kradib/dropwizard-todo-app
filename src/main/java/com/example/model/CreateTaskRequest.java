package com.example.model;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateTaskRequest {

    private String name;
    private String description;
}
