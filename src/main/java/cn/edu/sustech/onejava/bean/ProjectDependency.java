package cn.edu.sustech.onejava.bean;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ProjectDependency {


    public static boolean isProjectClass(String classFullName) {
        throw new UnsupportedOperationException("TODO");  //TODO
    }

    public String getFullName() {
        throw new UnsupportedOperationException("TODO");  //TODO
    }

    /**
     * @param projectRoot the path of the target project root,
     *                    which was deduced from the target class path and its package info.
     * @return the actual path of the class, to be ready for reading.
     */
    public Path getPath(Path projectRoot) {
        throw new UnsupportedOperationException("TODO");  //TODO
    }
}
