package blog.peaksong.demo0

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ComponentBean {

    @Value("\${car.num}")
    lateinit var num: String

    @Bean
    fun car(): Car {
        return Car(num)
    }
}