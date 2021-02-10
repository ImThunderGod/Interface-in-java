package com.company;

public class Person implements Student,YouTube{
    public static void main(String[] args) {
        Person obj = new Person();
        obj.study();
        obj.makeVideo();
    }

    @Override
    public void study() {
        System.out.println("Person is studying");
    }

    @Override
    public void makeVideo() {
        System.out.println("Person is making videos");

    }
}

//make another java clas as Youtube;

package com.company;

public abstract interface YouTube {

    abstract void makeVideo();


}

//make another java class as Student;

package com.company;

public abstract interface Student {
    abstract void study();


}