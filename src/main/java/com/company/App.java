package com.company;

import com.company.entity.Player;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App
{
    public static void main( String[] args )
    {
        EntityManagerFactory factory= Persistence.createEntityManagerFactory("hibersoccer");
        EntityManager em = factory.createEntityManager();
    }
}
