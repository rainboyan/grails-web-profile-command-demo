# Grails Plugin Demo

Grails profile demo, use `org.grails.internal.grails-plugin-publish` to publish it.

## Grails Version

- Grails **4.0.13**
- Grails **5.1.2**

## Usage

Create a profile project `web-profile-command-demo`

```
sdk use grails 4.0.13
grails create-profile web-profile-command-demo
```

When build this profile, there is a bug here, grails profile publish plugin should be `org.grails.internal.grails-profile-publish`, not `org.grails.grails-profile-publish`

```
apply plugin:"org.grails.internal.grails-plugin-publish"
```

Create a command in `commands` directory,

```
description( "Hello world" ) {
    usage "grails hello [NAME]"
    argument name:'Name', description:"The name of the man", required: false
}

console.updateStatus "Hello ${commandLine.remainingArgs[0] ?: 'World'}"
```

Then publish it to local maven repository

```
./gradlew install
```

Build susscessful!

### Build and Install

```
git clone https://github.com/rainboyan/grails-profile-command-demo.git
cd grails-profile-command-demo
./gradlew install
```

## Links

- [Grails](https://grails.org)
- [Grails Github](https://github.com/grails)
- [Grails Gradle Plugin](https://github.com/grails/grails-gradle-plugin/)
- [Grails Profile Doc](https://docs.grails.org/latest/guide/profiles.html)
