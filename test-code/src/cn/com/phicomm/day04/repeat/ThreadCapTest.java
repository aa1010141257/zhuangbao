package cn.com.phicomm.day04.repeat;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadCapTest {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(4);

        executorService.submit(new ThreadCap());
        executorService.submit(new ThreadCap());
        executorService.submit(new ThreadCap());

    }
}
