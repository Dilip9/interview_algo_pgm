package org.example.currentinterview;

import java.util.Arrays;
import java.util.stream.Stream;

public class TechMahindra {

    //private User user;

    public static void main(String[] args){

        // student sorted --> aasc firrst name, no duplicate
//        arrange the numbers in ascending order
// - >  [1,2,3,4,5,0,0,0,0,0]
//        without using collection / Map or any built in api
        int [] arr = {3,0,2,0,0,5,4,0,1,0};
        sortNumberwithaddingZeroAtLast(arr);

    }
    public static void sortNumberwithaddingZeroAtLast(int [] unsortedarr){
        int zeroCounter=0;
        int n=unsortedarr.length;
        for(int i=0;i<n;i++){
            zeroCounter++;
        }
        int nonZeroLength = n-zeroCounter;
        for(int i=0;i<nonZeroLength;i++){
            if((unsortedarr[i]<unsortedarr[i+1] || unsortedarr[i]!= unsortedarr[i+1]) || unsortedarr[i]!=0 ){
                int temp= unsortedarr[i+1];
                unsortedarr[i]= unsortedarr[i];
                temp=unsortedarr[i+1];
            }
        }

//       for(int i=0;i<n;i++){
//           unsortedarr[nonZeroLength++] = 0;
//       }

        for(int i=0;i<n;i++){
            System.out.print(unsortedarr[i]+" ");
        }


//    Emp: empid,  Empname, salary, deptId
//
//Dept: deptid, deptname
//
//write a query to fetch total salary for each dept
// Select Sum(Salary) from employee e, department d where e.empId= d.deptId group by deptname;

        //service-1 /api/v1/saveUser --> Post method
        //service-2 /api/v1/getUser --> get method





    }


}



//
//class User {
//
//    private long id;
//    @Column()
//    private String name;
//
//    public User() {
//    }
//
//    public User(long id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//}
////