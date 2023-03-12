package ru.serviceonappointment.controller.order;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import ru.serviceonappointment.mapper.OrderMapper;
import ru.serviceonappointment.service.OrderService;

/**
 * @author Savchenko on 10.03.2023
 */
@Slf4j
public class AbstractOrderController {

    @Autowired
    protected OrderMapper mapper;

    @Autowired
    protected OrderService service;
}