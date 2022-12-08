 
listView('mikolaj2 Jobs') {
    description('mikolaj2 Jobs')
    jobs {
        regex('mikolaj2_.+')
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
