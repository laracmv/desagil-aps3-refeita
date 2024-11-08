package br.edu.insper.desagil.aps3.tindfy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cupido {
    private Map<Integer, List<Integer>> likes;

    public Cupido() {
        this.likes = new HashMap<>();
    }

    public void daLike(int id1, int id2) {
        if (!likes.containsKey(id1)) {
            List<Integer> l = new ArrayList<>();
            l.add(id2);
            likes.put(id1, l);
        } else if (!likes.get(id1).contains(id2)) {
            List<Integer> l = likes.get(id1);
            l.add(id2);
        }
    }

    public boolean deuMatch(Usuario user1, Usuario user2) {
        if (likes.containsKey(user1.getId()) && likes.containsKey(user2.getId())){
            if (likes.get(user1.getId()).contains(user2.getId()) && likes.get(user2.getId()).contains(user1.getId())) {
                return true;
            }
        }
        return false;
    }
}
