package com.github.2catycm.onejava.services

import com.intellij.openapi.project.Project
import com.github.2catycm.onejava.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
