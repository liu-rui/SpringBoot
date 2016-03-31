package com.myhpc365.dns.repositoryImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.myhpc365.dns.repository.RecordRespository;

@Repository
public class RecordRepositoryImpl implements RecordRespository {

	@Autowired
	private JdbcTemplate jdbcTemplate;/*

	@Override
	public int addSoa(SoaRecord item) {
		return jdbcTemplate.update(
				"INSERT INTO `records` (`id`,`zone`, `ttl`, `type`, `host`, `mx_priority`,`data`, `primary_ns`,`resp_contact`, `serial`, `refresh`, `retry`,`expire`, `minimum`) VALUES  (uuid(),?,?, 'SOA', '@', NULL, NULL,?,?,2011043001, 10800, 7200, 604800, 86400)",
				item.getZone(), item.getTtl(), item.getPrimaryNs(), item.getContact());
	}

	@Override
	public String getSoaId(String zone) {
		try {
			return jdbcTemplate.queryForObject("SELECT `id` FROM `records` where `zone`=? and `type`='SOA' limit 1",
					String.class, zone);
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

	@Override
	public Record getDns(String id) {
		return jdbcTemplate.queryForObject(
				"SELECT `id`,`zone`, `ttl`, `type`, `host`,`data` FROM `records` where `id`=? limit 1",
				new BeanPropertyRowMapper<Record>(Record.class), id);
	}

	@Override
	public int addDns(Record record) {
		return jdbcTemplate.update(
				"INSERT INTO `records` (`id`,`zone`, `ttl`, `type`, `host`, `mx_priority`,`data`, `primary_ns`,`resp_contact`, `serial`, `refresh`, `retry`,`expire`, `minimum`) VALUES (?,?,?,?,?, NULL,?, NULL,NULL, NULL,NULL, NULL, NULL, NULL)",
				record.getId(), record.getZone(), record.getTtl(), record.getType(), record.getHost(),
				record.getData());
	}

	@Override
	public int updateDns(Record record) {
		return jdbcTemplate.update("update `records` set `zone`=?,`ttl`=?,`type`=?,`host`=?,`data`=? 	where id=?",
				record.getZone(), record.getTtl(), record.getType(), record.getHost(), record.getData(),
				record.getId());
	}

	@Override
	public int deleteDns(String id) {
		return jdbcTemplate.update("delete from `records` where id=?", id);
	}*/
}
