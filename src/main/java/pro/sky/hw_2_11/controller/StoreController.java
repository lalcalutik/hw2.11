package pro.sky.hw_2_11.controller;

import java.util.List;
import java.util.Set;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.hw_2_11.model.Item;
import pro.sky.hw_2_11.service.StoreService;

@RestController
@RequestMapping("/order")
public class StoreController {

  private final StoreService storeService;

  public StoreController(StoreService storeService) {
    this.storeService = storeService;
  }

  @GetMapping("/add")
  public void add(@RequestParam("id") Set<Integer> ids) {
    storeService.add(ids);
  }

  @GetMapping("/get")
  public List<Item> get() {
    return storeService.get();
  }

}
