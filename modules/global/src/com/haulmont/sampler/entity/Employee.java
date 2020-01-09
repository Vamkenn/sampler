package com.haulmont.sampler.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@NamePattern("%s|name")
@Table(name = "SAMPLER_EMPLOYEE")
@Entity(name = "sampler_Employee")
public class Employee extends StandardEntity {
    private static final long serialVersionUID = -5217124568295017832L;

    @Column(name = "NAME")
    protected String name;

    @Column(name = "LAST_NAME")
    protected String lastName;

    @Column(name = "AGE")
    protected Integer age;

    @Column(name = "DEPARTMENT")
    protected Integer department;

    @Column(name = "EXPERIENCE")
    protected Integer experience;

    @Column(name = "SALARY")
    protected BigDecimal salary;

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Experience getExperience() {
        return experience == null ? null : Experience.fromId(experience);
    }

    public void setExperience(Experience experience) {
        this.experience = experience == null ? null : experience.getId();
    }

    public Department getDepartment() {
        return department == null ? null : Department.fromId(department);
    }

    public void setDepartment(Department department) {
        this.department = department == null ? null : department.getId();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}