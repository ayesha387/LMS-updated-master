package com.example.LMS.service;

import com.example.LMS.entity.Member;
import com.example.LMS.model.MemberModel;
import com.example.LMS.repository.MemberRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MemberRepo memberRepo;

    @Override
    public Member save(MemberModel memberModel) {
        return memberModel.assemble(memberRepo.save(memberModel.disassemble())).disassemble();
    }

    @Override
    public List<Member> findAll() {
        return memberRepo.findAll();
    }

    @Override
    public Member findById(Long id) {
        return memberRepo.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        memberRepo.deleteById(id);
    }
}
