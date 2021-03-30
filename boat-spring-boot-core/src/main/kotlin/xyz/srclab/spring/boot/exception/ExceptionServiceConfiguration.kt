package xyz.srclab.spring.boot.exception

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

//@Configuration
open class ExceptionServiceConfiguration {

    @ConditionalOnMissingBean
    @Bean("xyz.srclab.spring.boot.exception.ExceptionStatusService")
    open fun exceptionStatusService(): ExceptionStatusService {
        return ExceptionStatusService()
    }
}