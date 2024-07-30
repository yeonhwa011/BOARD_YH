package org.choongang.practice.board.controllers;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class RequestPost {
    private Long id;

    @NotBlank
    private String title;

    @NotBlank
    private String content;
}


