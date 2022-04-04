package br.com.fiap;

import java.time.LocalDate;

import br.com.fiap.entity.Livro;
import br.com.fiap.service.LivroServiceImpl;

public class App {

    public static void main(String[] args) {

        LivroServiceImpl livroService = LivroServiceImpl.getInstance();

        livroService.inserir(new Livro(
                "O dia que a internet da FIAP não funcionou",
                "Diaz",
                7283,
                LocalDate.of(2020, 1, 20))
        );
        livroService.inserir(new Livro(
                "O dia em que tudo deu errado na FIAP",
                "George Orwell",
                5478,
                LocalDate.of(2018, 4, 20))
        );
        livroService.inserir(new Livro(
                "A vida bagunçada de Gustavo",
                "Gustavo",
                2547,
                LocalDate.of(2017, 1, 29))
        );

        livroService.listar();

        livroService.remover(2L);

        livroService.atualizar((new Livro(
        		"O dia que a internet da FIAP não funcionou",
                "Diaz",
                7283,
                LocalDate.of(2019, 1, 20))
        ));

    }
}