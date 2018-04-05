package com.greenfoxacademy.springstart;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class UtilityService {
  ArrayList<String> colors;
  Random random;

  public UtilityService() {
    colors = new ArrayList<>();
    colors.add("red");
    colors.add("blue");
    colors.add("lime");
    colors.add("orange");
    colors.add("magenta");
    random = new Random();
  }

  public String randomColor() {
    return colors.get(random.nextInt(colors.size()));
  }

  public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
          Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

  public boolean validateEmail(String email) {
    Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(email);
    return matcher.find();
  }
}
