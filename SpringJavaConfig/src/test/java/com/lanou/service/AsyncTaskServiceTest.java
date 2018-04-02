package com.lanou.service;

import com.lanou.config.TaskExecutorConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class AsyncTaskServiceTest {
    @Test
    public void name() throws Exception {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext();
        context.register(TaskExecutorConfig.class);
        context.refresh();
        AsyncTaskService taskService = context.getBean(AsyncTaskService.class);
        for (int i = 0; i < 10; i++) {
            taskService.executeAsyncTask(i);
            taskService.executeAsyncTaskPlus(i);
        }

        context.close();
    }

}