package org.example;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Conexao con = new Conexao();
        Banco b = new Banco();
        JdbcTemplate banco = con.getCon();
        Scanner num = new Scanner(System.in);
        Scanner text = new Scanner(System.in);
        Integer resp;
        do {
            System.out.println("""
                    +-------------------+
                    |  Livraria SPTECH  |
                    +-------------------+
                    |1) Cadastrar Livro |
                    |2) Exibir Livros   |
                    |3) Atualizar Livro |
                    |4) Remover Livro   |
                    |5) Buscar por Nome |
                    |6) Sair            |
                    +-------------------+ 
                    """);
             resp = num.nextInt();
             if(resp == 1){
                 System.out.println("Digite o nome: ");
                 String nome = text.nextLine();
                 System.out.println("Digite o preco: ");
                 Double preco = num.nextDouble();
                 b.cadastrar(banco, nome, preco);
             } else if(resp == 2){

             }
        } while (resp != 6);
    }
}