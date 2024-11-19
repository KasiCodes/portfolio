package com.kasicodes.portfolio.img.social;


import com.kasicodes.portfolio.img.ImgTagAttributes;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder(toBuilder = true)
public class SocialMediaImgTag extends ImgTagAttributes {
  private String onClickAction;
}
