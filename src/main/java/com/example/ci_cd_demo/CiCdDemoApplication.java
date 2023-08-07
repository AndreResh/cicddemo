package com.example.ci_cd_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

@SpringBootApplication
public class CiCdDemoApplication {

//	public static void main(String[] args) {
//		SpringApplication.run(CiCdDemoApplication.class, args);
//	}

}

class Main {
    public static void main(String[] args) {
        System.out.println(Main.getFallStep(10000, 1000, 1));
    }

    public static int getFallStep(int n, int left, int right) {
        if (left == right || left < 0 || right < 0 || left > n || right > n || n < 1 || n > Math.pow(10,4)){
            return -1;
        }
            int leftNumber = -1;
        int rightNumber = 1;
        int count = 0;
        while (true) {
            if (left + leftNumber == right) {
                leftNumber *= -1;
                rightNumber *= -1;
            }
            left += leftNumber;
            if (right + rightNumber == left) {
                leftNumber *= -1;
                rightNumber *= -1;
            }
            right += rightNumber;
            count++;
            if (left < 0 || right < 0 || left > n || right > n) {
                break;
            }
        }
        return count;
    }
}
