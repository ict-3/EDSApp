package com.muzammilnagariya.edsapp.entity;

import com.muzammilnagariya.edsapp.entity.Employee;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-11-19T01:09:26", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Department.class)
public class Department_ { 

    public static volatile SingularAttribute<Department, Integer> deptId;
    public static volatile CollectionAttribute<Department, Employee> employeeCollection;
    public static volatile SingularAttribute<Department, String> depName;

}