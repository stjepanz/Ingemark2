package com.ingemark2.firstTimeInitialization;

import com.ingemark2.application.entity.Role;
import com.ingemark2.application.service.MyUserService;
import com.ingemark2.application.service.RoleService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CreateDefaultUserAndRoles implements CommandLineRunner {

    private final MyUserService myUserService;
    private final RoleService roleService;

    public CreateDefaultUserAndRoles(MyUserService myUserService, RoleService roleService) {
        this.myUserService = myUserService;
        this.roleService = roleService;
    }


    @Override
    public void run(String... args){

//        Create Roles
        roleService.createRole("ROLE_ADMIN", 1L);
        roleService.createRole("ROLE_EMPLOYEE", 2L);
        roleService.createRole("ROLE_USER", 3L);

//        Create MyUser with ROLE_ADMIN
        Role role = roleService.findByRole("ROLE_ADMIN");
        myUserService.createMyUser("stjepan@mail.hr", "Stjepan", "Zjacic", "stjepan", role);
        myUserService.createMyUser("ingemark@mail.hr", "Ingemark", "Ingemark", "ingemark", role);
    }
}
