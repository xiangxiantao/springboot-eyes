//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.xxt.boot.type;

import com.xgimi.commons.base.BaseType;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

public class MyBaseTypeHandler<T extends BaseType> extends BaseTypeHandler<T> {
    private List<T> values;
    private Class<T> tClass;

    public MyBaseTypeHandler(Class<T> type) {
        if (type == null) {
            throw new IllegalArgumentException("Type argument cannot be null");
        } else {
            this.values = BaseType.getValues(type);
            this.tClass = type;
        }
    }

    public void setNonNullParameter(PreparedStatement ps, int i, T parameter, JdbcType jdbcType) throws SQLException {
        ps.setInt(i, parameter.getCode());
    }

    public T getNullableResult(ResultSet rs, String columnName) throws SQLException {
        int code = rs.getInt(columnName);
        return rs.wasNull() ? null : this.parse(code);
    }

    public T getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        int code = rs.getInt(columnIndex);
        return rs.wasNull() ? null : this.parse(code);
    }

    public T getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        int code = cs.getInt(columnIndex);
        return cs.wasNull() ? null : this.parse(code);
    }

    private T parse(int code) {
        try {
            return BaseType.parse(this.values, code);
        } catch (RuntimeException var3) {
            return null;
        }
    }
}
