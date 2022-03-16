import { Injectable } from '@angular/core';
import { of, Subject } from 'rxjs';
import { IProject } from './models/project.interface';

@Injectable({
  providedIn: 'root',
})
export class ProjectsService {
 // basePath:string = 'http://localhost:8080/api/v1'
  projectSub = new Subject();
 
  
  projects: Array<IProject> = [
  
      {
        id: 1,
        name: 'Project1',
        description: 'This is a big project for...',
        startDate: '12-2-2022',
        endDate: '30-3-2022',
        value: 50,
        employer: {
          employeeId: 1,
          name: 'Bela',
          lastName: 'Braho',
          jobPosition: 'FrontEnd',
          salary: 2566,
        },
        task: {
          taskId: 1,
          name: 'task1',
          description: 'This is a big project for...',
          startDate: '12-2-2022',
          endDate: '30-3-2022',
          employee: 'Bela Braho',
        },
      },
      {
        id: 2,
        name: 'Project2',
        description: 'This is a big project for...',
        startDate: '12-2-2022',
        endDate: '03-04-2022',
        value: 50,
        employer: {
          employeeId: 2,
          name: 'Bela',
          lastName: 'Braho',
          jobPosition: 'FrontEnd',
          salary: 2566,
        },
        task: {
          taskId: 2,
          name: 'task1',
          description: 'This is a big project for...',
          startDate: '12-2-2022',
          endDate: '30-3-2022',
          employee: 'Bela Braho',
        },
      },
      {
        id: 3,
        name: 'Project3',
        description: 'This is a big project for...',
        startDate: '01-02-2022',
        endDate: '03-05-2022',
        value: 50,
        employer: {
          employeeId: 3,
          name: 'Bela',
          lastName: 'Braho',
          jobPosition: 'FrontEnd',
          salary: 2566,
        },
        task: {
          taskId: 1,
          name: 'task1',
          description: 'This is a big project for...',
          startDate: '12-2-2022',
        endDate: '30-3-2022',
          employee: 'Bela Braho',
        },
      },
      {
        id: 4,
        name: 'Project4',
        description: 'This is a big project for...',
        startDate: '06-02-2022',
        endDate: '12-04-2022',
        value: 50,
        employer: {
          employeeId: 1,
          name: 'Bela',
          lastName: 'Braho',
          jobPosition: 'FrontEnd',
          salary: 2566,
        },
        task: {
          taskId: 1,
          name: 'task1',
          description: 'This is a big project for...',
          startDate: '12-2-2022',
          endDate: '30-3-2022',
          employee: 'Bela Braho',
        },
      },
      {
        id: 5,
        name: 'Project5',
        description: 'This is a big project for...',
        startDate: '12-2-2022',
        endDate: '03-04-2022',
        value: 50,
        employer: {
          employeeId: 1,
          name: 'Bela',
          lastName: 'Braho',
          jobPosition: 'FrontEnd',
          salary: 2566,
        },
        task: {
          taskId: 5,
          name: 'task1',
          description: 'This is a big project for...',
          startDate: '12-2-2022',
          endDate: '30-3-2022',
          employee: 'Bela Braho',
        },
      },
      {
        id: 6,
        name: 'Project6',
        description: 'This is a big project for...',
        startDate: '12-2-2022',
        endDate: '03-04-2022',
        value: 50,
        employer: {
          employeeId: 1,
          name: 'Bela',
          lastName: 'Braho',
          jobPosition: 'FrontEnd',
          salary: 2566,
        },
        task: {
          taskId: 6,
          name: 'task2',
          description: 'This is a big project for...',
          startDate: '12-2-2022',
          endDate: '30-3-2022',
          employee: 'Bela Braho',
        },
      },
    ];
    getProjects(){
    return of(this.projects);
   // return this.http.get(this.basePath + '/projects')
  }
    constructor() {}
    getProjectSubject(){
      return this.projectSub
     }
     setProjectSubject(project:any){
       this.projectSub.next(project)
     }

  
  /*
  createNewProject(body:IProject){
    return this.http.post(this.basePath + '/project', body)
  }
  updateProject(body:IProject){
    return this.http.put(this.basePath + '/project'+ body.id, body )
  }
  deleteStudent(id:number){
    return this.http.delete(this.basePath + '/project' + id ) 
  }
   } */
  }



    