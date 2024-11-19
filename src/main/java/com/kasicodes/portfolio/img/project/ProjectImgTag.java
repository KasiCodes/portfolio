package com.kasicodes.portfolio.img.project;

import com.kasicodes.portfolio.img.ImgTagAttributes;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder(toBuilder = true)
public class ProjectImgTag extends ImgTagAttributes {
  private String projectName;
  private String onGithubClickAction;
  private String onLiveDemoClickAction;
}