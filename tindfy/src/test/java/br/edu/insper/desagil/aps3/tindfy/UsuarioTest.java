package br.edu.insper.desagil.aps3.tindfy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UsuarioTest {
    private Usuario u;

    @BeforeEach
    void setUp() {
        Musica mu1 = criaMusica(2,"Brunao");
        Musica mu2 = criaMusica(3, "Raio");
        Musica mu3 =  criaMusica(4, "Meteoro");
        List<Musica> musicas = new ArrayList<>();
        musicas.add(mu1);
        musicas.add(mu2);
        musicas.add(mu3);
        u = new Usuario(3, "Seila",musicas);

    }

    private Musica criaMusica(int idArtista, String titulo){
        Artista artista = mock(Artista.class);
        when(artista.getId()).thenReturn(idArtista);

        Musica musica = mock(Musica.class);
        when(musica.getTitulo()).thenReturn(titulo);
        when(musica.getArtista()).thenReturn(artista);
        return musica;

    }

    @Test
    void naoAdiciona() {
        u.adiciona(criaMusica(2, "Brunao"));
        assertEquals(3, u.getMusicas().size());
    }

}
