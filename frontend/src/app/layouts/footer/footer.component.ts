import { Component } from '@angular/core';
import { MatToolbarModule } from '@angular/material/toolbar';

@Component({
  selector: 'app-footer',
  imports: [MatToolbarModule],
  template: `
    <mat-toolbar color="primary" class="footer">
      <div class="elements">
        <span class="fs">FinanceTrack  -  &copy;2025</span>
      </div>
    </mat-toolbar>
  `,
  styles: `
    .footer {
    display: flex;
    justify-content: space-around;
    width: 100%;
    height: 5%;
    font-size: 15px;
    text-align: center;
    position: fixed;
    bottom: 0;
    background-color:black;
    color: white;
  }`
})
export class FooterComponent {

}
