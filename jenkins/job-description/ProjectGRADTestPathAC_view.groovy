 
listView('ProjectGRADTestPathAC Jobs') {
    description('ProjectGRADTestPathAC Jobs')
    jobs {
        regex('ProjectGRADTestPathAC_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
