package com.player2.promatch.entity.repository;

import com.player2.promatch.model.traits.TraitsInfo;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;
import java.util.List;


//@NoRepositoryBean
@Repository
public interface TraitsRepository extends JpaRepository<TraitsInfo, Integer> {

    List<TraitsInfo> findALlByTraitName(String traitname);

}
