package org.example.Repository;

import org.example.Models.Gate;

import java.util.HashMap;
import java.util.Optional;

public class GateRepository {


    HashMap<Long,Gate> hm = new HashMap<>();

    public Optional<Gate> findGateById(Long gateId){
        if(hm.containsKey(gateId)){
            return Optional.of(hm.get(gateId));
        }else {
            return Optional.empty();
        }
    }
}
