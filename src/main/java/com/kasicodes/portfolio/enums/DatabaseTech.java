package com.kasicodes.portfolio.enums;

import lombok.Getter;

@Getter
public enum DatabaseTech {
  POSTGRESQL("PostgreSQL", ExperienceLevel.INTERMEDIATE.name()), MYSQL("MySQL", ExperienceLevel.INTERMEDIATE.name());

  private final String technology;
  private final String experienceLevel;

  DatabaseTech(String technology, String experienceLevel) {
    this.technology = technology;
    this.experienceLevel = experienceLevel;
  }

}

