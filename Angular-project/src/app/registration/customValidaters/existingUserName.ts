import { Directive } from '@angular/core';
import { AsyncValidatorFn, AsyncValidator, NG_ASYNC_VALIDATORS, AbstractControl, ValidationErrors } from '@angular/forms';
import { Observable, throwError } from "rxjs";
import { map, catchError } from 'rxjs/operators';
import { RegisterService } from '../../register.service';


@Directive({
    selector: '[usernameExists][formControlName],[usernameExists][formControl],[usernameExists][ngModel]',
    providers: [{provide: NG_ASYNC_VALIDATORS, useExisting: ExistingUsernameValidatorDirective, multi: true}]
  })

  export class ExistingUsernameValidatorDirective implements AsyncValidator {
    constructor(private registerService:RegisterService) {  }
  
    validate(control: AbstractControl): Promise<ValidationErrors | null> | Observable<ValidationErrors | null> {
      return existingUserName(this.registerService)(control);  
    }
  } 

  export function existingUserName(registerService:RegisterService): AsyncValidatorFn {
    return (control: AbstractControl): Promise<ValidationErrors | null> | Observable<ValidationErrors | null> => {
        return registerService.checkUserName(control.value)
       .pipe(
            map(
          users => {
            return (users && users.length > 0) ? {"usernameExists": true} : null;
          }
        ),catchError( error => {
             return throwError( 'Something went wrong!' )
           })
        )
    };
  }