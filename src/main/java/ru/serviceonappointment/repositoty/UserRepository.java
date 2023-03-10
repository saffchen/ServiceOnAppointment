package ru.serviceonappointment.repositoty;


import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.serviceonappointment.entity.VisitorEntity;

@Repository
@Transactional
@EnableJpaRepositories
public interface UserRepository extends BaseRepository<VisitorEntity> {
}