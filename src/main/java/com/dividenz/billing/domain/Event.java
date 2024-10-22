package com.dividenz.core.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "EVENTS")
public class Event implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private long id;

    @Column(name = "USER")
    private String user;

}
