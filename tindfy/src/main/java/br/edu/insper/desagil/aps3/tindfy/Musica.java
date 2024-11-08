package br.edu.insper.desagil.aps3.tindfy;

public class Musica {
    private Artista artista;
    private String titulo;

    public Musica(String titulo, Artista artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    public Artista getArtista() {
        return artista;
    }

    public String getTitulo() {
        return titulo;
    }

}
