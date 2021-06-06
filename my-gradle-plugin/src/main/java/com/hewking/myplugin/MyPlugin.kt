package com.hewking.myplugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class MyPlugin: Plugin<Project> {

    override fun apply(target: Project) {
        println("apply my plugin")
        target.tasks.create("pluginTask", MyTask::class.java)
    }

}
