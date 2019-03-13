import { IPost } from 'app/shared/model/post.model';

export interface IBlog {
    id?: string;
    blogName?: string;
    description?: string;
    userAdmin?: string;
    posts?: IPost[];
}

export class Blog implements IBlog {
    constructor(
        public id?: string,
        public blogName?: string,
        public description?: string,
        public userAdmin?: string,
        public posts?: IPost[]
    ) {}
}
