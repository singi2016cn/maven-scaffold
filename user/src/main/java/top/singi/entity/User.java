package top.singi.entity;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class User {
    Long id;
    String name;
    String email;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;
}
