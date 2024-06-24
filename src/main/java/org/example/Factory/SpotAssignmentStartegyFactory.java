package org.example.Factory;

import org.example.Models.SpotAssigmnetStraegyType;
import org.example.Strategy.RandomAssignSpotStaregy;
import org.example.Strategy.SpotAssignmentStrategy;

public class SpotAssignmentStartegyFactory {
    public  static SpotAssignmentStrategy getSpotAssignmentStaregyFprType(
            SpotAssigmnetStraegyType spotAssigmnetStraegyType){

//        if (spotAssigmnetStraegyType.equals(spotAssigmnetStraegyType.NEAREST)){
//            return new xyyassignmnetstaryegy;
//        }
      return new RandomAssignSpotStaregy();
    }
}
