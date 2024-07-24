package main.interfaces.Impl;
import main.interfaces.StringOperation;

public abstract class Decorator implements StringOperation {
        StringOperation operations;

         @Override
         public String operate(String subString) {
             return this.operations.operate(subString);
         }

         public Decorator(StringOperation operations){
             this.operations=operations;
        }


     }



