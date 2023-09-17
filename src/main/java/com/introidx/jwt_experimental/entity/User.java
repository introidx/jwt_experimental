package com.introidx.jwt_experimental.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.converter.StringHttpMessageConverter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    private String userId;
    private String name;
    private String email;
}
