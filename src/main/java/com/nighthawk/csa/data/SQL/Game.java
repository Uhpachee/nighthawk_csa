package com.nighthawk.csa.data.SQL;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Game {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int rating;

    public Game() {
    }
    public Game(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    public String getFirstName() {
        return name;
    }

    public void setFirstName(String name) {
        this.name = name;
    }

    public int getLastName() {
        return rating;
    }

    public void setLastName(int rating) {
        this.rating = rating;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", Gamenameis'" + name + '\'' +
                ", ratingis'" + rating + '\'' +
                '}';
    }
}



