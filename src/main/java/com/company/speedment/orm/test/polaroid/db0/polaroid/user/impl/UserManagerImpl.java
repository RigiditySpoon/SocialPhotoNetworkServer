package com.company.speedment.orm.test.polaroid.db0.polaroid.user.impl;

import com.company.speedment.orm.test.polaroid.db0.polaroid.user.User;
import com.company.speedment.orm.test.polaroid.db0.polaroid.user.UserBuilder;
import com.company.speedment.orm.test.polaroid.db0.polaroid.user.UserManager;
import com.speedment.orm.core.manager.sql.AbstractSqlManager;
import java.lang.RuntimeException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.stream.Stream;
import javax.annotation.Generated;

/**
 * A manager implementation representing an entity (for example, a row) in the Table 'polaroid.db0.polaroid.user'.
 * <p>
 * This Class or Interface has been automatically generated by Speedment.
 * Any changes made to this Class or Interface will be overwritten.
 * 
 * @author Speedment 
 */
@Generated("Speedment")
public class UserManagerImpl extends AbstractSqlManager<Long, User, UserBuilder> implements UserManager {
    
    public UserManagerImpl() {
        setSqlEntityMapper(this::defaultReadEntity);
    }
    
    @Override
    public UserBuilder builder() {
        return new UserImpl();
    }
    
    @Override
    public UserBuilder toBuilder(User prototype) {
        return new UserImpl(prototype);
    }
    
    protected User defaultReadEntity(ResultSet resultSet) {
        final UserBuilder builder = builder();
        try {
            builder.setId(resultSet.getLong("id"));
            builder.setMail(resultSet.getString("mail"));
            builder.setPassword(resultSet.getString("password"));
            builder.setFirstName(resultSet.getString("first_name"));
            builder.setLastName(resultSet.getString("last_name"));
            builder.setAvatar(resultSet.getString("avatar"));
        }
        catch (SQLException sqle) {
            throw new RuntimeException(sqle);
        }
        return builder;
    }
}