import {MatButtonModule, MatCheckboxModule} from '@angular/material';
import { NgModule } from '@angular/core';

import {MatDialogModule} from '@angular/material/dialog';
import {MatChipsModule} from '@angular/material/chips';
import { MatOption, MatOptionModule, MatSelectModule, MatButton} from '@angular/material';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatCardModule, MatMenuModule, MatToolbarModule, MatIconModule, MatAutocompleteModule, MatInputModule,MatFormFieldModule } from '@angular/material';
import { FlexLayoutModule } from '@angular/flex-layout';
import {MatTooltipModule} from '@angular/material/tooltip';
import {MatRadioModule} from '@angular/material/radio';
@NgModule({
  imports: [ MatCheckboxModule, MatMenuModule, 
    MatIconModule, MatDialogModule, MatToolbarModule, MatFormFieldModule,
    MatOptionModule, MatOptionModule, MatSelectModule, BrowserAnimationsModule, MatCardModule,
    MatAutocompleteModule, MatInputModule,MatChipsModule, FlexLayoutModule, MatTooltipModule, MatRadioModule ],

  exports: [ MatCheckboxModule, MatMenuModule, MatIconModule, 
    MatDialogModule, MatToolbarModule, MatFormFieldModule,
    MatOptionModule, MatOptionModule, MatSelectModule, BrowserAnimationsModule, 
    MatCardModule, MatAutocompleteModule, MatInputModule,MatChipsModule, FlexLayoutModule, MatTooltipModule,
    MatRadioModule ]
})
export class MaterialModule { }
