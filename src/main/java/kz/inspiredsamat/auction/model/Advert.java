package kz.inspiredsamat.auction.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "adverts")
@Getter
@Setter
public class Advert {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    private int price;

    @OneToOne
    private Image image;
}
