package pl.com.pko.avscan.server.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import pl.com.pko.avscan.server.api.controller.android.ThreadPoolTaskExecutorTemp;

import java.util.concurrent.Executor;

@Configuration
public class AsyncConfig {

    @Value("${threadPoolTaskExecutor.corePoolSize}")
    private int corePoolsSize;

    @Value("${threadPoolTaskExecutor.maxPoolSize}")
    private int maxPoolSize;

    @Value("${threadPoolTaskExecutor.queueCapacity}")
    private int queueCapacity;

    @Value("${threadPoolTaskExecutor.threadNamePrefix}")
    private String threadNamePrefix;

    @Bean
    public Executor asyncExecutor() {
        ThreadPoolTaskExecutorTemp executor = new ThreadPoolTaskExecutorTemp();
        executor.setCorePoolSize(corePoolsSize);
        executor.setMaxPoolSize(maxPoolSize);
        executor.setQueueCapacity(queueCapacity);
        executor.setThreadNamePrefix(threadNamePrefix);
        executor.initialize();
        return executor;
    }
}
