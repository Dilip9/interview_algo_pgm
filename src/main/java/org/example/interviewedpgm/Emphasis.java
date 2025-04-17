package org.example.interviewedpgm;

public class Emphasis {
    /**
     * Method Reference:
     *
     * List<List<String>> listOb = Arrays.asList(Arrays.asList("a", "b"), Arrays.asList("c", "d", "e"), Arrays.asList("f"));
     *
     * Output: [a, b, c, d, e, f]
     *
     *
     * list.stream().flatMap().stream(List::stream).forEach(System.out.println);
     *
     *
     * Count the number of employees in each department using streams?
     * EMP - name, yearof joining , salary, Department.
     *
     * List<Employee> emp = Arrays.asList(new Employee(name, yoj, salary, department));
     * emp.stream().collect(Collectors.groupingBy(Employee::getDepartment, collectors.counting()).entrySet().stream().forEach();
     *
     *
     * public class Test
     * {
     *     static int v = method2 ();
     *     static {
     *         method1 ();
     *         System.out.println("Inside Static Block...");
     *     }
     *     public static void main (String[] args)
     *     {
     *     	System.out.println("Inside main method...");
     *     }
     *     public static void method1 ()
     *     {
     *     	System.out.println("Inside main method11...");
     *     }
     *     public static int method2 ()
     *     {
     *     	System.out.println("Inside main method22...");
     *         return 5;
     *     }
     * }
     * output:
     * method222 5
     * method11
     * inside static block
     * inside main method.
     *
     * @Configuration
     * public class RestTemplate {
     *    @Bean
     *    public RestTemplate restTemplate() {
     *          return new RestTemplate();
     *     }
     * }
     *
     * public class ConsumeRestTemplate{
     *
     *     @Autowired
     *     private RestTemplate restTemplate;
     *
     *     @GetMapping("/produce")
     *     public String getDataFromRestAPI() {
     *          String url = "https://api.example.com/data";
     *          String response = restTemplate.getForObject(url, String.class);
     *          return response;
     *     }
     * }
     *
     *
     * stored prcedure
     * Count the number of employees in each department using streams?
     * EMP - name, yearof joining , salary, Department.
     *
     *
     *
     * List<Employee> emp = Arrays.asList(new Employee(name, yoj, salary, department));
     * emp.stream().collect(Collectors.groupingBy(Employee::getDepartment, collectors.counting()).entrySet().stream().forEach();

     * public class Test
     * {
     *     static int v = method2 ();
     *     static {
     *         method1 ();
     *         System.out.println("Inside Static Block...");
     *     }
     *     public static void main (String[] args)
     *     {
     *             System.out.println("Inside main method...");
     *     }
     *     public static void method1 ()
     *     {
     *            System.out.println("Inside main method11...");
     *     }
     *     public static int method2 ()
     *     {
     *            System.out.println("Inside main method22...");
     *         return 5;
     *     }
     * }
     *
     * what will be the output -?
     *
     * Concurrent HashMap
     *
     * Stored Procedure for Insertion ..EMP - name...
     * Stored Procedure for Insertion ..EMP - name, sal, dept.
     *
     * create or replace procedure insert_epm(IN name Varchar, IN sal Double, IN dept Varchar)
     *  BEGIN
     *      insert into emp(name, sal, dept) values (name, sal, dept);
     *  End;
     *
     *  calling procedure from repository
     *
     *  public interface EmployeeRepository extends JpaRepository<Employee, Long> {
     *
     *      @Procedure(name = "insert_epm")
     *      Employee insertEmployee(Strrin name, double salary, String department);
     *
     *  }
     * **/
}
