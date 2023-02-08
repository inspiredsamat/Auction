package kz.inspiredsamat.auction.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {

    @Id
    private String username;
    private String email;
    private String password;

    @OneToMany
    private List<Advert> adverts;
}
