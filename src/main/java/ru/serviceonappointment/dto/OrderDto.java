package ru.serviceonappointment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Savchenko on 10.03.2023
 */
@Data
@AllArgsConstructor
public class OrderDto {
    private Long id;
    private String name;
    private int price;
}
