package com.robomq.pojo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MobileMapper implements RowMapper<Mobile>{

	public Mobile mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Mobile mobile = new Mobile();
		mobile.setId(rs.getInt("id"));
		mobile.setName(rs.getString("name"));
		mobile.setPrice(rs.getFloat("price"));
		mobile.setQty(rs.getInt("qty"));
		mobile.setDesc(rs.getString("desc"));
		return mobile;
	}

}
