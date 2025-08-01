package com.studyForger.Study_Forger.Role;

import com.studyForger.Study_Forger.User.User;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Role {

    @Id
    private String id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Roles roles;

    @ManyToMany(mappedBy = "roles",fetch = FetchType.LAZY)
    private List<User> users=new ArrayList<>();


    enum Roles{
        ADMIN,
        USER,
        GUEST
    }
}
