package com.chong.mcspcreadwritesplit;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(exclude={DruidDataSourceAutoConfigure.class})
@EnableDiscoveryClient
@EnableConfigurationProperties
@EnableTransactionManagement
@ComponentScan(basePackages = {"com.chong.common","com.chong.mcspcreadwritesplit"})
public class McspcreadwritesplitApplication {

	public static void main(String[] args) {
		SpringApplication.run(McspcreadwritesplitApplication.class, args);
	}

}
