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
 *  In code generator, JDK classes would not be copied to the generated code.
 */
public class JdkDependency {
    private String fullName;

    public JdkDependency(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }
}
