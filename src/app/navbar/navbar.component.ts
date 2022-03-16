import { BreakpointObserver, Breakpoints, BreakpointState } from '@angular/cdk/layout';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.scss']
})
export class NavbarComponent implements OnInit {
  public isScreenSmall: boolean = false;
  constructor(private breakpointObserve:BreakpointObserver) { }

  ngOnInit(): void {
    this.breakpointObserve
    .observe([Breakpoints.Small,Breakpoints.XSmall],)
    .subscribe((state:BreakpointState)=>{
      this.isScreenSmall = state.matches
    })
  }

}
