package org.example.linked_list;

/*
У нас есть односвязный список head, и мы хотим удалить из него узел node.

Вам предоставлен удаляемый узел node. Вам не будет предоставлен доступ к первому узлу head.

Все значения связанного списка уникальны, и гарантируется, что заданный узел node не является
последним узлом в связанном списке.

Удалите данный узел. Обратите внимание, что под удалением узла мы подразумеваем
не удаление его из памяти. Мы имеем в виду:

Значение данного узла не должно существовать в связанном списке.
Количество узлов в связанном списке должно уменьшиться на единицу.
Все значения перед node должны быть в одном порядке.
Все значения после node должны быть в том же порядке.
Индивидуальное тестирование:

В качестве входных данных вы должны предоставить весь связанный список head и заданный узел node.
node не должен быть последним узлом списка и должен быть реальным узлом в списке.
Мы создадим связанный список и передадим узел вашей функции.
Результатом будет полный список после вызова вашей функции.

Входные данные: head = [4,5,1,9], node = 5
Выходные данные: [4,1,9]
Пояснение: Вам дан второй узел со значением 5,
после вызова вашей функции связанный список должен стать 4 -> 1 -> 9.

Входные данные: head = [4,5,1,9], узел = 1
Выходные данные: [4,5,9]
Пояснение: вам дан третий узел со значением 1,
после вызова вашей функции связанный список должен стать 4 -> 5 -> 9.
 */

import java.util.List;

public class DeleteNodeInALinkedList {

    public static void main(String[] args) {


        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);

        ListNode node = head.next;
        System.out.println("Node to delete: " + node.val);
        System.out.println(
                head.val + " -> "
                + head.next.val + " -> "
                + head.next.next.val + " -> "
                + head.next.next.next.val
        );
        deleteNode(node);
        System.out.println(head.val + " -> " + head.next.val + " -> " + head.next.next.val);



    }

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}