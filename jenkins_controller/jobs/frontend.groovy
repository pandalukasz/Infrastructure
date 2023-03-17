pipelineJob('frontend') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        credentials("")
                        url("https://github.com/pandalukasz/frontend.git")
                    }
                    branches('tests')
                    scriptPath('Jenkinsfile')
                }
            }
        }
    }
}