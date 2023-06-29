package com.example.legion.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Ban {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long userWhoBans, userWhoIsBanned;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserWhoBans() {
        return userWhoBans;
    }

    public void setUserWhoBans(Long userWhoBans) {
        this.userWhoBans = userWhoBans;
    }

    public Long getUserWhoIsBanned() {
        return userWhoIsBanned;
    }

    public void setUserWhoIsBanned(Long userWhoIsBanned) {
        this.userWhoIsBanned = userWhoIsBanned;
    }
}
