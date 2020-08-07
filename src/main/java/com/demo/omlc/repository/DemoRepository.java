package com.demo.omlc.repository;


import com.demo.omlc.config.DemoConfig;
import com.demo.omlc.modal.Shipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class DemoRepository {

    @Autowired
    NamedParameterJdbcTemplate jdbcTemplate;

    @Autowired
    DemoConfig demoConfig;
    public List<Shipment> getOMLCData(String dateQuery) {

        String sql = demoConfig.getOmlc();

        RowMapper<Shipment> rowMapper = new RowMapper() {
            @Override
            public Shipment mapRow(ResultSet resultSet, int i) throws SQLException {
                Shipment shipment = new Shipment();
                shipment.setShipdate(resultSet.getString("shipdate"));
                shipment.setEom_sent_count(resultSet.getString("eom_sent_count"));
               shipment.setWcs_db_name(resultSet.getString("wcs_db_name"));

                return shipment;
            }
        };

        Map<String, String> param = new HashMap<>();

        param.put("shipdate", dateQuery);


        List<Shipment> res = jdbcTemplate.query(sql, param,rowMapper);
        return res;
    }


}
