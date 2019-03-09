import { NgModule } from '@angular/core';

import { BlogunivaliSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
    imports: [BlogunivaliSharedLibsModule],
    declarations: [JhiAlertComponent, JhiAlertErrorComponent],
    exports: [BlogunivaliSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class BlogunivaliSharedCommonModule {}
