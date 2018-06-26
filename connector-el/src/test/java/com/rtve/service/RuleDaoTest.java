package com.rtve.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.sql.Timestamp;
import java.util.Map;

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
		rule.setLocation_codes(lc);
		Rule rule2 = ruleDao.insertRule(rule);
		assertThat(rule2).isNotNull();
		ruleDao.deleteRuleById(rule2.getId_rule());
	}
	
	@Test
	public void deleteRuleTest() {
		
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
		rule.setLocation_codes(lc);
		Rule rule2 = ruleDao.insertRule(rule);
		int value = ruleDao.deleteRuleById(rule2.getId_rule());
		assertThat(value).isEqualTo(0);
		
	}
	
	@Test
	public void modifyRuleTest() {
		
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
		rule.setLocation_codes(lc);
		Rule rule2 = ruleDao.insertRule(rule);
		
		
		
		Rule ruleAux = new Rule();
		Asset assetAux = new Asset();
		assetAux.setAssetId(123454);
		assetAux.setTitle("Estoy Vivo");
		Program programAux = new Program();
		programAux.setProgramId(23423);
		programAux.setTitle("Estoy Vivo Capitulo 128");
		Season seasonAux = new Season();
		seasonAux.setSeasonId(34245);
		seasonAux.setTitle("Estoy Vivo Tercera Temporada");
		ruleAux.setId_rule("34221");
		Sgce sgceAux = new Sgce();
		sgceAux.setSgceId(2344);
		sgceAux.setTitle("Estoy Viv");
		ruleAux.setSeason(season);
		ruleAux.setProgram(program);
		ruleAux.setSgce(sgce);
		ruleAux.setAsset(asset);
		ruleAux.setPublish_date(new Timestamp(13102017111200L));
		ruleAux.setInit_date(new Timestamp(15102017000000L));
		ruleAux.setEnd_date(new Timestamp(15102017000000L));
		LocationCodes lcAux = new LocationCodes();
		lcAux.setLocation_codes_ok(new String [] {"ESP","GER"});
		lcAux.setLocation_codes_ko(new String [] {"POR","ENG"});
		lcAux.setLocation_groups_ok(new String [] {"GRP1","GRP2"});
		lcAux.setLocation_groups_ko(new String [] {"GRP3","GRP5"});
		ruleAux.setLocation_codes(lcAux);
		Map<String, Object> result = ruleDao.updateRuleById(rule2.getId_rule(), ruleAux);
		assertThat(result).isNotNull();
		ruleDao.deleteRuleById(rule2.getId_rule());
		
	}

    @SpringBootApplication
    static class TestConfiguration {
    }
    
}
