package ru.serviceonappointment.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Savchenko on 08.03.2023
 */
@NoRepositoryBean
public interface BaseRepository<T> extends JpaRepository<T, Long> {

    @Transactional
    @Modifying
    @Query("DELETE FROM #{#entityName} u WHERE u.name=:name")
    String delete(@Param("name") String name);
}