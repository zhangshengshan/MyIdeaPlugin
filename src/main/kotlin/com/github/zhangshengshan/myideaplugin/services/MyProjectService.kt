package com.github.zhangshengshan.myideaplugin.services

import com.intellij.openapi.project.Project
import com.github.zhangshengshan.myideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
