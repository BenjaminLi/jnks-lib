def call(Map config=[:]) {
    //println(config)
    withCredentials([azureServicePrincipal(config.sp)]) {
        sh "az login --service-principal --username ${AZURE_CLIENT_ID} --password ${AZURE_CLIENT_SECRET} --tenant ${AZURE_TENANT_ID}"
        stdOut = sh (
            script: config.script,
            returnStdout: true
        )
    }
    return stdOut
}