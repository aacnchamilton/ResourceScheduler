package rezource.service;

import java.util.List;
import rezource.entity.Rezource;
import rezource.entity.RezourceType;

public interface iRezourceService {
  List<Rezource> fetchRezources(String name, RezourceType type, Long rezourcerId);
}
