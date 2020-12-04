def call(Map config=[:]) {
    //println(config)
    dir (config.subdir) {
        git branch: config.branch,
            credentialsId: config.credentialsId,
            url: config.url

        yamlObj = readYaml file: config.file
    }
    return yamlObj
}