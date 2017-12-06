import {Injectable} from '@angular/core';
import {Http, Response, Headers, URLSearchParams, RequestOptions} from '@angular/http';
import {Observable} from 'rxjs';

import {Article} from './article';

@Injectable()
export class ArticleService{
    article : Article;
    articleUrl= "https://employees-c11.firebaseio.com/";
    constructor(private http:Http){ }
    getAllArticles():Observable<Article[]>{ 
        let cpHeaders = new Headers({ 'Content-Type': 'application/json' });
        let options = new RequestOptions({ headers: cpHeaders });
return this.http.get(this.articleUrl,options).map(this.extractData).catch(this.handleError);
}

    }

