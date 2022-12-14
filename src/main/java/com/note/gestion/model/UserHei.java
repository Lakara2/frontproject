package com.note.gestion.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;
import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Objects;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserHei {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long idUser;

    private String firstName;

    private String lastName;

    private String email;

    private String ref;

    @Transient
    private Float studentAverage;

    private Status status;

    private String phone;

    private LocalDate birthDate;

    private Instant entranceDatetime;

    private Sex sex;

    private String address;

    @Column(name = "\"role\"")
    private Role role;

    @ManyToOne
    private Group group;

    public enum Sex {
        M, F
    }

    public enum Status {
        ENABLED, DISABLED
    }

    public enum Role {
        STUDENT, TEACHER, MANAGER
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        UserHei user = (UserHei) o;
        return idUser != null && Objects.equals(idUser, user.idUser);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}

