package com.ibs.hackerrank.javaabstractclass;
 abstract class Book {
		String title;
		abstract void setTitle(String s);
		String getTitle(){
			return title;
		}
		
	}
//Write MyBook class here
class MyBook extends Book{
   @Override
   void setTitle(String s) {
       title = s;
   }
}

