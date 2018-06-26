package com.rtve.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rtve.model.Rule;
import com.rtve.repository.RuleDao;

@RestController
@RequestMapping("/rule")
public class RuleController {

    private RuleDao ruleDao;

    public RuleController(RuleDao ruleDao) {
        this.ruleDao = ruleDao;
    }

    @PostMapping
    public Rule insertRule(@RequestBody Rule rule) throws Exception{
        return ruleDao.insertRule(rule);
    }

    @GetMapping("/{id}")
    public Map<String, Object> getRuleById(@PathVariable String id){
        return ruleDao.getRuleById(id);
    }

    @PutMapping("/{id}")
    public Map<String, Object> updateBookById(@RequestBody Rule rule, @PathVariable String id){
        return ruleDao.updateRuleById(id, rule);
    }

    @DeleteMapping("/{id}")
    public void deleteRuleById(@PathVariable String id){
         ruleDao.deleteRuleById(id);
    }
}
