package TaskUsers;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface MapTable<T> {
    T mapObject(ResultSet resultSet) throws SQLException;
}