package ru.serviceonappointment.controller.order;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.serviceonappointment.dto.OrderDto;
import ru.serviceonappointment.entity.OrderEntity;

import java.util.List;

/**
 * @author Savchenko on 10.03.2023
 */
@RestController
@RequestMapping(value = OrderController.REST_URL, produces = MediaType.APPLICATION_JSON_VALUE)
@Slf4j
public class OrderController extends AbstractOrderController {

    static final String REST_URL = "/api/v1/orders";

    @GetMapping
    public ResponseEntity<List<OrderDto>> getAll() {
        log.info("get all Orders");
        return ResponseEntity.ok(service.getAll().stream()
                .map(x -> mapper.orderDto(x))
                .toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderDto> get(@PathVariable Long id) {
        log.info("get order by id {}", id);
        OrderEntity orderEntity = service.getById(id);
        OrderDto orderDto = mapper.orderDto(orderEntity);
        return ResponseEntity.ok(orderDto);
    }
}