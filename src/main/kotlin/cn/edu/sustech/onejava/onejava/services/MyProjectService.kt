package cn.edu.sustech.onejava.onejava.services


import com.intellij.openapi.project.Project
import cn.edu.sustech.onejava.onejava.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
