import {MatButtonModule, MatCheckboxModule} from '@angular/material';
import { NgModule } from '@angular/core';
import {MatSidenavModule} from '@angular/material/sidenav';
import {MatDialogModule} from '@angular/material/dialog';
import {MatChipsModule} from '@angular/material/chips';
import { MatOption, MatOptionModule, MatSelectModule, MatButton} from '@angular/material';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatCardModule, MatMenuModule, MatToolbarModule, MatIconModule, MatAutocompleteModule,
   MatInputModule, MatFormFieldModule } from '@angular/material';
import { FlexLayoutModule } from '@angular/flex-layout';
import {MatTooltipModule} from '@angular/material/tooltip';
import {MatRadioModule} from '@angular/material/radio';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatNativeDateModule, MatSliderModule, DateAdapter} from '@angular/material';
@NgModule({
  imports: [ MatCheckboxModule, MatMenuModule,MatSidenavModule,MatDatepickerModule,
    MatIconModule, MatDialogModule, MatToolbarModule, MatFormFieldModule,MatNativeDateModule, MatSliderModule,
    MatOptionModule, MatOptionModule, MatSelectModule, BrowserAnimationsModule, MatCardModule,
    MatAutocompleteModule, MatInputModule, MatChipsModule, FlexLayoutModule, MatTooltipModule, MatRadioModule ],

  exports: [ MatCheckboxModule, MatMenuModule, MatIconModule,MatSidenavModule,MatDatepickerModule,
    MatDialogModule, MatToolbarModule, MatFormFieldModule,MatNativeDateModule, MatSliderModule,
    MatOptionModule, MatOptionModule, MatSelectModule, BrowserAnimationsModule,
    MatCardModule, MatAutocompleteModule, MatInputModule, MatChipsModule, FlexLayoutModule, MatTooltipModule,
    MatRadioModule ]
})
export class MaterialModule { }
