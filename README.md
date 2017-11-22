# Travis-CI Sample Application

A sample app to be integrated, tested and deployed by Travis-CI.

Note: to build this repository with maven you must specify "-Popenshift", eg "mvn clean package -Popenshift"

# Initial Setup
1. Setup GitHub Account and create GIT repository
2. Clone GIT repository to local development workstation and push first version of application to remote
3. Go to
   1. www.travis-ci.org/signup to couple GitHub Account with Travis-CI for Open-Source projects.
   2. www.travis-ci.com/signup to couple GitHub Account with Travis-CI for private projects (Business)
4. After GitHub synchronization is finished, lookup the repository you want and activate it.

# Java Specific Build Setup
1. Add `.travis.yml` to root of repository
2. Provide the install and script sections
```specification
language: java
jdk: oraclejdk8

install:
  - mvn install -DskipTests=true -Dmaven.javadoc.skip=true -B -V

script:
  - mvn test -B

cache:
  directories:
  - $HOME/.m2
```

# Travis CI Build Life Cycle

<table>
    <thead>
        <tr>
            <th>Travis CI Build Phase</th>
            <th>Maven Build Phase</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>Install apt addons (optional)</td>
            <td>(none)</td>
        </tr>
    </tbody>
</table>


1. OPTIONAL Install cache components
3. before_install
4. install
5. before_script
6. script
7. OPTIONAL before_cache (for cleaning up cache)
8. after_success or after_failure
9. OPTIONAL before_deploy
10. OPTIONAL deploy
11. OPTIONAL after_deploy
12. after_script

# Travis CI Client
Handig

1. Install Ruby (v2.0 of hoger aangeraden) with native extension support
   ```jshelllanguage
   sudo apt install ruby
   sudo apt install ruby-dev
   ```
2. Install Travis Gem
   ```jshelllanguage
   gem install travis -v 1.8.8 --no-rdoc --no-ri

   Successfully installed travis-1.8.8
   6 gems installed
   ```
3. Go to project directory and login
   ```
   travis login
   ```
4. Initialize the easy way


# resources

1. https://github.com/travis-ci/travis.rb#installation
2. https://docs.travis-ci.com/user/deployment/cloudfoundry/

## Handy

1. `.git/config` stores the travis slug, change it if you rename GIT repository
2. Initialize the easy way with `travis init --force`

