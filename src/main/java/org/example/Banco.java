package org.example;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class Banco {

    public void cadastrar(JdbcTemplate banco, String nome, Double preco){
        banco.update("INSERT INTO livro VALUES(null, ?, ?)", nome, preco);
        System.out.println("Alterado Com SUCESSO!! \n\n\n\n");
    }
    public void consultar(JdbcTemplate banco){
        List<Livro> livros = banco.query("SELECT * FROM livros;", );
        System.out.println("Alterado Com SUCESSO!! \n\n\n\n");
    }

}
