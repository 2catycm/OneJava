package cn.edu.sustech.onejava.bean.inter;

import cn.edu.sustech.onejava.bean.JdkDependency;
import cn.edu.sustech.onejava.bean.ProjectDependency;

import java.util.Set;

public interface Dependencies {
    /**
     * @return Jdk Dependencies of a file.
     */
    Set<JdkDependency> getJdkDependencies();
    Set<ProjectDependency> getProjectDependencies();
}
