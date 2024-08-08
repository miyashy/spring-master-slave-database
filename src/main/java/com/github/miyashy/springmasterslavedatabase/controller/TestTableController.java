package com.github.miyashy.springmasterslavedatabase.controller;

import com.github.miyashy.springmasterslavedatabase.domain.TestTable;
import com.github.miyashy.springmasterslavedatabase.service.TestTableService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class TestTableController {
    private final TestTableService testTableService;

    @PostMapping("/testTable/{id}")
    public void postTestTable(@PathVariable("id") Integer id) {
        testTableService.saveTestTable(id);
    }

    @PostMapping("/testTable/{id}/error")
    public void postTestTableError(@PathVariable("id") Integer id) {
        testTableService.saveErrorTestTable(id);
    }


    @GetMapping("/testTable/{id}")
    public TestTable getTestTable(@PathVariable("id") Integer id) {
        return testTableService.findTestTable(id);
    }
}
