package crmsystem.controller.order;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import crmsystem.mapper.OrderMapper;
import crmsystem.service.OrderService;

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