package behavior_iterator_pattern.code.rollcall;

import behavior_iterator_pattern.code.rollcall.collection.*;
import behavior_iterator_pattern.code.rollcall.iterator.Iterator;

public class RollCallClient {

    public static void main(String[] args) {

//        iterateStudent();
//
//        iterateSoldier();

        iterateDeadInfo();

    }

    private static void iterateDeadInfo() {

        DeadLinkedList deadLinkedList = new DeadLinkedList(
                new DeadInfo("安倍晋三", "2022-07-08"),
                new DeadInfo("小泉纯一郎", "2019-01-01")
        );

        deadLinkedList.add(new DeadInfo("森喜朗", "2001-04-26"));

        Iterator<DeadInfo> iterator = deadLinkedList.createIterator();
        while (iterator.hasNext()) {
            DeadInfo next = iterator.getNext();
            System.out.println(next);
        }

    }

    private static void iterateSoldier() {
        Soldier[] soldiers = new Soldier[]{
                new Soldier("徐艺", "东北战区野战大队"),
                new Soldier("许毅", "西南战区特战大队"),
                new Soldier("徐毅", "东部战区海军大队"),
                new Soldier("徐一", "西北战区特战大队"),
                new Soldier("许易", "东南战区特战大队"),
        };
        SoldierCollection soldierCollection = new SoldierCollection(soldiers);

        Iterator<Soldier> iterator1 = soldierCollection.createIterator();
        while (iterator1.hasNext()) {
            Soldier next = iterator1.getNext();
            System.out.println(next);
        }

        System.out.println("**********");
        soldierCollection.add(new Soldier("徐易", "西部战区特战大队"));
        iterator1 = soldierCollection.createIterator();
        while (iterator1.hasNext()) {
            Soldier next = iterator1.getNext();
            System.out.println(next);
        }

        System.out.println("**********");
        soldierCollection.addAll(new Soldier("徐逸", "西部战区炮兵部队"), new Soldier("许逸", "东部战区炮兵部队"));
        iterator1 = soldierCollection.createIterator();
        while (iterator1.hasNext()) {
            Soldier next = iterator1.getNext();
            System.out.println(next);
        }

        // 需要重新获取迭代器
        System.out.println("**********");
        soldierCollection.add(new Soldier("许一", "南部战区特战大队"));
        while (iterator1.hasNext()) {
            Soldier next = iterator1.getNext();
            System.out.println(next);
        }
    }

    private static void iterateStudent() {
        StudentCollection studentCollection = new StudentCollection();
        studentCollection.add(new Student("徐艺", 14));
        studentCollection.add(new Student("许毅", 12));
        studentCollection.add(new Student("徐毅", 11));
        studentCollection.add(new Student("徐一", 13));
        studentCollection.add(new Student("许易", 12));

        Iterator<Student> iterator = studentCollection.createIterator();

        while (iterator.hasNext()) {
            Student next = iterator.getNext();
            System.out.println(next);
        }

        System.out.println("----------------------------------");
    }
}
