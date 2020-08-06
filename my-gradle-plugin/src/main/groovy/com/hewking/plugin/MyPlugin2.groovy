package com.hewking.plugin
import org.gradle.api.Plugin
import org.gradle.api.Project

class MyPlugin2 implements Plugin<Project>{

    @Override
    void apply(Project project) {
        println('apply my plugin')
        project.tasks.create("mytask",MyTask.class)
    }
}