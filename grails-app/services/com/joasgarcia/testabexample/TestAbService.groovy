package com.joasgarcia.testabexample

import grails.transaction.Transactional

@Transactional
class TestAbService {

    int counter = 0

    public String raffle() {
        counter++

        if (counter % 2 == 0) {
            return "A"
        } else {
            return "B"
        }
    }
}
