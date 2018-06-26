package com.rtve.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.sql.Timestamp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rtve.app.ElasticSearchConfiguration;
import com.rtve.model.Asset;
import com.rtve.model.LocationCodes;
import com.rtve.model.Program;
import com.rtve.model.Rule;
import com.rtve.model.Season;
import com.rtve.model.Sgce;
import com.rtve.repository.RuleDao;

@RunWith(SpringRunner.class)
//@SpringBootTest("service.message=Hello")
@SpringBootTest
@ContextConfiguration(classes = {RuleDao.class, ObjectMapper.class, ElasticSearchConfiguration.class})
public class RuleDaoTest {

	@Autowired
    private RuleDao ruleDao;

	@Test
	public void insertRuleTest() {
		Rule rule = new Rule();
		Asset asset = new Asset();
		asset.setAssetId(123454);
		asset.setTitle("Estoy Vivo");
		Program program = new Program();
		program.setProgramId(23423);
		program.setTitle("Estoy Vivo Capitulo 128");
		Season season = new Season();
		season.setSeasonId(34245);
		season.setTitle("Estoy Vivo Tercera Temporada");
		rule.setId_rule("34221");
		Sgce sgce = new Sgce();
		sgce.setSgceId(2344);
		sgce.setTitle("Estoy Viv");
		rule.setSeason(season);
		rule.setProgram(program);
		rule.setSgce(sgce);
		rule.setAsset(asset);
		rule.setPublish_date(new Timestamp(13102017111200L));
		rule.setInit_date(new Timestamp(15102017000000L));
		rule.setEnd_date(new Timestamp(15102017000000L));
		LocationCodes lc = new LocationCodes();
		lc.setLocation_codes_ok(new String [] {"ESP","GER"});
		lc.setLocation_codes_ko(new String [] {"FRG","ENG"});
		lc.setLocation_groups_ok(new String [] {"GRP1","GRP2"});
		lc.setLocation_groups_ko(new String [] {"GRP3","GRP5"});	
		Rule rule2 = ruleDao.insertRule(rule);
		assertThat(rule2).isNotNull();

	}
	


    @SpringBootApplication
    static class TestConfiguration {
    }
    
}
