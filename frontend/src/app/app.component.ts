import { Component } from '@angular/core';
import { RouterLink, RouterOutlet } from '@angular/router';
import { FooterComponent } from './layouts/footer/footer.component';
import { NavComponent } from './layouts/nav/nav.component';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, FooterComponent, NavComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {
  title = 'frontend';
}
