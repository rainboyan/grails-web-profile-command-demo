description( "Hello world" ) {
    usage "grails hello [NAME]"
    argument name:'Name', description:"The name of the man", required: false
}

console.updateStatus "Hello ${commandLine.remainingArgs[0] ?: 'World'}"
