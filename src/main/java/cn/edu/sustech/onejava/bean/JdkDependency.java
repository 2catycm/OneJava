package cn.edu.sustech.onejava.bean;

/**
 *  This class is a data class representing the dependency on JDK classes.
 *  For example, a java file having such import statement is depending on JDK class "java.util.Scanner"
 *  <textarea>
 *      import java.util.Scanner;
 *  </textarea>
 *  Also, the file may use TreeMap and like this:
 *  <textarea>
 *      import java.util.*;
 *      var map = new TreeMap< String, Double>();
 *      var map = new java.util.TreeMap< String, Double>();
 *  </textarea>
 *  Notice that "java.lang" but not "java.lang.other_package_in_lang" is special that it cannot and need not be imported.
 *  In code generator, JDK classes would not be copied to the generated code.
 */
public class JdkDependency {
    public static boolean isJDKClass(String classFullName){
        System.out.println();
        throw new UnsupportedOperationException("TODO");  //TODO
    }
    public String getFullName() {
        throw new UnsupportedOperationException("TODO");  //TODO
    }
}
