package org.example.stepik.Алгоритмы_теория_и_практика.Методы.ЖадныеАлгоритмы;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Восстановите строку по её коду и беспрефиксному коду символов.
 *
 * В первой строке входного файла заданы два целых числа kk и ll через пробел — количество
 * различных букв, встречающихся в строке,
 * и размер получившейся закодированной строки, соответственно. В следующих kk строках записаны
 * коды букв в формате "letter: code".
 * Ни один код не является префиксом другого. Буквы могут быть перечислены в любом порядке.
 * В качестве букв могут встречаться лишь строчные буквы латинского алфавита;
 * каждая из этих букв встречается в строке хотя бы один раз.
 * Наконец, в последней строке записана закодированная строка. Исходная строка и коды всех букв
 * не пусты. Заданный код таков, что закодированная строка имеет минимальный возможный размер.
 *
 * В первой строке выходного файла выведите строку ss.
 * Она должна состоять из строчных букв латинского алфавита.
 * Гарантируется, что длина правильного ответа не превосходит 10^4 символов.

 */
public class ДекодированиеХаффмана {
    private static final char emptyNodeChar = 216;
    private static final char leftTurnCharacter = '0';

    private static Tree createDecodingTree(HashMap<Character, String> codeTable) {
        Tree huffmanDecodingTree = new Tree(new Node(emptyNodeChar, emptyNodeChar));
        Node rootNode = huffmanDecodingTree.getRoot();
        codeTable.forEach((key, value) -> {
            Node currentNode = rootNode;
            for (char ch : value.toCharArray()) {
                if (ch == leftTurnCharacter) {
                    if (currentNode.leftChild == null) {
                        currentNode.leftChild = new Node(emptyNodeChar, emptyNodeChar);
                    }
                    currentNode = currentNode.leftChild;
                } else {
                    if (currentNode.rightChild == null) {
                        currentNode.rightChild = new Node(emptyNodeChar, emptyNodeChar);
                    }
                    currentNode = currentNode.rightChild;
                }
            }

            currentNode.key = key;
        });

        return huffmanDecodingTree;
    }

    private static String decode(String encodedMessage, HashMap<Character, String> codeTable) {
        Tree huffmanDecodingTree = createDecodingTree(codeTable);
        StringBuilder decodedMessage = new StringBuilder();

        Node current = huffmanDecodingTree.getRoot();
        for (char ch : encodedMessage.toCharArray()) {

            if (ch == leftTurnCharacter) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }

            if (current.key != emptyNodeChar) {
                decodedMessage.append((char) current.key);
                current = huffmanDecodingTree.getRoot();
            }
        }

        return decodedMessage.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<Character, String> codeTable = new LinkedHashMap<>();

        int count = scanner.nextInt();
//        int size = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < count; i++) {
            String charAndFrequency = scanner.nextLine();
            codeTable.put(
                    (charAndFrequency.substring(0, charAndFrequency.indexOf(':')).trim().charAt(0)),
                    charAndFrequency.substring(charAndFrequency.indexOf(':') + 1).trim());
        }
        String encodedString = scanner.next();

        codeTable = codeTable
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new
                ));

        System.out.println(decode(encodedString, codeTable));
    }

    private static class Node {
        int key;
        int value;
        Node leftChild;
        Node rightChild;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private static class Tree {
        private Node root;

        Tree(Node root) {
            this.root = root;
        }

        Node getRoot() {
            return root;
        }
    }
}
