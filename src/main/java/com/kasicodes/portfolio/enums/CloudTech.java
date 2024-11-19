package com.kasicodes.portfolio.enums;
import lombok.Getter;

@Getter
public enum CloudTech {
  AWS("AWS", ExperienceLevel.BEGINNER.name()), GCP("GCP", ExperienceLevel.INTERMEDIATE.name());

  private final String technology;
  private final String experienceLevel;

  CloudTech(String technology, String experienceLevel) {
    this.technology = technology;
    this.experienceLevel = experienceLevel;
  }

}