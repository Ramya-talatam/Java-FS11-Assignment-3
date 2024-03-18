class ThreadOps{  
void ops(){  
   for(int i=1;i<=5;i++){  
     System.out.println(Thread.currentThread().getName()+" ("+i+")");
     try{  
      Thread.sleep(400);  
     }catch(Exception e){System.out.println(e);}  
   }  
  
 }  
}  
  
class threadObj1 extends Thread{  
ThreadOps t;  
public threadObj1(ThreadOps t){  
    this.t=t; 
}  
public void run(){  
    t.ops();  
}
}  
class threadObj2 extends Thread{  
ThreadOps t;  
public threadObj2(ThreadOps t){  
    this.t=t; 
}  
public void run(){  
    t.ops();  
}
}  
  
class Synchronization{  
public static void main(String args[]){  
ThreadOps obj = new ThreadOps();  
threadObj1 t1=new threadObj1(obj);  
threadObj2 t2=new threadObj2(obj);  
t1.start();  
t2.start();  
}  
}  