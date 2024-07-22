package Exercicio01;

import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Musica musica1 = new Musica("the new", "pprevival", "interpol", 300);
        Musica musica2 = new Musica("digital", "pp", "joy division", 250);
        Musica musica3 = new Musica("hips dont lie", "pop", "shakira", 200);
        Musica musica4 = new Musica("sorrow", "indie", "the national", 300);


        MusicPlayer lista1 = new MusicPlayer();

        lista1.addMusica(musica1);
        lista1.addMusica(musica2);
        lista1.addMusica(musica3);
        lista1.addMusica(musica4);

        lista1.verLista();
        lista1.verDuracao();

        lista1.trocar(lista1, 1, 2);
        lista1.removerMusica(musica4);
        lista1.verLista();
    }
}
