package com.github.miyashy.springmasterslavedatabase.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "test_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestTable {

    @Id
    private int id;

    private String name;
}