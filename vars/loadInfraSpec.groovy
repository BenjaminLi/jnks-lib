def call(Map config=[:]) {
    def INFRA_SPEC_URL          = 'git@github.com:pasuinthesky/infra-spec.git'
    def INFRA_SPEC_CREDENTIAL   = 'Github'
    def INFRA_SPEC_BRANCH       = 'main'
    def CONFIG_FILE_NAME        = 'config.yml'

    return loadGitYaml(
                        branch: INFRA_SPEC_BRANCH,
                        url: INFRA_SPEC_URL,
                        credentialsId: INFRA_SPEC_CREDENTIAL,
                        file: CONFIG_FILE_NAME,
                        subdir: INFRA_SPEC_SUBDIR
                    )
}