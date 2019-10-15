package reference.comparator;

import reference.domain.Person;

import java.util.Comparator;
import java.util.Map;

    public class PersonComparator implements Comparator<Person> {
        private Map<Person, Integer> personIdentities;


        public PersonComparator(Map<Person, Integer> peopleIdentities) {
            this.personIdentities = peopleIdentities;
        }

        public int compare(Person person, Person person1) {
            int value1 = this.personIdentities.get(person);
            int value2 = this.personIdentities.get(person1);
            return value2-value1;
    }

}
