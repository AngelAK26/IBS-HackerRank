package com.ibs.hackerrank.javaiterator;
import java.util.*;
public class Main{
	
   @SuppressWarnings("rawtypes")
static Iterator func(ArrayList mylist){
      Iterator it=mylist.iterator();
      while(it.hasNext()){
    	  Object element = it.next();
          if(element.equals("###"))

			break;
		}
      return it;
      
   }
   @SuppressWarnings({ "unchecked" })
   public static void main(String []args){
      @SuppressWarnings("rawtypes")
	ArrayList mylist = new ArrayList();
      @SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      for(int i = 0;i<n;i++){
         mylist.add(sc.nextInt());
      }
      
      mylist.add("###");
      for(int i=0;i<m;i++){
         mylist.add(sc.next());
      }
      
      @SuppressWarnings("rawtypes")
	Iterator it=func(mylist);
      while(it.hasNext()){
        
         String element = null;
		System.out.println((String)element);
      }
   }
}
