package com.example.dao;

import com.example.model.Task;
import io.dropwizard.db.DataSourceFactory;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public interface TaskDao {



    @SqlQuery("SELECT * FROM TASK")
    List<Task> getTasks();

    //id name, description
    @SqlQuery("SELECT * FROM TASK WHERE id=:id")
    Task getTask(@Bind(value = "id") final int task_id);


}
