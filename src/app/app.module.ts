import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NavbarComponent } from './navbar/navbar.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { ListOfProjectComponent } from './projects/list-of-project/list-of-project.component';
import { CreateNewComponent } from './projects/create-new/create-new.component';
import { ListOfEmployerComponent } from './employers/list-of-employer/list-of-employer.component';
import { ProjectDetailComponent } from './projects/project-detail/project-detail.component';


import { MaterialModule } from './shared/material/material.module';
import { ToolbarComponent } from './toolbar/toolbar.component';
import { ReactiveFormsModule } from '@angular/forms';
import { LoginComponent } from './login/login.component';
import { CreateNewEmployeeComponent } from './employers/create-new-employee/create-new-employee.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    DashboardComponent,
    ListOfProjectComponent,
    CreateNewComponent,
    ListOfEmployerComponent,
    ProjectDetailComponent,
    ToolbarComponent,
    LoginComponent,
    CreateNewEmployeeComponent,
   
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    ReactiveFormsModule,
    MaterialModule
  
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
