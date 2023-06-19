//import java.util.List;
//
//public class Department {
//
//    private int id;
//    private String name;
//    private List<String> employee;
//
//    public Department(int id, String name, List<String> employee) {
//        this.id = id;
//        this.name = name;
//        this.employee = employee;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public List<String> getEmployee() {
//        return employee;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setEmployee(List<String> employee) {
//        this.employee = employee;
//    }
//
//    @Override
//    public String toString() {
//        return "Department{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", employee=" + employee +
//                '}';
//    }
//
//
//    public static void main(String[] args)
//    {
//        Department d1=new Department(1,"CSE","Mayank","Vipul","Harshit", "Saurav");
//        Department d2=new Department(2,"ECE","Mac","Vip","Har");
//        Department d3=new Department(3,"EE","M");
//
//        List<Department> dList=List.of(d1,d2,d3);
//
//        dList.stream();
//    }
//}
