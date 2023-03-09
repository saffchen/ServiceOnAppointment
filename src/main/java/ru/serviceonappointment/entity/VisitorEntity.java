package ru.serviceonappointment.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "visitor")
public class VisitorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(name = "login", nullable = false)
    private String login;

    @Size(min = 2, max = 100)
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @NotBlank
    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;
}