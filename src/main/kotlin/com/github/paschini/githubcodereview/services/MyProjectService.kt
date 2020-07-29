package com.github.paschini.githubcodereview.services

import com.intellij.openapi.project.Project
import com.github.paschini.githubcodereview.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
