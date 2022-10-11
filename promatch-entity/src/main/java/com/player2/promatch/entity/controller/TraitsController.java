package com.player2.promatch.entity.controller;


import com.player2.promatch.entity.repository.TraitsRepository;
import com.player2.promatch.model.traits.TraitsInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pro-matching")
public class TraitsController {

    @Autowired
    TraitsRepository traitsrepository;


    @GetMapping("promatch")
    public ResponseEntity<List<TraitsInfo>> getAllResponse(@RequestParam(required = false) String traitname){

        try{
            List<TraitsInfo> traitsInfos =new ArrayList<TraitsInfo>();
            if (traitname == null)
                traitsrepository.findAll().forEach(traitsInfos::add);
            else
                traitsrepository.findALlByTraitName(traitname).forEach(traitsInfos::add);

            if (traitsInfos.isEmpty()){
                return  new ResponseEntity<>(traitsInfos, HttpStatus.NO_CONTENT);
            }
            return  new ResponseEntity<>(traitsInfos, HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }



}
