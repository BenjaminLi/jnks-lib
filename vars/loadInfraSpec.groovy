import org.devopslab.Constants

def call(Map config=[:]) {

    return loadGitYaml(
                        branch: Constants.INFRA_SPEC_BRANCH,
                        url: Constants.INFRA_SPEC_URL,
                        credentialsId: Constants.INFRA_SPEC_CREDENTIAL,
                        file: Constants.INFRA_SPEC_CONFIG,
                        subdir: Constants.INFRA_SPEC_SUBDIR
                    )
}