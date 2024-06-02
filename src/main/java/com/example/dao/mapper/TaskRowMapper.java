package com.example.dao.mapper;

import com.example.model.Task;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TaskRowMapper implements RowMapper<Task> {


    @Override
    public Task map(ResultSet rs, StatementContext ctx) throws SQLException {
        return Task.builder()
                .name(rs.getString("name"))
                .id(rs.getInt("id"))
                .build();
    }
}
