import { Directive } from "@angular/core";
import {
  AsyncValidatorFn,
  AsyncValidator,
  NG_ASYNC_VALIDATORS,
  AbstractControl,
  ValidationErrors
} from "@angular/forms";
import { Observable, throwError } from "rxjs";
import { map, catchError } from "rxjs/operators";
import { RegisterService } from "../../register.service";

@Directive({
  selector:
    "[emailExists][formControlName],[emailExists][formControl],[emailExists][ngModel]",
  providers: [
    {
      provide: NG_ASYNC_VALIDATORS,
      useExisting: ExistingEmailValidatorDirective,
      multi: true
    }
  ]
})
export class ExistingEmailValidatorDirective implements AsyncValidator {
  constructor(private registerService: RegisterService) {}

  validate(
    control: AbstractControl
  ): Promise<ValidationErrors | null> | Observable<ValidationErrors | null> {
    return existingEmail(this.registerService)(control);
  }
}

export function existingEmail(
  registerService: RegisterService
): AsyncValidatorFn {
  return (
    control: AbstractControl
  ): Promise<ValidationErrors | null> | Observable<ValidationErrors | null> => {
    return registerService.checkEmail(control.value).pipe(
      map(users => {
        return users && users.length > 0 ? { emailExists: true } : null;
      }),
      catchError(error => {
        return throwError("Something went wrong!");
      })
    );
  };
}
