package com.younggalee.practice5.run;

import com.younggalee.practice5.dto.Employee;

import java.util.ArrayList;
import java.util.List;

public class Application_arrayList {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        
        emp.add(new Employee());
        emp.add(new Employee(1, "홍길동", 19, 'M', "01022223333", "서울 잠실"));
        emp.add(new Employee(2,"강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡"));
    
        for (int i=0; i< emp.size(); i++){
            System.out.println(emp.get(i).getInformation());
        }

        System.out.println("========================");

        emp.get(0).setEmpNo(4);
        emp.get(0).setEmpName("김말똥");
        emp.get(0).setDept("영업부");
        emp.get(0).setJob("팀장");
        emp.get(0).setAge(30);
        emp.get(0).setGender('M');
        emp.get(0).setSalary(3000000);
        emp.get(0).setBonusPoint(0.2);
        emp.get(0).setPhone("01055559999");
        emp.get(0).setAddress("전라도 광주");

        emp.get(1).setDept("기획부");
        System.out.println(emp.get(0).getInformation());
    }
}
