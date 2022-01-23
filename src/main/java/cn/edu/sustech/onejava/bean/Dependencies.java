package cn.edu.sustech.onejava.bean;

import java.util.HashSet;
import java.util.Set;

public class Dependencies {
    public Set<JdkDependency> getJdkDependencies() {
        return jdkDependencies;
    }

    public Set<ProjectDependency> getProjectDependencies() {
        return projectDependencies;
    }

    public Dependencies(HashSet<JdkDependency> jdkDependencies, HashSet<ProjectDependency> projectDependencies) {
        this.jdkDependencies = jdkDependencies;
        this.projectDependencies = projectDependencies;
    }

    private HashSet<JdkDependency> jdkDependencies;
    private HashSet<ProjectDependency> projectDependencies;
}
