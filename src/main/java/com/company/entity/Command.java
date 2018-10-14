package com.company.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@ToString(callSuper = true, exclude = "players")
@AllArgsConstructor
@Builder

@Entity
@Table(name = "commands")
public class Command extends BaseEntity {

    @Column(name = "team_name", nullable = false, unique = true)
    private String name;

    @OneToMany(mappedBy = "command")
    private List<Player> players;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;
}
