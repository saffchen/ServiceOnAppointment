package ru.serviceonappointment.repositoty;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.serviceonappointment.entity.OrderEntity;

import java.util.Optional;

/**
 * @author Savchenko on 10.03.2023
 */
@Repository
@Transactional
public interface OrderRepository extends BaseRepository<OrderEntity> {
    Optional<OrderEntity> findById(Long id);
}