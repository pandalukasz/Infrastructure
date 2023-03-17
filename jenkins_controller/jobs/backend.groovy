pipelineJob('backend') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        credentials("")
                        url("https://github.com/pandalukasz/backend.git")
                    }
                    branches('tests')
                    scriptPath('Jenkinsfile')
                }
            }
        }
    }
}