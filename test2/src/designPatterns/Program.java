package designPatterns;

import Exceptions.InvalidOperationException;

public class Program
{
    private  int instanceCount;

     Program() 
    {
        if (instanceCount> 5) 
            //throw new InvalidOperationException("Only 5 instances of Program are allowed");
        	instanceCount++;
       
       
    }

 
}