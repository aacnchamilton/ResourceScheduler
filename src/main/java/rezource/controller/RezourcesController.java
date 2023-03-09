package rezource.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;
import rezource.entity.Rezource;
import rezource.entity.RezourceType;
import rezource.service.RezourceService;

@RestController
@Slf4j
public class RezourcesController implements iRezourcesController {

  @Autowired
  RezourceService rezourceService;
  
  @Override
  public List<Rezource> fetchRezources(String name, RezourceType type, Long rezourcerId) {
    log.info("RezourceController.fetchRezourzes: Rezource Name: {}, Rezource Type: {}, Rezourcer Id: {}", name, type, rezourcerId );
    return rezourceService.fetchRezources(name, type, rezourcerId);
  }

}
