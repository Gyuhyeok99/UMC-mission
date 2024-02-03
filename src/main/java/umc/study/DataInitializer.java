package umc.study;


import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import umc.study.domain.FoodCategory;
import umc.study.repository.FoodCategoryRepository;

import java.util.List;

@Component
public class DataInitializer {

    private final FoodCategoryRepository foodCategoryRepository;

    @Autowired
    public DataInitializer(FoodCategoryRepository foodCategoryRepository) {
        this.foodCategoryRepository = foodCategoryRepository;
    }

    @PostConstruct
    public void initData() {
        FoodCategory category1 = FoodCategory.builder().name("한식").build();
        FoodCategory category2 = FoodCategory.builder().name("일식").build();
        FoodCategory category3 = FoodCategory.builder().name("중식").build();
        FoodCategory category4 = FoodCategory.builder().name("양식").build();
        FoodCategory category5 = FoodCategory.builder().name("치킨").build();
        FoodCategory category6 = FoodCategory.builder().name("분식").build();
        FoodCategory category7 = FoodCategory.builder().name("고기/구이").build();
        FoodCategory category8 = FoodCategory.builder().name("도시락").build();
        FoodCategory category9 = FoodCategory.builder().name("야식").build();
        FoodCategory category10 = FoodCategory.builder().name("패스트푸드").build();
        FoodCategory category11 = FoodCategory.builder().name("디저트").build();
        FoodCategory category12 = FoodCategory.builder().name("아시안푸드").build();

        foodCategoryRepository.saveAll(List.of(category1, category2, category3, category4, category5, category6, category7, category8, category9, category10, category11, category12));
    }
}