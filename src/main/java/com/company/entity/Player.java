package com.company.entity;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@ToString(callSuper = true)
@AllArgsConstructor
@Builder


@Entity
@Table(name = "players")
public class Player extends BaseEntity {

    @Column(name = "player_name", length = 40, nullable = false, unique = true)
    private String name;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Command command;

}
