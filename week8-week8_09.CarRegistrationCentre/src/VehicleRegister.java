import java.util.ArrayList;
import java.util.HashMap;
public class VehicleRegister {

    private HashMap<RegistrationPlate, String> owners;

    public VehicleRegister(){
        this.owners=new HashMap<RegistrationPlate,String>();

    }

    public boolean add(RegistrationPlate plate, String owner){
        if(owners.containsKey(plate)){
            return false;
        }else{
            owners.put(plate,owner);
            return true;
        }
    }
    public String get(RegistrationPlate plate){
        return owners.get(plate);
    }
    public boolean delete(RegistrationPlate plate){
        if(owners.containsKey(plate)){
            owners.remove(plate);
            return true;
        }else {
            return false;
        }
    }

    public void printRegistrationPlates(){
        for( RegistrationPlate plates : owners.keySet()){
            System.out.println(plates);
        }
    }
    public void printOwners(){
        ArrayList<String> ownerList = new ArrayList<String>();
       for(RegistrationPlate owner : owners.keySet()){
           String carOwner = "";
           carOwner+= (owners.get(owner));
           if(!(ownerList.contains(carOwner))){
            ownerList.add(carOwner);
               System.out.println(carOwner);
           }
           else{

           }
       }

    }
}
