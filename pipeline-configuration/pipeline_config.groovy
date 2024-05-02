// removed due to error parsing - class not found and _ variable exists in current scope
// @Library('shared-lib') _
jte{
    pipeline_template = 'first-template.groovy'
    permissive_initialization = true
    reverse_library_resolution = true
}
libraries{
    // currently this is not permitted, leads to method overloading on primitive JTE exception with greet step. This may be possible to integrate with a build folder and steps under it and defining library config folder for optional params
    // greetings
    // greetingsV2
    greetings
    greetingsV2
}