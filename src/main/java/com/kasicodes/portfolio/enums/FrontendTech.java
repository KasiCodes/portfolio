package com.kasicodes.portfolio.enums;

import lombok.Getter;

@Getter
public enum FrontendTech {
  HTML("HTML", ExperienceLevel.INTERMEDIATE.name()), CSS("CSS", ExperienceLevel.INTERMEDIATE.name()), JS("JavaScript", ExperienceLevel.INTERMEDIATE.name()), TYPESCRIPT(
          "TypeScript", ExperienceLevel.BEGINNER.name());

  private final String technology;
  private final String experienceLevel;

  FrontendTech(String technology, String experienceLevel) {
    this.technology = technology;
    this.experienceLevel = experienceLevel;
  }

}

