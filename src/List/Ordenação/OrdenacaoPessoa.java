package List.Ordenação;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade); //ordena a Lista de pessoas por idade
        return pessoasPorIdade;
    }

    public List<Pessoa> comparacaoPorAltura(){
        List<Pessoa> pessoarPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoarPorAltura, new ComparatorPorAltura());
        return pessoarPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoas = new OrdenacaoPessoa();

        ordenacaoPessoas.adicionarPessoa("Alice", 20, 1.56);
        ordenacaoPessoas.adicionarPessoa("Bob", 30, 1.80);
        ordenacaoPessoas.adicionarPessoa("Charlie", 25, 1.70);
        ordenacaoPessoas.adicionarPessoa("David", 17, 1.56);

        System.out.println(ordenacaoPessoas.pessoaList);


        System.out.println(ordenacaoPessoas.ordenarPorIdade());

        // Ordenando e exibindo por altura
        System.out.println(ordenacaoPessoas.comparacaoPorAltura());
    }
}
