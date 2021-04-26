package blog.peaksong.demo0

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ComponentBean {

    @Bean
    fun car(): Car {
        return Car()
    }
}