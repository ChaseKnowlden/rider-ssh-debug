package com.github.chaseknowlden.ridersshdebug.services

import com.intellij.openapi.project.Project
import com.github.chaseknowlden.ridersshdebug.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
