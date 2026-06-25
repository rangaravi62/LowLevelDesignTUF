package Practice;

interface Connection {
    void connect();
}

interface QueryBuilder {
    void buildQuery(String table);
}


class MySQLConnection implements Connection{
    @Override
    public void connect() {
        System.out.println("[MySQL] Opening connection");
    }
}

class MySQLQueryBuilder implements QueryBuilder{
    @Override
    public void buildQuery(String table) {
        System.out.println("[MySQL] SELECT * FROM "+table);
    }
}


class PostgreSQLConnection implements Connection{
    @Override
    public void connect() {
        System.out.println("[PostgreSQL] Opening connection");
    }
}

class PostgreSQLQueryBuilder implements QueryBuilder{
    @Override
    public void buildQuery(String table) {
        System.out.println("[PostgreSQL] SELECT * FROM "+table);
    }
}


interface DatabaseFactory{
    void createConnection();
    void createQueryBuilder();
}



