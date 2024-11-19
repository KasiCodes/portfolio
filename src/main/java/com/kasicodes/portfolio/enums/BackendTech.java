package com.kasicodes.portfolio.enums;

import lombok.Getter;

@Getter
public enum BackendTech {
  JAVA("JAVA 17+", ExperienceLevel.INTERMEDIATE.name()), PYTHON("Python", ExperienceLevel.INTERMEDIATE.name()), SPRING(
          "Spring",
          ExperienceLevel.INTERMEDIATE.name());

  private final String technology;
  private final String experienceLevel;

  BackendTech(String technology, String experienceLevel) {
    this.technology = technology;
    this.experienceLevel = experienceLevel;
  }

}
