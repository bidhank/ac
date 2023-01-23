package com.bidhan.repo;

import com.bidhan.entity.TableC;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TableCRepo extends JpaRepository<TableC,Long> {
    TableC findByCode(String code);
}
