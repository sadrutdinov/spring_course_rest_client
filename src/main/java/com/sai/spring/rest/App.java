package com.sai.spring.rest;

import com.sai.spring.rest.configuration.MyConfig;
import com.sai.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.jws.soap.SOAPBinding;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);

//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);

//        Employee employee = communication.getEmployee(8);
//        System.out.println(employee);

//        Employee employee = new Employee("Sveta", "Sokolova", "IT", 1300);
//        employee.setId(11);
//        communication.saveEmployee(employee);

        communication.deleteEmployee(11);



        context.close();
    }
}
