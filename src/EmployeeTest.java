import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeTest {

    public static List<Q_Employee> createEmployeeList()
    {
        List<Q_Employee> empList=new ArrayList<>();

        empList.add(new Q_Employee(1,"A",20,"Male","HR",2003,20000.0));
        empList.add(new Q_Employee(2,"B",25,"Male","IT",2012,12000.0));
        empList.add(new Q_Employee(3,"C",19,"Female","Accounts",2008,32000.0));
        empList.add(new Q_Employee(4,"D",32,"Female","Finance",2023,30000.0));
        empList.add(new Q_Employee(5,"B",25,"Male","IT",2022,40000.0));

        return empList;
    }

    public static void main(String[] args) {

        List<Q_Employee> list=EmployeeTest.createEmployeeList();
        Map<String, Long> maleFemaleCOuntmap= list.stream().collect(Collectors.groupingBy(Q_Employee::getGender,Collectors.counting()));
        System.out.println(maleFemaleCOuntmap);

        //list.stream().map(employee->employee.getDepartment()).distinct().forEach(System.out::println);
        List<String> deptList=list.stream().map(employee->employee.getDepartment()).distinct().collect(Collectors.toList());
        System.out.println(deptList);
    }
}
