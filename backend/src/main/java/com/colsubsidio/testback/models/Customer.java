package com.colsubsidio.testback.models;

import lombok.Data;
import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String email;
    private String password;
    @OneToMany(mappedBy = "customer", orphanRemoval = true)
    private List<Phone> phones;
    private Boolean isActive;
    private LocalDateTime lastLogin;
    private LocalDateTime created;
    private LocalDateTime modified;
    private String token;
    @PrePersist
    public void setCreated() {
        this.created = LocalDateTime.now();
    }
    @PreUpdate
    public void setModified() {
        this.modified = LocalDateTime.now();
    }
}