package com.suturn.domain.model;

import com.suturn.domain.common.Role;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Builder
public class User {
    private String id;
    private String name;
    private String email;
    private Role role;
    private String phone_number;
}
