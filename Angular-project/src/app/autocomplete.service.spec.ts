import { TestBed, inject } from '@angular/core/testing';

import { AutocompleteService } from './autocomplete.service';

describe('AutocompleteService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [AutocompleteService]
    });
  });

  it('should be created', inject([AutocompleteService], (service: AutocompleteService) => {
    expect(service).toBeTruthy();
  }));
});
