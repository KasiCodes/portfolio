package com.kasicodes.portfolio.enums;


import lombok.Getter;

@Getter
public enum Titles {
  SOFTWARE_DEVELOPMENT_ENGINEER("Software Development Engineer");
  private final String value;

  Titles(String value) {
    this.value = value;
  }

}