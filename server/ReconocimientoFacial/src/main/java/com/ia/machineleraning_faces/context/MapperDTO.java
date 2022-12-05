package com.ia.machineleraning_faces.context;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperDTO {
  @Bean
  public ModelMapper modelMapper() {
    return new ModelMapper();
  }
}
