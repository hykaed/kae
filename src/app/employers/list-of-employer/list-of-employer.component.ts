import { Component, OnInit, ViewChild } from '@angular/core';
import { MatPaginator } from '@angular/material/paginator';
import { MatSort } from '@angular/material/sort';
import { MatTableDataSource } from '@angular/material/table';
import { Observable, Subscription } from 'rxjs';
import { IEmployee } from 'src/app/models/project.interface';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-list-of-employer',
  templateUrl: './list-of-employer.component.html',
  styleUrls: ['./list-of-employer.component.scss']
})
export class ListOfEmployerComponent implements OnInit {
  employeeSub:Subscription = new Subscription;
  employee:Observable<IEmployee>[]=[];
  displayedColumns:string[]=['name','lastName','jobPosition','edit','delete']
  dataSource!: MatTableDataSource<any>;
  constructor(private employeeService:EmployeeService) { }

  @ViewChild(MatPaginator)
  paginator!: MatPaginator;
  @ViewChild(MatSort)
  sort!: MatSort;
  ngAfterViewInit() {
    this.dataSource.paginator = this.paginator;
    this.dataSource.sort = this.sort;
  }
  ngOnInit(): void {
    this.employeeSub = this.employeeService.getAllEmployees()
    .subscribe((response:any)=>{
      console.log(response)
      this.employee = response
    });
    this.dataSource = new MatTableDataSource(this.employee)
  }
  applyFilter(event:Event){
    const filterValue = (event.target as HTMLInputElement).value;
    this.dataSource.filter = filterValue.trim().toLowerCase();
  }

}