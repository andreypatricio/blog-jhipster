import { Moment } from 'moment';
import { IBlog } from 'app/shared/model/blog.model';

export interface IPost {
    id?: string;
    title?: string;
    content?: string;
    date?: Moment;
    blog?: IBlog;
}

export class Post implements IPost {
    constructor(public id?: string, public title?: string, public content?: string, public date?: Moment, public blog?: IBlog) {}
}
