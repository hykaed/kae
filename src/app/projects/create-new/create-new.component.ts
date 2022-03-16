import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators, FormArray } from '@angular/forms';
import { MatDialog } from '@angular/material/dialog';
import { ProjectsService } from 'src/app/projects.service';

@Component({
  selector: 'app-create-new',
  templateUrl: './create-new.component.html',
  styleUrls: ['./create-new.component.scss']
})
export class CreateNewComponent implements OnInit {

  editMode: boolean = false;
  projectForm: FormGroup;
  get employees():FormArray{
    return <FormArray>this.projectForm.get('employees')
  } 
  get tasks():FormArray{
    return <FormArray>this.projectForm.get('tasks')
  }  
  constructor(
     private projectService: ProjectsService,
     private fb: FormBuilder,
     private dialog: MatDialog
     ) {
    this.projectForm = this.fb.group({
      id:['',[Validators.required]],
      name: ['', [Validators.required]],
      description: ['', [Validators.required]],
      startDate: ['', [Validators.required]],
      endDate: ['', [Validators.required]],
      //employee: this.buildEmployee(),
      employees:this.fb.array([this.buildEmployees()]),
      tasks:this.fb.array([this.buildTasks()]) 
    });
  }
  addEmployees():void{
    this.employees.push(this.buildEmployees())
  }
  addTasks():void{
    this.tasks.push(this.buildTasks())
  }
  buildEmployees():FormGroup{
    return this.fb.group({ 
      //employeeId:['',[Validators.required]],
      name: ['',[Validators.required]],
      lastName: ['',[Validators.required]],
      //jobPosition:['',[Validators.required]],
     // salary:['',[Validators.required]]
    })
  }
  buildTasks():FormGroup{
    return this.fb.group({ 
     // taskId:['',[Validators.required]],
      name:['',[Validators.required]],
      description:['',[Validators.required]],
      startDate: ['', [Validators.required]],
      endDate: ['', [Validators.required]],
      employee:['',[Validators.required]]
    })
  }
  ngOnInit(): void {
    this.projectService.projectSub.subscribe((response:any)=>{
      console.log(response);
      this.editMode = response? true: false;
      if (this.editMode){
        this.projectForm.patchValue(response);
      }else{
        this.projectForm.reset();
      }
    })
   
  }
  /* saveProject() {
    if (this.editMode) {
      this.projectService
        .editProject(this.projectForm.value)
        .subscribe((response) => {});
    } else {
      this.projectService
        .postProject(this.projrctForm.value)
        .subscribe((respons: any) => {
          console.log(respons);
        });
    }
  }
 */

  /* ngOnChanges() {
    console.log('editMode', this.editMode);
    if (this.editMode) {
      this.projectForm = this.fb.group({
        name: [this.editMode.name.rendered, [Validators.required]],
        description: [this.editMode.description.rendered, [Validators.required]],
        startDate: [this.editMode.startDate, [Validators.required]],
        endDate: [this.editMode.endDate, [Validators.required]],
      });
    }else{
      this.projectForm.reset()
    }
  }
  saveProject() {
    if (this.editMode) {
      this.projectService
        .updateProject(this.editMode.id, this.projectForm.value)
        .subscribe((response: any) => {});
    } else {
      this.projectService
        .createNewProject(this.projectForm.value)
        .subscribe((respons: any) => {
          console.log(respons);
        });
    }
  } */
 
/* 
  openDialog() {
    const dialogRef = this.dialog.open(DialogComponent, {
      data: {
        dialogText: this.editMode
          ? 'Are you sure you want to edit'
          : ' Are you sure you want to create',
        dialogBtn: this.editMode ? 'Edit' : 'Create',
        dialogBtnColor: this.editMode ? 'accent' : 'primary',
      },
    });
    dialogRef.afterClosed().subscribe((respons) => {
      console.log(respons);
      if (respons) {
        this.saveProject();
        this.projectService.toggleForm(false);
      }
    });
    console.log(this.projectForm.status)
    console.log(this.projectForm.value)
  }
}
function DialogComponent(DialogComponent: any, arg1: { data: { dialogText: string; dialogBtn: string; dialogBtnColor: string; }; }) {
  throw new Error('Function not implemented.');
}
 */
}