package com.example.LMS.service;

import com.example.LMS.entity.Member;
import com.example.LMS.model.MemberModel;

import java.util.List;

public interface MemberService {

    Member save(MemberModel memberModel);
    List<Member> findAll();

    Member findById(Long id);

    void delete(Long id);
}

