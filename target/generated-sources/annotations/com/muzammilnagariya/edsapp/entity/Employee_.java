package com.muzammilnagariya.edsapp.entity;

import com.muzammilnagariya.edsapp.entity.Department;
import com.muzammilnagariya.edsapp.entity.Salary;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-11-19T01:09:26", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Employee.class)
public class Employee_ { 

    public static volatile SingularAttribute<Employee, Integer> empId;
    public static volatile CollectionAttribute<Employee, Salary> salaryCollection;
    public static volatile SingularAttribute<Employee, String> empName;
    public static volatile SingularAttribute<Employee, Department> deptId;
    public static volatile SingularAttribute<Employee, String> joiningDate;
    public static volatile SingularAttribute<Employee, Integer> age;

}