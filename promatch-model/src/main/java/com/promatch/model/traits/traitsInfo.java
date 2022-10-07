package com.promatch.model.traits;


import lombok.Data;
import lombok.Getter;

import javax.persistence.*;

@Data
@Entity
@Table(name = "traits", schema = "public")

@Getter

//calss is mapped to the traits table
public class traitsInfo {

    private  int id;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name="traitName")
    private String traitsName;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTraitsName() {
        return traitsName;
    }

    public void setTraitsName(String traitsName) {
        this.traitsName = traitsName;
    }

    public  traitsInfo(int id, String traitsName){
        this.id=id;
        this.traitsName =traitsName;
    }

    public  traitsInfo(){}


}
