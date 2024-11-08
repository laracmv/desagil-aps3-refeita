package br.edu.insper.desagil.aps3.tindfy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CupidoMusicalTest {
    private Cupido c;

    public Usuario usuarioFakeeMusica(int id, String titulo, int idArtista){
        Artista a = mock(Artista.class);
        when(a.getId()).thenReturn(idArtista);

        Musica mu = mock(Musica.class);
        when(mu.getArtista()).thenReturn(a);
        when(mu.getTitulo()).thenReturn(titulo);

        Usuario usuario = mock(Usuario.class);
        when(usuario.getId()).thenReturn(id);

        usuario.adiciona(mu);
        return usuario;
    }

    @BeforeEach
    void setUp() {
        c = new CupidoMusical();
    }

    @Test
    void semLikesComMusicas() {
        Usuario user1 = usuarioFakeeMusica(2, "Chico", 3);
        Usuario user2 = usuarioFakeeMusica(3, "Chico", 3);
        assertFalse(c.deuMatch(user1,user2));
    }

    @Test
    void comLikesSemMusicas() {
        Usuario user1 = usuarioFakeeMusica(2, "Pain", 10);
        Usuario user2 = usuarioFakeeMusica(3, "Chico", 20);
        c.daLike(user1.getId(), user2.getId());
        c.daLike(user2.getId(),user1.getId());
        assertFalse(c.deuMatch(user1,user2));
    }

    @Test
    void comLikesComMusicas() {
        Usuario user1 = usuarioFakeeMusica(2, "Chico", 10);
        Usuario user2 = usuarioFakeeMusica(3, "Chico", 10);
        c.daLike(user1.getId(), user2.getId());
        c.daLike(user2.getId(),user1.getId());
        assertFalse(c.deuMatch(user1,user2));
    }
}
