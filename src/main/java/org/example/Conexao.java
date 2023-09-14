package org.example;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class Conexao {
    private JdbcTemplate con;

    public Conexao(){
        BasicDataSource banco = new BasicDataSource();
        banco.setDriverClassName("org.h2.Driver");
        banco.setUrl("jdbc:h2:file:./bd-livraria");
        banco.setUsername("sa");
        banco.setPassword("");
        con = new JdbcTemplate(banco);
        con.execute("CREATE TABLE livro (id int primary key auto_increment, nome VARCHAR(90), preco DECIMAL(8,2))");
    }

    public JdbcTemplate getCon() {
        return con;
    }
}
