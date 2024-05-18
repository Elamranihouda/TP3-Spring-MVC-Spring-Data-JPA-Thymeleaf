package ma.fsm.hopital.security.service;

import ma.fsm.hopital.security.entities.AppRole;
import ma.fsm.hopital.security.entities.AppUser;

public interface AccountService {
    AppUser addNewUser(String username, String password,String email,String confirmPassword);
    AppRole addNewRole(String role);
    void addRoleToUser(String username, String role);
    void removeRoleFromUser(String username, String role);
    AppUser loadUserByUsername(String username);
}
