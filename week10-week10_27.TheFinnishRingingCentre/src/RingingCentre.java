import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RingingCentre {
    private Map<Bird, ArrayList> observations;

    public RingingCentre(){
        this.observations= new HashMap<Bird, ArrayList>();
    }

    public void observe(Bird bird, String place) {
        if(observations.containsKey(bird)){

            observations.get(bird).add(place);
        }else {
            ArrayList<String> observationLocation = new ArrayList<String>();
            observationLocation.add(place);
            observations.put(bird,observationLocation);

        }

            }



    public void observations(Bird bird){
        int count = 0;
        System.out.println(bird.getLatinName() + " (" + bird.getRingingYear() + ") observations: " + count);
        ArrayList<String> place = new ArrayList<String>();
            if(this.observations.containsKey(bird)){
                place=observations.get(bird);
                for(String k : place){
                    System.out.println(k);
                }
                count++;

        }

        }
    public void printMany(Object object){


            }
}




