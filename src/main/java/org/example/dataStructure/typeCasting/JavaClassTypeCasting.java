package org.example.dataStructure.typeCasting;

public class JavaClassTypeCasting {

    public static void main(String[] args){
        downCasting();
        upCasting();
    }

    public static void downCasting() {

        // We don't need to perform an explicit type cast; it will be handled automatically behind the scenes.
        Parent object = (Parent)new Child();
        object.parentShow();
    }

    public static void upCasting() {
        Parent object = new Child();
        Child object2 = (Child) object;
        object2.childShow();
    }
}

class Parent {

    public void parentShow(){
        System.out.println("From Parent");
    }

}

class Child extends Parent {

    public void childShow(){
        System.out.println("From child");
    }

}

