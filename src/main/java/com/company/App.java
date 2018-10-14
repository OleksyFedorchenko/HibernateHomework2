package com.company;

import com.company.entity.Command;
import com.company.entity.Country;
import com.company.entity.Player;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class App {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("hibersoccer");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();

        Country country = Country.builder().name("Brasil").build();
        em.persist(country);
        Command command = Command.builder()
                .country(country)
                .name("Command of Brasil #1")
                .build();
        em.persist(command);
//        Player player = Player.builder()
//                .command(command)
//                .name("Pavlo Ronaldo")
//                .build();
//        em.persist(player);
//        Country country = em.createQuery("SELECT c FROM Country c WHERE c.id=:countryId",Country.class)
//                .setParameter("countryId",1L)
//                .getSingleResult();
//        System.out.println(country);

        for(int i=0;i<15;i++){
            Player player1=Player.builder()
                    .name("Player# "+i)
                    .command(command)
                    .build();
            em.persist(player1);
        }
List<Player> playerList = em.createQuery("SELECT p FROM Player p",Player.class).getResultList();
        playerList.forEach(System.out::println);

        em.getTransaction().commit();
        em.close();
        factory.close();
    }
}
