package exercise;

import tuple.Tuple;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Dado un lista de tuplas con valores (x,y) calcular cual es el punto que esta mas cerca del origen
 * <p>
 * You get a list of tuples with x and y values return which tuple is more close to origin
 * How would you find the K closest points to the origin?
 *
 * Solution: You could get the distance for each tuple into array.
 */
public class DistancePoint {

  public Tuple moreCloseToOrigin(List<Tuple> list) {
    Double distance;
    List<Double> allDistance = new ArrayList<>();

    for (Tuple current : list) {
      // get the distance
      distance = Math.sqrt(Math.pow( ((Integer) current.x).doubleValue(), 2 ) +  Math.pow( ((Integer) current.y).doubleValue(), 2 ) );
      // add all distance into list
      allDistance.add(distance);
    }

    //System.out.println("the min value is: " + Collections.min(allDistance));
    //System.out.println("index for the minimun distance: " + allDistance.indexOf(Collections.min(allDistance)));

    Tuple result = list.get(allDistance.indexOf(Collections.min(allDistance)));

    return result;
  }


}
