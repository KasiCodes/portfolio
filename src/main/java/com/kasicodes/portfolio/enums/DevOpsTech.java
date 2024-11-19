package com.kasicodes.portfolio.enums;

import lombok.Getter;

@Getter
public enum DevOpsTech {
  DOCKER("Docker", ExperienceLevel.INTERMEDIATE.name()), KUBERNETES("Kubernetes", ExperienceLevel.BEGINNER
          .name());

  private final String technology;
  private final String experienceLevel;

  DevOpsTech(String technology, String experienceLevel) {
    this.technology = technology;
    this.experienceLevel = experienceLevel;
  }

}