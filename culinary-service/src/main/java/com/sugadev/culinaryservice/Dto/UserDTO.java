package com.sugadev.culinaryservice.Dto;

import lombok.Data;

@Data
public class UserDTO {

    private int idUser;
    private String username;
    private String name;
    private int beratBadan;
    private int tinggiBadan;
   // private Set<RoleDTO> roles = new HashSet<>();



 //   public void addRole (RoleDTO userRole) { this.roles.add(userRole);}
}
