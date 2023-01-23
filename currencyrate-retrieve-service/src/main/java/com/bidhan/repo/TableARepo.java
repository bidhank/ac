package com.bidhan.repo;

import com.bidhan.entity.TableA;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TableARepo extends JpaRepository<TableA,Long> {
    TableA findByCode(String code);
}
