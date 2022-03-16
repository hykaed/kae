import { Injectable } from '@angular/core';
import { of, Subject } from 'rxjs';
import { IEmployee } from '../models/project.interface';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  employeeSub = new Subject();
  employee: Array<IEmployee>=[
    {
      employeeId: 1,
      name: 'Employee1',
      lastName: 'lastname',
      jobPosition: 'FrontEnd',
      salary: 50, 
    },
    {
      employeeId: 2,
      name: 'Employee2',
      lastName: 'lastname',
      jobPosition: 'BackEnd',
      salary: 510, 
    },
    {
      employeeId: 3,
      name: 'Employee3',
      lastName: 'lastname',
      jobPosition: 'FrontEnd',
      salary: 250, 
    }
  ]
  constructor() { }
  getAllEmployees(){
    return of(this.employee)
  }
  getEmployeeSubject(){
    return this.employeeSub
  }
  setEmployeeSubject(employee:any){
    return this.employeeSub.next(employee)
  }
}
