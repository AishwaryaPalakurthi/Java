package com.boot.payload;

import java.util.ArrayList;
import java.util.List;

import com.boot.entity.EmployeeEntity;
import com.boot.entity.ProjectEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentDTO {
	
	
	 private int departmentId;
     
     private String departmentName;
     
     @JsonIgnore
     List<EmployeeDTO> employeeList = new ArrayList();
   
     @JsonIgnore
     List<ProjectDTO> projectList=new ArrayList();

}