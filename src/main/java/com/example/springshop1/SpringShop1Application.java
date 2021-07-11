package com.example.springshop1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SpringShop1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringShop1Application.class, args);
    }

    //Добавить review на товар для клиента с модерацией менеджера
    //Добавить модерацию - менеджер меняет статус отзыва и отзыв начинает показыватся клиентам
}
