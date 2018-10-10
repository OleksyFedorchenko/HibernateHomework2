package com.company.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "countries")
public class Country extends BaseEntity {

    @Column(name = "country_name", length = 20, nullable = false, unique = true)
    private String name;

    @OneToMany(mappedBy = "country")
    private List<Command> commands;

}
