import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-create-new-employee',
  templateUrl: './create-new-employee.component.html',
  styleUrls: ['./create-new-employee.component.scss']
})
export class CreateNewEmployeeComponent implements OnInit {
  editMode:boolean= false
  employeeForm:FormGroup;
  constructor(private employeeService:EmployeeService,
              private fb: FormBuilder) { 
              
      this.employeeForm = this.fb.group({
      employeeId:['',[Validators.required]],
      name: ['', [Validators.required]],
      lastName: ['', [Validators.required]],
      jobPosition: ['', [Validators.required]],
      salary: ['', [Validators.required]],
              })  

              }

  ngOnInit(): void {
    this.employeeService.employeeSub.subscribe((response:any)=>{
      this.editMode = response? true: false;
      if(this.editMode){
        this.employeeForm.patchValue(response);
      }else{
        this.employeeForm.reset();
      }
    })
  }

}
