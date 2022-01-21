package cn.edu.sustech.onejava.bean;

import cn.edu.sustech.onejava.bean.inter.Dependencies;

import java.util.HashSet;
import java.util.Set;

public class DependenciesImpl implements Dependencies {
    private HashSet<JdkDependency> jdkDependencies;
    private HashSet<ProjectDependency> projectDependencies;
    @Override
    public Set<JdkDependency> getJdkDependencies() {
        return jdkDependencies;
    }

    @Override
    public Set<ProjectDependency> getProjectDependencies() {
        return projectDependencies;
    }
}
