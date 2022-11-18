/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package ejb;

import com.muzammilnagariya.edsapp.entity.Department;
import com.muzammilnagariya.edsapp.entity.Employee;
import com.muzammilnagariya.edsapp.entity.Salary;
import java.util.Collection;
import java.util.Date;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author muzz
 */
@Stateless
public class EDSSessionBean {
    
    @PersistenceContext(unitName = "com.muzammilnagariya_EDSApp_war_1.0-SNAPSHOTPU")
    EntityManager em;

    //Employee
    public Collection<Employee> getAllEmployee(){
        return em.createNamedQuery("Employee.findAll").getResultList();
    }
    
    public Collection<Employee> getAllEmployeeByDeptId(Integer deptId){
        return em.createNamedQuery("Employee.findByDeptId").setParameter("deptId", deptId).getResultList();
    }
    
    //
    public Collection<Department> getAllDepartment(){
        return em.createNamedQuery("Department.findAll").getResultList();
    }
    
    //Salary
    
    public Collection<Salary> getAllEmployeeSalaryDetailsByDeptId(Integer deptId){
        return em.createNamedQuery("Salary.findByDeptId").setParameter("deptId", deptId).getResultList();
    }
    
    public Collection<Salary> getAllEmployeeSalaryDetails(){
        return em.createNamedQuery("Salary.findAll").getResultList();
    }
    
    public Collection<Salary> getAllEmployeeDetailsBySalary(Integer amount){
        return em.createNamedQuery("Salary.findByAmount").setParameter("amount", amount).getResultList();
    }
    
    public Collection<Salary> getAllEmployeeDetailsBySalaryAndDeptId(Integer amount,Integer deptId){
        return em.createNamedQuery("Salary.findByAmountAndDeptId").setParameter("amount", amount).setParameter("deptId", deptId).getResultList();
    }
    
    public Collection<Salary> getAllEmployeeDetailsByAgeRange(Integer start,Integer end){
        return em.createNamedQuery("Salary.findByAgeRange").setParameter("start", start).setParameter("end", end).getResultList();
    }
    
    public Collection<Salary> getAllEmployeeByDateRange(String fromDate, String endDate){
        return em.createNamedQuery("Salary.findByDateRange").setParameter("fromDate", fromDate).setParameter("endDate", endDate).getResultList();
    }
}
