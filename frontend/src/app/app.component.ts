import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { TransactionComponent } from './transaction/transaction.component';
import { LogInComponent } from './log-in/log-in.component';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, TransactionComponent, LogInComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {
  title = 'frontend';
}
