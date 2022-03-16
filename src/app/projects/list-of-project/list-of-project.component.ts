import { Component, OnInit, ViewChild } from '@angular/core';
import { MatPaginator } from '@angular/material/paginator';
import { MatSort } from '@angular/material/sort';
import { MatTableDataSource } from '@angular/material/table';
import { Observable, Subscription } from 'rxjs';
import { IProject } from '../../models/project.interface';
import { ProjectsService } from '../../projects.service';

@Component({
  selector: 'app-list-of-project',
  templateUrl: './list-of-project.component.html',
  styleUrls: ['./list-of-project.component.scss']
})
export class ListOfProjectComponent implements OnInit {
  projectSub:Subscription = new Subscription;
  projects:Observable<IProject>[]=[]
  displayedColumns: string[] = ['name','startDate', 'endDate', 'edit','delete'];
  dataSource!: MatTableDataSource<any>;
  constructor(private projectsService:ProjectsService) { }

  @ViewChild(MatPaginator)
  paginator!: MatPaginator;
  @ViewChild(MatSort)
  sort!: MatSort;

  ngAfterViewInit() {
    this.dataSource.paginator = this.paginator;
    this.dataSource.sort = this.sort;
  }
  ngOnInit(): void {
    this.projectSub = this.projectsService.getProjects()
    .subscribe((response:any)=>{
      console.log(response)
      this.projects = response
    });
    this.dataSource = new MatTableDataSource(this.projects)
  }
  applyFilter(event: Event) {
    const filterValue = (event.target as HTMLInputElement).value;
    this.dataSource.filter = filterValue.trim().toLowerCase();
  }

}
