package ru.itis.taxi.models;

import lombok.*;

import java.net.URL;
import java.util.List;

/**
 * 04.09.2018
 * User
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
@Getter
@Setter
@Builder
@EqualsAndHashCode
@ToString
public class User {

    private Long id;

    private String phone;
    private String hashPassword;

    private String firstName;
    private String lastName;
    private String email;
    private URL photo;

    private Role role;
    private List<Authority> authorities;

    // for manager
    private List<User> clients;
    // for admin
    private List<User> managers;
    // as user
    private List<Taxi> favoritesTaxis;

    public boolean isAdmin() {
        return role.equals(Role.ADMIN);
    }

    public class InnerManager {
        public List<User> getClients() {
            return clients;
        }
    }

    public class InnerUser {
        public List<Taxi> getFavoritesPizzas() {
            return favoritesTaxis;
        }
    }

    public class InnerAdmin {
        public List<User> getManagers() {
            return managers;
        }
    }

    public InnerManager asManager() {
        return new InnerManager();
    }

    public InnerAdmin asAdmin() {
        return new InnerAdmin();
    }

    public InnerUser asUser() {
        return new InnerUser();
    }

}
