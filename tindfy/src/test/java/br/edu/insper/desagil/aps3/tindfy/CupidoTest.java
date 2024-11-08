package br.edu.insper.desagil.aps3.tindfy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CupidoTest {
    private Cupido c;
    private Usuario user1;
    private Usuario user2;

    public Usuario usuarioFake(int id){
        Usuario usuario = mock(Usuario.class);
        when(usuario.getId()).thenReturn(id);
        return usuario;
    }

    @BeforeEach
    void setUp() {
        c = new Cupido();
        user1 = usuarioFake(2);
        user2 = usuarioFake(3);
    }

    @Test
    void ninguemDaLike(){
        assertFalse(c.deuMatch(user1, user2));
    }

    @Test
    void primeiroDaLike(){
        c.daLike(user1.getId(),user2.getId());
        assertFalse(c.deuMatch(user1,user2));
    }

    @Test
    void segundoDaLike() {
        c.daLike(user2.getId(),user1.getId());
        assertFalse(c.deuMatch(user2,user1));
    }
}
