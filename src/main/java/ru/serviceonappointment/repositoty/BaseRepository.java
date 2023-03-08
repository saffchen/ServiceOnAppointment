package ru.serviceonappointment.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Savchenko on 08.03.2023
 */
public interface BaseRepository<T> extends JpaRepository<T, Long> {
}