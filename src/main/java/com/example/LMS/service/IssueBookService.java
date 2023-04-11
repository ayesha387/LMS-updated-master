package com.example.LMS.service;
import com.example.LMS.entity.IssueBook;
import com.example.LMS.model.IssueBookModel;
import com.example.LMS.repository.IssueBookRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class IssueBookService {
    @Autowired
    private IssueBookRepo issueBookRepo;

    public IssueBook save(IssueBook issueBook) {
        return issueBookRepo.save(issueBook);
    }

    public IssueBook findById(Long id) {
        return issueBookRepo.findById(id).orElse(null);
    }

    public List<IssueBook> findAll() {
        return issueBookRepo.findAll();
    }

    public void deleteById(Long id) {
        issueBookRepo.deleteById(id);
    }
}
