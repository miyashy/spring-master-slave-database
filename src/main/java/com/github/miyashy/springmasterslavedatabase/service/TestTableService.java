package com.github.miyashy.springmasterslavedatabase.service;

import com.github.miyashy.springmasterslavedatabase.domain.TestTable;
import com.github.miyashy.springmasterslavedatabase.infrastructure.TestTableRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class TestTableService {
    private final TestTableRepository testTableRepository;

    @Transactional
    public void saveTestTable(Integer id) {
        testTableRepository.save(new TestTable(id, "test"));
    }

    // この処理は参照用のDBに書き込みを行嘔吐するためにエラーとなる。
    @Transactional(readOnly = true)
    public void saveErrorTestTable(Integer id) {
        // JPAの場合、saveを利用するとDatasourceを見て書き込み不可の場合はinsertを行わないため、エラーとならないため明示できにinsertを利用する
        testTableRepository.insert(new TestTable(id, "test"));
    }

    @Transactional(readOnly = true)
    public TestTable findTestTable(Integer id) {
        return testTableRepository.findById(id).orElseThrow(RuntimeException::new);
    }

}
