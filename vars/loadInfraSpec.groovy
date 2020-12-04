def call(Map config=[:]) {
    def INFRA_SPEC_URL          = 'git@github.com:pasuinthesky/infra-spec.git'
    def INFRA_SPEC_CREDENTIAL   = 'Github'
    def INFRA_SPEC_BRANCH       = 'main'
    def CONFIG_FILE_NAME        = 'config.yml'

    dir (INFRA_SPEC_SUBDIR) {
        git branch: INFRA_SPEC_BRANCH,
            credentialsId: INFRA_SPEC_CREDENTIAL,
            url: INFRA_SPEC_URL

        yamlObj = readYaml file: CONFIG_FILE_NAME
    }
    return yamlObj
}