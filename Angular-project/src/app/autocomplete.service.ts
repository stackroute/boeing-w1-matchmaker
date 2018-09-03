import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';
import { debounceTime } from 'rxjs/internal/operators/debounceTime';

@Injectable({
  providedIn: 'root'
})
export class AutocompleteService {

  constructor(private httpService: HttpClient) { }

  searchCity(term) {
    const listOfCities = this.httpService.get(`http://13.232.19.29:8092/autocomplete/api/v1/location/${term}`)
    .pipe(
        debounceTime(500),
        map(
            (data: any) => {
                return (
                    data.length !== 0 ? data as any[] : [{'city': 'No Record Found'} as any]
                );
            }
    ));

    return listOfCities;
}


searchUniversity(term) {
    const listOfUniversities = this.httpService.get(`http://13.232.19.29:8092/autocomplete/api/v1/university/${term}`)
    .pipe(
        debounceTime(500),
        map(
            (data: any) => {
                return (
                    data.length !== 0 ? data as any[] : [{'instituteName': 'No Record Found'} as any]
                );
            }
    ));

    return listOfUniversities;
}

searchSkill(term) {
    const listOfSkills = this.httpService.get(`http://13.232.19.29:8092/autocomplete/api/v1/skill/${term}`)
    .pipe(
        debounceTime(500),
        map(
            (data: any) => {
                return (
                    data.length !== 0 ? data as any[] : [{'name': 'No Record Found'} as any]
                );
            }
    ));

    return listOfSkills;
}

searchCompany(term) {
    const listOfCompany = this.httpService.get(`http://13.232.19.29:8092/autocomplete/api/v1/company/${term}`)
    .pipe(
        debounceTime(500),
        map(
            (data: any) => {
                return (
                    data.length !== 0 ? data as any[] : [{'organizationName': 'No Record Found'} as any]
                );
            }
    ));

    return listOfCompany;
}

}
