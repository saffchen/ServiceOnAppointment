package crmsystem.mapper;

import crmsystem.dto.OrderDto;
import crmsystem.entity.OrderEntity;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

/**
 * @author Savchenko on 10.03.2023
 */
@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.FIELD)
public interface OrderMapper {
    OrderDto orderDto(OrderEntity orderEntity);
}