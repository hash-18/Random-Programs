import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Employee e1=new Employee(1,"Mac",new Address(101,"Camac"));
        Employee e2=new Employee(2,"Cac", new Address(201,"Park St"));
        Employee e3=new Employee(3,"Tac", new Address(111,"Newtown"));

        List<Employee> listOfEmployees=new ArrayList<>(List.of(e1,e2,e3));
        System.out.println(listOfEmployees);

        //Sorting based on id
        Collections.sort(listOfEmployees, new IdComparator());
        System.out.println("Sort based on id"+ listOfEmployees);
        //Sorting based on name;
        Collections.sort(listOfEmployees, new NameComparator());
        System.out.println("Sort based on name"+ listOfEmployees);
        //Sorting based on Address
        Collections.sort(listOfEmployees, new AddressComparator());
        System.out.println("Sort based on Address"+ listOfEmployees);

    }
}