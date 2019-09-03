package de.stefanschade.learning.timbuch.masterclass.ch09;

public class InnerClassExample {

    private String fieldOfOuterClass;
    private int filedWithNameConflict;
    private ThisIsTheInnerClass inner1;
    private ThisIsTheInnerClass inner2;

    public InnerClassExample(String fieldOfOuterClass, int anotherFieldOfOuterClass) {
        this.fieldOfOuterClass = fieldOfOuterClass;
        this.filedWithNameConflict = anotherFieldOfOuterClass;
    }

    public InnerClassExample(String fieldOfOuterClass, int filedWithNameConflict, String fieldOfInnerClass, int nameConflictFieldOfInnerClass) {

        this(fieldOfOuterClass,filedWithNameConflict);
        this.inner1 = new ThisIsTheInnerClass(fieldOfInnerClass,  nameConflictFieldOfInnerClass);
        this.inner2 = new ThisIsTheInnerClass(fieldOfInnerClass+fieldOfOuterClass,  nameConflictFieldOfInnerClass+this.filedWithNameConflict);
    }

    public String getFieldOfOuterClass() {
        return fieldOfOuterClass;
    }


    public void printFields() {

        System.out.println("Fields of the Outer Class");
        System.out.println("-------------------------");
        System.out.println("String: "+this.getFieldOfOuterClass());
        System.out.println("int:    "+this.filedWithNameConflict);


        System.out.println();
        System.out.println("Fields of the Inner Class1");
        System.out.println("--------------------------");
        this.inner1.printfields();

        System.out.println();
        System.out.println("Fields of the Inner Class2");
        System.out.println("--------------------------");
        this.inner2.printfields();

    }


    public static void main(String[] args) {

        // the inner1 class is non static, therefore we need an
        // instance of the outer class

        InnerClassExample outerClass = new InnerClassExample("abc",1);

        // funny syntax.

        ThisIsTheInnerClass innerClass = outerClass.new ThisIsTheInnerClass("def",2);
        System.out.println("InnerClassExample.field: " + innerClass.getFieldOfInnerClass());
        System.out.println();
        // this won't work as we need an instance
        // ThisIsTheInnerClass innerClass1 = new ThisIsTheInnerClass("xyz",2)

        // usually, the inner1 class is instantiated by the outer class
        // after all it is all about encapsulation

        InnerClassExample outerClass2 = new InnerClassExample("abc", 1, "def",2);
        outerClass2.printFields();

    }

    private class ThisIsTheInnerClass {

        private String fieldOfInnerClass;
        private int fieldWithNameConflict;

        public ThisIsTheInnerClass(String fieldOfInnerClass, int anotherFiledOfInnerClass) {
            this.fieldOfInnerClass = fieldOfInnerClass;
            this.fieldWithNameConflict = anotherFiledOfInnerClass;
        }

        public String getFieldOfInnerClass() {
            return fieldOfInnerClass;
        }

        public void printfields(){

            System.out.print("String: "+this.getFieldOfInnerClass());
            System.out.print("\n");
            System.out.print("int:    "+this.fieldWithNameConflict);
            System.out.print("\n\t");
            System.out.print("fields of outer class can be accessed from inner class");
            System.out.print("\n\t");
            System.out.print("Outer String:           "+fieldOfOuterClass);
            System.out.print("\n\t");
            System.out.print("does not work if shaded by name conflict");
            System.out.print("\n\t");
            System.out.print("Outer int is shaddowed: "+fieldWithNameConflict);
            System.out.print("\n\t");
            System.out.print("Therefore it is clearer to use: "+this.fieldWithNameConflict);
            System.out.print("\n\t");
            System.out.print("but there is a way around");
            System.out.print("\n\t");
            System.out.print("Outer int is shaddowed: "+ InnerClassExample.this.filedWithNameConflict);
            System.out.print("\n");
        }
    }
}
