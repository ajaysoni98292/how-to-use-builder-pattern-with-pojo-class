/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package how.to.use.builder.with.pojo.pkgclass.main;

import how.to.use.builder.with.pojo.pkgclass.model.Employee;
import how.to.use.builder.with.pojo.pkgclass.model.EmployeeBuilder;

/**
 *
 * @author ajay
 */
public class HowToUseBuilderWithPojoClass {


    public static void main(String[] args) {

        // If you want to create the object of Employee class, Now only one way is using builder class
        // The below line throws that Employee constructor is not visible
        //Employee employee = new Employee();

        // Benefits of the Builder pattern is that, we restrict the developer to create the object directly
        // Another one is the we customize or reducing the parameter required for constructor in the pojo class.

        Employee employee = new EmployeeBuilder()
                .setEmployeeId(1)
                .setFirstName("ajay")
                .setLastName("soni")
                .createEmployee();
        System.out.println("The values of the object :"+employee.toString());

    }
    
}
