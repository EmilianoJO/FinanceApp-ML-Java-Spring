import { Component } from '@angular/core';
import { RouterLink } from '@angular/router';
import { MatIconModule } from '@angular/material/icon'

@Component({
  selector: 'app-nav',
  imports: [RouterLink, MatIconModule],
  template: `
      <nav>
        <a routerLink="/home"><img src="./twy.png" alt="image" class="logo"></a>
        
      </nav>
  `,
  styles: `
  .logo{
    width: 10%
  }`
})
export class NavComponent {

}
