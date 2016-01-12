package com.joasgarcia.testabexample

import javax.servlet.http.Cookie

class HomeController {

    def testAbService

    def index() {
        Integer testAbValue = setTestAbCookie()

        [testAbValue: testAbValue]
    }

    private String setTestAbCookie() {
        def cookieExisting = g.cookie(name: "testab")
        String cookieValue

        if (!cookieExisting) {
            cookieValue = String.valueOf(testAbService.raffle())
        } else {
            cookieValue = cookieExisting
        }

        Cookie cookie = new Cookie("testab", cookieValue)
        cookie.maxAge = 60 * 60 * 24 * 365
        cookie.path = "/"

        response.addCookie(cookie)

        return cookie.value
    }
}
