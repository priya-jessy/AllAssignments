import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import { NgForm } from '@angular/forms';
import { Subscription } from 'rxjs';

@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent implements OnInit {

  message:String;

  mySubscription:Subscription;

  constructor(private productService:ProductService) { }

  postProduct(form:NgForm){
    this.productService.postData(form.value).subscribe(response=>{
      console.log(response);
      form.reset();
      if(!response.error){
        this.message='added successfully';
      }
    },error=>{
      console.log(error);
    });
  }
  

  ngOnInit(): void {
  }
 

}
