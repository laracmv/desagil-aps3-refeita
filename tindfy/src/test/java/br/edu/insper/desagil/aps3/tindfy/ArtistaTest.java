package br.edu.insper.desagil.aps3.tindfy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArtistaTest {
    private Artista artista;

    @BeforeEach
    void setUp() {
        artista = new Artista(1, "Lara");
    }

    @Test
    void constroi() {
        assertEquals("Lara",artista.getNome());
        assertEquals(1, artista.getId());
    }

    @Test
    void mudaNome(){
        artista.setNome("Chris");
        assertEquals("Chris", artista.getNome());
    }

}
