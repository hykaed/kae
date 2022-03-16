import { Component, OnInit } from '@angular/core';
import { FormGroup } from '@angular/forms';

@Component({
  selector: 'app-create-new-employee',
  templateUrl: './create-new-employee.component.html',
  styleUrls: ['./create-new-employee.component.scss']
})
export class CreateNewEmployeeComponent implements OnInit {

  employeeForm:FormGroup;
  constructor() { }

  ngOnInit(): void {
  }

}
