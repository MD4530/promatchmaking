package com.player2.promatch.model.traits;


import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name = "traits", schema = "public")

//calss is mapped to the traits table
public class TraitsInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer traitid;

    public Integer getTraitid() {
        return traitid;
    }

    public void setTraitid(Integer traitid) {
        this.traitid = traitid;
    }

    @Column(name = "traitname")
    private String traitname;


    public String getTraitname() {
        return traitname;
    }

    public void setTraitname(String traitname) {
        this.traitname = traitname;
    }

    public  TraitsInfo(){}

    public  TraitsInfo(String traitname){
        this.traitname =traitname;
    }

}
