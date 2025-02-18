import { Routes } from '@angular/router';
import { LogInComponent } from './log-in/log-in.component';
import { TransactionComponent } from './transaction/transaction.component';

export const routes: Routes = [
    { path: 'login', component: LogInComponent },
    { path: 'transaction', component: TransactionComponent },
    { path: '**', redirectTo: 'login' }
];
