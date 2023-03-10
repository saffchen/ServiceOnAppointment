package ru.serviceonappointment.entity;

import lombok.*;

import javax.persistence.*;

/**
 * @author Savchenko on 10.03.2023
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "order")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nameService", nullable = false)
    private String nameService;

    @Column(name = "price", nullable = false)
    private int price;
}
