package com.example.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Task {

    private int id;
    private String name;
}
