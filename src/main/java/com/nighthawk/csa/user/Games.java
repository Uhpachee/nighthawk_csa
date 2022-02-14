package com.nighthawk.csa.user;

import javax.persistence.*;
@Entity
@Table(name= "data")

public class Games {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(nullable = false, unique = false)
    private int rating;
    @Column(length = 45, nullable = false)
    private String name;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Games{" +
                "id=" + Id +
                ", rating='" + rating + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
