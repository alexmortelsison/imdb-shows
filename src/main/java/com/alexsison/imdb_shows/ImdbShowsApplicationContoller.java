package com.alexsison.imdb_shows;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ImdbShowsApplicationContoller {


  @GetMapping("/")
  public String getShows() {
      return "shows";
  }
}
