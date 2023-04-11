package com.example.LMS.controller;

import com.example.LMS.entity.Member;
import com.example.LMS.model.MemberModel;
import com.example.LMS.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/members")
public class MemberController {
    @Autowired
    private MemberService memberService;
    @PostMapping("/saveMembers")
    public Member save(@RequestBody MemberModel memberModel) {
        return memberService.save(memberModel);
    }
    @GetMapping("/list")
    public List<Member> findAll() {
        return memberService.findAll();
    }
    @GetMapping("/{id}")
    public Member findById(@PathVariable Long id) {
        return memberService.findById(id);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        memberService.delete(id);
    }
}


