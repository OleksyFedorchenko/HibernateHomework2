package com.company.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@NoArgsConstructor

@Entity
@Table(name = "players")
public class Player extends BaseEntity {

    @Column(name = "player_name", length = 40, nullable = false, unique = true)
    private String name;

    @Column(name = "team_id", nullable = false, unique = false)
    private int teamId;

    @Column(name = "country_id", nullable = false, unique = false)
    private int countryId;
}
