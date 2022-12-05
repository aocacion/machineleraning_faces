package com.ia.machineleraning_faces.domain.dto.personas;

import com.ia.machineleraning_faces.persistence.entity.mysql.Persona;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class PersonaConverterDTOEnt {
  private ModelMapper modelMapper;

  public PersonaConverterDTOEnt(ModelMapper modelMapper) {
    this.modelMapper = modelMapper;
  }

  public PersonaDTO convertEntityToDto(Persona persona) {
    return modelMapper.map(persona, PersonaDTO.class);
  }

  public Persona convertDtoToEntity(PersonaDTO personaDTO) {
    return modelMapper.map(personaDTO, Persona.class);
  }
}
