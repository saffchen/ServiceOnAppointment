package crmsystem.service;

import crmsystem.entity.OrderEntity;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import crmsystem.exception.NoEntityException;
import crmsystem.repositoty.OrderRepository;

import java.util.List;

/**
 * @author Savchenko on 10.03.2023
 */
@Slf4j
@Service
@AllArgsConstructor
public class OrderService {

    private OrderRepository orderRepository;

    public List<OrderEntity> getAll() {
        return orderRepository.findAll();
    }

    public OrderEntity getById(Long id) {
        return orderRepository.findById(id)
                .orElseThrow(() -> new NoEntityException("Order with id " + id + " is not found"));
    }

    public void save(OrderEntity orderEntity) {
        orderRepository.save(orderEntity);
    }

    public void delete(String name) {
        orderRepository.delete(name);
    }
}