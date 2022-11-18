package com.muzammilnagariya.edsapp.service;

import com.muzammilnagariya.edsapp.entity.Department;
import com.muzammilnagariya.edsapp.entity.Employee;
import com.muzammilnagariya.edsapp.entity.Salary;
import ejb.EDSSessionBean;
import java.util.Collection;
import java.util.Date;
import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/example")
public class ExampleService {

    @Inject
    EDSSessionBean ebs;

    @GET
    public Response get() {
        return Response.ok("Hello, world!").build();
    }

    @GET
    @RolesAllowed("Admin")
    @Path("/getAllEmployee")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Employee> getAllEmployee() {
        return ebs.getAllEmployee();
    }

    @GET
    @RolesAllowed("Admin")
    @Path("/getAllDepartment")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Department> getAllDepartment() {
        return ebs.getAllDepartment();
    }

    @GET
    @RolesAllowed("Admin")
    @Path("/getAllEmployeeByDeptId/{deptId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Employee> getAllEmployeeByDeptId(@PathParam("deptId") Integer deptId) {
        return ebs.getAllEmployeeByDeptId(deptId);
    }

    @GET
    @RolesAllowed("Admin")
    @Path("/getAllEmployeeSalaryDetailsByDeptId/{deptId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Salary> getAllEmployeeSalaryDetailsByDeptId(@PathParam("deptId") Integer deptId) {
        return ebs.getAllEmployeeSalaryDetailsByDeptId(deptId);
    }

    @GET
    @RolesAllowed("Admin")
    @Path("/getAllEmployeeSalaryDetails")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Salary> getAllEmployeeSalaryDetails() {
        return ebs.getAllEmployeeSalaryDetails();
    }

    @GET
    @RolesAllowed("Admin")
    @Path("/getAllEmployeeDetailsBySalary/{amount}")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Salary> getAllEmployeeDetailsBySalary(@PathParam("amount") Integer amount) {
        return ebs.getAllEmployeeDetailsBySalary(amount);
    }

    @GET
    @RolesAllowed("Admin")
    @Path("/getAllEmployeeDetailsBySalaryAndDeptId/{amount}/{deptId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Salary> getAllEmployeeDetailsBySalaryAndDeptId(@PathParam("amount") Integer amount, @PathParam("deptId") Integer deptId) {
        return ebs.getAllEmployeeDetailsBySalaryAndDeptId(amount, deptId);
    }

    @GET
    @RolesAllowed("Admin")
    @Path("/getAllEmployeeDetailsByAgeRange/{start}/{end}")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Salary> getAllEmployeeDetailsByAgeRange(@PathParam("start") Integer start, @PathParam("end") Integer end) {
        return ebs.getAllEmployeeDetailsByAgeRange(start, end);
    }

    @GET
    @RolesAllowed("Admin")
    @Path("/getAllEmployeeByDateRange/{fromDate}/{endDate}")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Salary> getAllEmployeeByDateRange(@PathParam("fromDate") String fromDate, @PathParam("endDate") String endDate) {
        return ebs.getAllEmployeeByDateRange(fromDate, endDate);
    }
}
