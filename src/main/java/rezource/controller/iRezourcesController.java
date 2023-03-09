package rezource.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import rezource.entity.Rezource;
import rezource.entity.RezourceType;

@RequestMapping("/rezources")
public interface iRezourcesController {
  @GetMapping
  @ResponseStatus(code = HttpStatus.OK)
  List<Rezource> fetchRezources(
      @RequestParam(required = false) String name, 
      @RequestParam(required = false) RezourceType type,
      @RequestParam(required = false) Long rezourcerId);
}
