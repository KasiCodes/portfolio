package com.kasicodes.portfolio.img.client;

import com.kasicodes.portfolio.img.ImgTagAttributes;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder(toBuilder = true)
public class ClientImgTag extends ImgTagAttributes {
  private boolean draggable;
  private String clientName;
  private String designation;
}
