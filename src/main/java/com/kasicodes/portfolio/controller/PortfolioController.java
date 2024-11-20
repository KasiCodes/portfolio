package com.kasicodes.portfolio.controller;

import com.kasicodes.portfolio.enums.*;
import com.kasicodes.portfolio.experience.TechExperience;
import com.kasicodes.portfolio.img.arrow.ArrowImgTag;
import com.kasicodes.portfolio.img.social.SocialMediaImgTag;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.kasicodes.portfolio.Utils.Constants.*;

@Controller
public class PortfolioController {

  @GetMapping("/")
  public String portfolio(Model model) {
    model.addAttribute("myName", MY_NAME);
    model.addAttribute("myExpInYear", MY_EXPERIENCE_IN_YEARS);
    model.addAttribute("myEmail", MY_EMAIL_ID);
    model.addAttribute("titles", getTitles());
    model.addAttribute("social", getSocialMediaImgTagAttributes());
    model.addAttribute("profilepic", PROFILE_PIC_ASSET_URL);
    model.addAttribute("aboutpic", ABOUT_PIC_ASSET_URL);
    model.addAttribute("experience", EXPERIENCE_ASSET_URL);
    model.addAttribute("education", EDUCATION_ASSET_URL);
    model.addAttribute("arrow", getArrowImgTagAttributes());
    model.addAttribute("frontend", getFrontendDevelopmentExperience());
    model.addAttribute("backend", getBackendDevelopmentExperience());
    model.addAttribute("cloud", getCloudExperience());
    model.addAttribute("database", getDatabaseExperience());
    model.addAttribute("devops", getDevOpsExperience());
    model.addAttribute("linkedin", LINKEDIN_URL);
    model.addAttribute("mailtoemail", MAIL_TO_EMAIL);
    model.addAttribute("email", EMAIL_ASSET_URL);
    model.addAttribute("linkedinpic", LINKEDIN_ASSET_URL);

    return "index";
  }

  @GetMapping(path = "/download")
  public ResponseEntity<Resource> downloadResume() throws IOException {
    File file = new File(RESUME_FILE_PATH);
    Path path = Paths.get(file.getAbsolutePath());
    ByteArrayResource resource = new ByteArrayResource(Files.readAllBytes(path));

    return ResponseEntity.ok()
        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + RESUME_FILENAME + "\"")
        .contentLength(file.length()).contentType(MediaType.parseMediaType(RESUME_MEDIA_TYPE)).body(resource);
  }

  private static List<String> getTitles() {
    List<String> listOfTitles = new ArrayList<>();

    Arrays.stream(Titles.values()).forEach(title -> {
      listOfTitles.add(title.getValue());
    });

    return listOfTitles;
  }

  private static List<SocialMediaImgTag> getSocialMediaImgTagAttributes() {
    List<SocialMediaImgTag> imgTagList = new ArrayList<>();

    imgTagList.add(SocialMediaImgTag.builder().assetUrl(LINKEDIN_ASSET_URL).altName("My LinkedIn profile")
        .onClickAction(LINKEDIN_URL).build());
    imgTagList.add(SocialMediaImgTag.builder().assetUrl(GITHUB_ASSET_URL).altName("My Github profile")
        .onClickAction(GITHUB_URL).build());

    return imgTagList;
  }

  

  private static ArrowImgTag getArrowImgTagAttributes() {
    return ArrowImgTag.builder().assetUrl(ARROW_ASSET_URL).altName("Arrow icon").build();
  }


  private static List<TechExperience> getFrontendDevelopmentExperience() {
    List<TechExperience> imgTagList = new ArrayList<>();

    Arrays.stream(FrontendTech.values()).forEach(tech -> {
      imgTagList.add(TechExperience.builder().technology(tech.getTechnology()).expLevel(tech.getExperienceLevel())
          .build());
    });

    return imgTagList;
  }

  private static List<TechExperience> getBackendDevelopmentExperience() {
    List<TechExperience> imgTagList = new ArrayList<>();

    Arrays.stream(BackendTech.values()).forEach(tech -> {
      imgTagList.add(TechExperience.builder().technology(tech.getTechnology()).expLevel(tech.getExperienceLevel())
          .build());
    });

    return imgTagList;
  }

  private static List<TechExperience> getCloudExperience() {
    List<TechExperience> imgTagList = new ArrayList<>();

    Arrays.stream(CloudTech.values()).forEach(tech -> {
      imgTagList.add(TechExperience.builder().technology(tech.getTechnology()).expLevel(tech.getExperienceLevel())
          .build());
    });

    return imgTagList;
  }

  private static List<TechExperience> getDatabaseExperience() {
    List<TechExperience> imgTagList = new ArrayList<>();

    Arrays.stream(DatabaseTech.values()).forEach(tech -> {
      imgTagList.add(TechExperience.builder().technology(tech.getTechnology()).expLevel(tech.getExperienceLevel())
          .build());
    });

    return imgTagList;
  }

  private static List<TechExperience> getDevOpsExperience() {
    List<TechExperience> imgTagList = new ArrayList<>();

    Arrays.stream(DevOpsTech.values()).forEach(tech -> {
      imgTagList.add(TechExperience.builder().technology(tech.getTechnology()).expLevel(tech.getExperienceLevel())
          .build());
    });

    return imgTagList;
  }

}
