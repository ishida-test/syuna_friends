package com.example.schnauzer.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@Controller
public class SchnauzerController {
    @RequestMapping("/", method = arrayOf(RequestMethod.GET))
    // 「home.html」に移動
    fun home(): String {
        return "home"
    }

    @RequestMapping("/event", method = arrayOf(RequestMethod.GET))
    // 「event.html」に移動
    fun event(): String {
        return "event"
    }

    @RequestMapping("/friend", method = arrayOf(RequestMethod.GET))
    // 「friend.html」に移動
    fun friend(): String {
        return "friend"
    }

    @RequestMapping("/consultation", method = arrayOf(RequestMethod.GET))
    // 「consultation.html」に移動
    fun consultation(): String {
        return "consultation"
    }

    @RequestMapping("/question", method = arrayOf(RequestMethod.GET))
    // 「question.html」に移動
    fun question(): String {
        return "question"
    }

    @RequestMapping("/eventPlanning", method = arrayOf(RequestMethod.GET))
    // 「eventPlanning.html」に移動
    fun eventPlanning(): String {
        return "eventPlanning"
    }

    @RequestMapping("/eventPlanning", method = arrayOf(RequestMethod.POST), params = arrayOf("eventPlanning"))
    // イベントを作成したのち、「home.html」に移動
    fun eventToHome(): String {
        return "home"
    }
}