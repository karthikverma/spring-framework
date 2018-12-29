package spring.petclinic.controllers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class testingJavaComparator {

    public class person{
        int id;
        String firstName;
        String lastName;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
        public  Comparator<person> personComparator = new Comparator<person>() {
            @Override
            public int compare(person o1, person o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        };
    }

    public person getPerson(){
        return  new person();
    }

    public  static void main(String[] args){

        testingJavaComparator testingJavaComparator = new testingJavaComparator();
        person person1 = testingJavaComparator.getPerson();
        person1.setId(1);
        person1.setFirstName("Karthik");
        person1.setLastName("Verma");

        person person2 = testingJavaComparator.getPerson();
        person2.setId(2);
        person2.setFirstName("Aparna");
        person2.setLastName("Devi");

        person person3 = testingJavaComparator.getPerson();
        person3.setId(3);
        person3.setFirstName("Sanjay");
        person3.setLastName("Verma");

        List<person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

       // Collections.sort(personList,person1.personComparator);

        personList.sort((o1, o2) -> o1.getFirstName().compareTo(o2.getFirstName()));

        for (person person:personList){
            System.out.println(person.getId() + "  "+ person.getFirstName()+"  "+person.getLastName());
        }
        System.out.println();
    }
}
