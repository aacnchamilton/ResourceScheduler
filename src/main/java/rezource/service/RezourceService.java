package rezource.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.extern.slf4j.Slf4j;
import rezource.dao.RezourcesDao;
import rezource.entity.Rezource;
import rezource.entity.RezourceType;

@Slf4j
public class RezourceService implements iRezourceService {
  
  @Autowired
  RezourcesDao rezourceDao;

  @Override
  public List<Rezource> fetchRezources(String name, RezourceType type, Long rezourcerId) {
    log.info("RezourceService.fetchRezources: name: {}, type: {}, rezourcerId: {}", name, type, rezourcerId);
    return rezourceDao.fetchRezources(name, type, rezourcerId);
  }

}
