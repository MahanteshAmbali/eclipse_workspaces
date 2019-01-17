/*The Runnable interface's void run( ) method has no way of returning any result back to the main thread. 
The executor framework introduced the Callable interface that returns a value from its call( ) method.
This means the asynchronous task will be able to return a value once it is done executing.*/

package com.threadpool.callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
 
 
public class Sum  implements Callable<String> {
  
 private static final int NO_OF_THREADS = 3;
  
 int maxNumber;
  
 public Sum(int maxNumber) {
    this.maxNumber = maxNumber;
 }
  
  /** method where the thread execution will start
    *  this can return a value
    */
    public String call(){
        int sum = 0;
        for (int i = 0; i <= maxNumber; i++) {
            sum += maxNumber;
        } 
         
        return Thread.currentThread().getName() + " count is " + sum;
    }
     
     
    /** main thread. Alwyas there by default. **/
    public static void main(String[] args) {
      ExecutorService executor = Executors.newFixedThreadPool(NO_OF_THREADS);                       // create a pool of 3 threads
      List<Future<String>> list = new ArrayList<Future<String>>(10);  // provides facility to return results asynchronously
      
      for (int i = 10000; i < 10100; i++) {
        Callable<String> worker = new Sum(i);                 // create worker threads 
        Future<String> submit = executor.submit(worker);      // add callables to the work queue
        list.add(submit);                                            // provides facility to return results asynchronously
      }
   
      //process the results asynchronously when each thread completes its task
      for (Future<String> future : list) {
        try {
            System.out.println("Thread " + future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
           e.printStackTrace();
        }
      }
   
   
      executor.shutdown();
   
      System.out.println("Finished all threads");
   }
 
}
