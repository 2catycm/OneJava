package cn.edu.sustech.onejava.bean;

import junit.framework.TestCase;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ProjectDependencyTest extends TestCase {

    public void testGetPath() {
        final var projectDependency = new ProjectDependency("cn.edu.sustech.onejava.bean.JdkDependency");
        final var path = Paths.get("D:","002_计算机开发","二猫工作室","Java研究中心","OneJava","src","main","java");
        final var x = projectDependency.getPath(path).toAbsolutePath();
        assert(path.toFile().isDirectory());
        System.out.println(x);


    }
}