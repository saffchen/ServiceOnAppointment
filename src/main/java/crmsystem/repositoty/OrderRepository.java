package crmsystem.repositoty;

import crmsystem.entity.OrderEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * @author Savchenko on 10.03.2023
 */
@Repository
@Transactional
public interface OrderRepository extends BaseRepository<OrderEntity> {
    Optional<OrderEntity> findById(Long id);
}