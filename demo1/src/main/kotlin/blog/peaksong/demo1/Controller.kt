package blog.peaksong.demo1

import blog.peaksong.demo0.Car
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller {

    @Autowired
    private lateinit var car : Car

    @GetMapping(value = ["/"])
    fun test(): String{
        return car.toString()
    }
}