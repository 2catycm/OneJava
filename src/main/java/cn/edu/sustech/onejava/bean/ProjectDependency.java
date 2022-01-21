package cn.edu.sustech.onejava.bean;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ProjectDependency{
    private String fullName;

    public ProjectDependency(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public Path getPath(Path projectRoot){
        return Paths.get(projectRoot.toString(), fullName);
    }

}
