package org.example.core.eventos.eventosAsincronos;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ConcurrentTaskExecutor;

import java.util.concurrent.Executors;

@Configuration
@EnableAsync
@ComponentScan
public class AppConfig {

    @Bean
    public TaskExecutor taskExecutor() {
        return new ConcurrentTaskExecutor(
                Executors.newFixedThreadPool(3));
    }

}
