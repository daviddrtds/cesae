package Exercicio02;

import java.util.ArrayList;
import java.util.Random;

public class Sorteio {
    private double premio;
    private ArrayList<Pessoa> participantes;


    public Sorteio(double premio) {
        this.premio = premio;
        this.participantes = new ArrayList<Pessoa>();
    }

    public void addPessoa(Pessoa novapessoa) {

        if (novapessoa.getIdade() < 18) {
            System.out.println(novapessoa.getNome() + " deve ter mais de 18 anos para participar!");
        } else {
            this.participantes.add(novapessoa);
            System.out.println("Novo participante adicionado!");
        }
    }

    public void imprimirLista() {

        int count = 1;

        for (Pessoa estaPessoa : this.participantes) {
            System.out.print(count + "º Participante - ");
            estaPessoa.verDetalhes();
            count++;
        }
    }


    public Pessoa sortear() {
        Random rand = new Random();
        int x = rand.nextInt(0, this.participantes.size());
        System.out.print("O vencedor é: ");
        return this.participantes.get(x);
    }
}



