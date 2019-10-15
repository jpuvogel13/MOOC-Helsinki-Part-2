package personnel;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class Employees {

    private List<Person> list;

    public Employees(){
        this.list = new ArrayList<Person>();
    }

    public void add(Person person){
        this.list.add(person);
    }
    public void add(List<Person> people){
        this.list.addAll(people);
    }

    public void print(){
        Iterator<Person> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    public void print(Education education){
        Iterator<Person> iterator = list.iterator();
        while(iterator.hasNext()){
            Person p = iterator.next();
            if(p.getEducation() == education) {
                System.out.println(p);
            }
        }
    }
    public void fire(Education education){
        Iterator <Person> iterator = list.iterator();
        while(iterator.hasNext()){
            Person fire = iterator.next();
            if(fire.getEducation() == education){
                iterator.remove();
            }
        }
    }

}
