import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-posts',
  templateUrl: './posts.component.html',
  styleUrls: ['./posts.component.css']
})
export class PostsComponent implements OnInit {
posts;
  constructor(private http:HttpClient) {
    this.getPosts();
   }

  getPosts(){
    this.http.get('').subscribe(data=>{
      console.log(data);
      this.posts=data;

    });
  }

  ngOnInit(): void {
  }

}
