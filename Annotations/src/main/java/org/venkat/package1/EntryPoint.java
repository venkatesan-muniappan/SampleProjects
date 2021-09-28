package org.venkat.package1;

/**
 * This is document
 */
public class EntryPoint {
    public static void main(String[] args) {
        DefaultAnnotations da = new DefaultAnnotations();
        @SuppressWarnings("unused")
        int abc = da.getString("Agastya");
//        int abc = da.getString("Venkat");

        System.out.println("Before update Name is " + da.getName());
        System.out.println("Before update age is " + da.getAge());
        da.setName("Venkat");
        da.setAge(30);
        System.out.println("After update Name is " + da.getName());
        System.out.println("After update Age is " + da.getAge());
        System.out.println("Test");
    }
}
