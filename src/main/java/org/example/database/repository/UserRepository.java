package org.example.database.repository;

import org.example.database.pool.ConnectionPool;

public class UserRepository {

    private final ConnectionPool connectionPull;

    public UserRepository(ConnectionPool connectionPull) {

        this.connectionPull = connectionPull;
    }
}
