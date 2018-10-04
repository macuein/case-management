package org.mik.cm.server.repository;

import org.mik.cm.server.domain.Organization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class OrganizationJdbcRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    class OrganizationRowMapper implements RowMapper<Organization> {
        @Override
        public Organization mapRow(ResultSet rs, int rowNum) throws SQLException {
            Organization org = new Organization();
            org.setOrg_id(rs.getInt("org_id"));
            org.setOrg_code(rs.getString("org_code"));
            org.setOrg_description(rs.getString("org_description"));
            return org;
        }

    }

    public List<Organization> findAll() {
        return jdbcTemplate.query("select * from organizations", new OrganizationRowMapper());
    }

    public Organization findById(Integer id) {
        return jdbcTemplate.queryForObject("select * from organizations where org_id=?", new Object[] { id },
            new BeanPropertyRowMapper<Organization>(Organization.class));
    }

    public int deleteById(long id) {
        //return jdbcTemplate.update("delete from student where id=?", new Object[] { id });
        return 1;
    }

    public int insert(Organization org) {
        //return jdbcTemplate.update("insert into student (id, name, passport_number) " + "values(?,  ?, ?)",
        //    new Object[] { student.getId(), student.getName(), student.getPassportNumber() });
        return 1;
    }

    public int update(Organization org) {
        //return jdbcTemplate.update("update student " + " set name = ?, passport_number = ? " + " where id = ?",
        //    new Object[] { student.getName(), student.getPassportNumber(), student.getId() });
        return 1;
    }



}
