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
@Table(name = "commands")
public class Command extends BaseEntity {

    @Column(name = "team_name", nullable = false, unique = true)
    private String name;

    @Column(name = "country_id", nullable = false, unique = false)
    private int countryId;
}
