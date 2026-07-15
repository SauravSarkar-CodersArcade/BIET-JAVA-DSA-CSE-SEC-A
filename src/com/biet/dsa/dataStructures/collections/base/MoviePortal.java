package com.biet.dsa.dataStructures.collections.base;
import java.util.ArrayList;
import java.util.Collection;
class Actor {
    String name;
    String movie;
    Actor(String name, String movie){
        this.name = name;
        this.movie = movie;
    }
}
public class MoviePortal {
    public static void main(String[] args) {
        Actor a1 = new Actor("Ganesh", "Mungaru Male");
        Actor a2 = new Actor("Puneeth R", "Milana");
        Collection<Actor> actors = new ArrayList<>();
        actors.add(a1);
        actors.add(a2);
        for (Actor a : actors){
            System.out.println(a.name + ", " + a.movie);
        }
    }

}
