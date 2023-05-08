package pro.sky.hw_2_11.service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import pro.sky.hw_2_11.component.Basket;
import pro.sky.hw_2_11.model.Item;
import pro.sky.hw_2_11.repository.StoreRepository;

@Service
public class StoreService {

  private final Basket basket;
  private final StoreRepository storeRepository;

  public StoreService(Basket basket, StoreRepository storeRepository) {
    this.basket = basket;
    this.storeRepository = storeRepository;
  }

  public void add(Set<Integer> ids){
    basket.add(ids);
  }

  public List<Item> get(){
    return basket.get().stream()
        .map(id -> storeRepository.get(id))
        .collect(Collectors.toList());
  }

}
