// removed due to error parsing - class not found and _ variable exists in current scope
// @Library('shared-lib') _
jte{
    pipeline_template = 'first-template.groovy'
    permissive_initialization = true
    reverse_library_resolution = true
}
libraries{
    greetings
    greetingsV2
}