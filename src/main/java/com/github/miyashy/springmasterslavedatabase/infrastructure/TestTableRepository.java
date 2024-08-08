package com.github.miyashy.springmasterslavedatabase.infrastructure;

import com.github.miyashy.springmasterslavedatabase.domain.TestTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TestTableRepository extends JpaRepository<TestTable, Integer> {
    @Modifying
    @Query(value = "insert into test_table (id, name) values (:#{#testTable.id}, :#{#testTable.name})", nativeQuery = true)
    void insert(TestTable testTable);
}