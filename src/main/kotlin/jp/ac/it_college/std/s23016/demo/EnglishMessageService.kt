package jp.ac.it_college.std.s23016.demo

import org.springframework.stereotype.Component

@Component("EnglishMessageService")
class EnglishMessageService: MessageService{
    override fun welcome() = "Welcome"
}