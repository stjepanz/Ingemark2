package com.ingemark2.application.dto;

import com.ingemark2.application.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyUserDto {

    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private boolean active;
    private UUID uuid;
    private Long roleId;
}
