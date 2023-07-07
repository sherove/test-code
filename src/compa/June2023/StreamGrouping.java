package compa.June2023;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGrouping {
    public static void main(String[] args) {

        ArrayList<Food> list = new ArrayList<>();
        list.add(Food.builder().name("피자").cal(200).build());
        list.add(Food.builder().name("떡볶이").cal(400).build());
        list.add(Food.builder().name("치킨").cal(290).build());
        list.add(Food.builder().name("토마토").cal(80).buy(1).build());
        list.add(Food.builder().name("수박").cal(80).buy(1).build());


        Map<String, List<Food>> collect = list.stream().collect(
                Collectors.groupingBy(f -> {
                    if (f.getCal() > 300) return "고칼로리";
                    return "적당";
                })
        );

        list.stream()
                .collect(Collectors.groupingBy(data -> data.getName()+ "_" + data.getCal())).forEach((s, foods) -> {
                    System.out.println(s + ", " + foods  );
                });
        collect.forEach((s, foods) -> {
            System.out.println(s + " : " + foods.size());
        });
        collect.forEach((s, foods) -> {
            for (Food food : foods) {
                System.out.println(s + " 푸드는 >> " + food.getName());
            }
        });
    }
}
