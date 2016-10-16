package to.tyo.sample.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project
import to.tyo.sample.jar.Test

class SampleGradlePlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        project.task("samplegradlePlugin") << {
            Test.hello()
        }
    }
}