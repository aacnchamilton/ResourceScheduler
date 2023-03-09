package rezource.dao;

import java.util.List;
import rezource.entity.Rezource;
import rezource.entity.RezourceType;

public interface iRezourcesDao {
  List<Rezource> fetchRezources(String name, RezourceType type, Long rezourcerId);
}
