package com.lanou3g.study;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public interface ExecuteInter  {
    Statement execute1(Connection coon) throws SQLException;
}
