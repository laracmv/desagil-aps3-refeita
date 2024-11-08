package br.edu.insper.desagil.aps3.tindfy;

public class CupidoMusical extends Cupido{

    @Override
    public boolean deuMatch(Usuario user1, Usuario user2) {
        if (super.deuMatch(user1,user2)) {
            for (Musica musica1 : user1.getMusicas()) {
                for (Musica musica2 : user2.getMusicas()) {
                    if (musica1 == musica2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
