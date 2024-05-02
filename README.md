# jenkins-sandbox

The jenkins server container is provisioned on a linux mint xfce 21.2 distro, which uses debian or ubuntu as the parent distro.

The jenkins server container is built, started, stopped, and removed using docker compose.

The Jenkinsfile will be used for declarative script that will utilize shared library vars, later on it will have jte template and pipeline configuration file.

The jenkins server default node agent on the VM with 2 executors is being used with docker agent (using docker and docker pipeline plugin).

Pending:
- Adding more straightforward configuration for jte template library, pipeline config, jte lib source, and global vars to make  it work first
- Adding ability to have same steps for multiple libraries. This requires library config and some other setup that is difficult to find documentation on.
- Add a multi-job seed provisioning based on job dsl