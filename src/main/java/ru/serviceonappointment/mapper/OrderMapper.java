package ru.serviceonappointment.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import ru.serviceonappointment.dto.OrderDto;
import ru.serviceonappointment.entity.OrderEntity;

/**
 * @author Savchenko on 10.03.2023
 */
@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.FIELD)
public interface OrderMapper {
    OrderDto orderDto(OrderEntity orderEntity);
}