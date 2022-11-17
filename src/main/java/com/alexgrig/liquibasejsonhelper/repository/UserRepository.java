package com.alexgrig.liquibasejsonhelper.repository;

import com.alexgrig.liquibasejsonhelper.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query(nativeQuery = true, value = "SELECT * FROM users WHERE id > :idp")
    Page<User> findAll(@Param("idp") Integer id, Pageable pageable);
}
