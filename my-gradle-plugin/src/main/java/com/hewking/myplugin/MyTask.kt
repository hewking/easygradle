package com.hewking.myplugin

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

/**
 *@Description: (用一句话描述该文件做什么)
 *@Author: jianhao
 *@Date:   6/6/21 3:55 PM
 *@License: Copyright Since 2020 Hive Box Technology. All rights reserved.
 *@Notice: This content is limited to the internal circulation of Hive Box,
 and it is prohibited to leak or used for other commercial purposes.
 */
class MyTask: DefaultTask() {

    @TaskAction
    fun action() {
        println("my task run")
    }

}