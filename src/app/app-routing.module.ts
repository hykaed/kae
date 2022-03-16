import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DashboardComponent } from './dashboard/dashboard.component';
import { CreateNewEmployeeComponent } from './employers/create-new-employee/create-new-employee.component';
import { ListOfEmployerComponent } from './employers/list-of-employer/list-of-employer.component';
import { LoginComponent } from './login/login.component';
import { CreateNewComponent } from './projects/create-new/create-new.component';
import { ListOfProjectComponent } from './projects/list-of-project/list-of-project.component';

const routes: Routes = [
  {path: "dashboard", component:DashboardComponent},
  {path: '', redirectTo: 'dashboard', pathMatch: 'full' },
  {path: "list-of-project", component:ListOfProjectComponent},
  {path: "list-of-employee", component:ListOfEmployerComponent},
  {path: "create-new-project", component: CreateNewComponent},
  {path: "create-new-emplyee",component: CreateNewEmployeeComponent},
  {path: "modify-project/:id", component: CreateNewComponent},
  {path: "modify-employee/:id", component: CreateNewEmployeeComponent},
  {path: "login", component: LoginComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
