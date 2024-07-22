package Exercicio01;

import java.util.ArrayList;

public class MusicPlayer {

    private ArrayList<Musica> programacao;

    public MusicPlayer() {
        this.programacao = new ArrayList<Musica>();
    }

    public void addMusica(Musica novaMusica) {
        this.programacao.add(novaMusica);
        System.out.println("Música adicionada com sucesso!");
    }


    public void substituirMusica(Musica novaMusica, int index) {
        this.programacao.set(index, novaMusica);
        System.out.println("Música substituída com sucesso!");
    }

    public void removerMusica(Musica musicaARemover) {
        this.programacao.remove(musicaARemover);
        System.out.println("Música removida com sucesso!");
    }


    public void limparLista() {
        this.programacao.clear();
        System.out.println("Lista apagada com sucesso!");
    }


    public void verLista() {
        int cont = 1;
        for (Musica cadaMusica : this.programacao) {
            System.out.print("Música " + cont++ + " - ");
            cadaMusica.imprimirDetalhesMusica();
        }
    }

    public void verDuracao() {
        int totalSec = 0;

        for (Musica cadaMusica : this.programacao) {
            totalSec = totalSec + cadaMusica.getDuracao();
        }

        int segundos = totalSec % 60;  // Calculate the remaining seconds
        int horas = totalSec / 60;  // Convert total seconds to minutes
        int minutos = horas % 60;         // Calculate the remaining minutes
        horas = horas / 60;            // Convert total minutes to hours

        System.out.println();
        System.out.print("Duração total da lista de reprodução: " + horas + "h:" + minutos + "m:" + segundos + "s");
        System.out.println();
    }
}
