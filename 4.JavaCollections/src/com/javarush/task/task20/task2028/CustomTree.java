package com.javarush.task.task20.task2028;

import java.io.Serializable;
import java.util.*;

/**
 Построй дерево(5)
 Добавлять в дерево элементы мы можем, теперь займись удалением:

 Необходимо реализовать метод remove(Object o), который будет удалять элемент дерева имя
 которого было полученного в качестве параметра.

 Если переданный объект не является строкой, метод должен бросить UnsupportedOperationException.

 Если в дереве присутствует несколько элементов с переданным именем - можешь
 удалить только первый найденный.

 Не забывай сверять поведение своего дерева с картинкой:


 Что будет если удалить из дерева элементы "3", "4", "5" и "6", а затем попытаемся
 добавить новый елемент?

 В таком случае элементы "1" и "2" должны восстановить возможность иметь потомков
 (возможно придется внести изменения в метод add()).

 Требования:
 1. После удаления последнего добавленного элемента из дерева с помощью метода remove,
 метод size должен возвращать N-1.
 2. После удаления второго элемента добавленного в дерево, метод size должен
 возвращать N/2 + 1 (для случаев где N > 2 и является степенью двойки), N - размер дерева до удаления.
 3. Если переданный объект не является строкой, метод remove() должен бросить
 UnsupportedOperationException.
 4. Если ни один элемент не способен иметь потомков, необходимо восстановить такую возможность.

 */

public class CustomTree extends AbstractList<String> implements Cloneable, Serializable {
    Entry<String> root;

    public CustomTree() {
        this.root = new Entry<String>("root");
    }

    @Override
    public String get(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String set(int index, String element) {
        throw new UnsupportedOperationException();
    }

    public String getParent(String s) {
        if (s == null) return null;
        Queue<Entry<String>> queue = new LinkedList<Entry<String>>();
        queue.offer(root);
        Entry<String> currentEntry;
        while (!queue.isEmpty()) {
            currentEntry = queue.poll();
            if (currentEntry.elementName.equals(s)) {
                return currentEntry.parent.elementName;
            }
            if (!currentEntry.availableToAddLeftChildren) queue.offer(currentEntry.leftChild);

            if (!currentEntry.availableToAddRightChildren) queue.offer(currentEntry.rightChild);

        }
        return null;
    }

    @Override
    public int size() {
        int result = -1;
        Queue<Entry<String>> queue = new LinkedList<Entry<String>>();
        queue.offer(root);
        Entry<String> currentEntry;
        while (!queue.isEmpty()) {
            currentEntry = queue.poll();
            result++;
            if (!currentEntry.availableToAddRightChildren) queue.offer(currentEntry.rightChild);
            if (!currentEntry.availableToAddLeftChildren) queue.offer(currentEntry.leftChild);
        }
        return result;
    }

    @Override
    public boolean add(String s) {
        if (s == null) return false;
        Queue<Entry<String>> queue = new LinkedList<Entry<String>>();
        queue.offer(root);
        Entry<String> currentEntry;
        while (!queue.isEmpty()) {
            currentEntry = queue.poll();
            if (currentEntry.isAvailableToAddChildren()) {
                if (currentEntry.availableToAddLeftChildren) {
                    currentEntry.leftChild = new Entry<String>(s);
                    currentEntry.leftChild.parent = currentEntry;
                    currentEntry.checkChildren();
                    return true;
                } else if (currentEntry.availableToAddRightChildren) {
                    currentEntry.rightChild = new Entry<String>(s);
                    currentEntry.rightChild.parent = currentEntry;
                    currentEntry.checkChildren();
                    return true;
                }
            } else {
                queue.offer(currentEntry.leftChild);
                queue.offer(currentEntry.rightChild);
            }
        }
        return false;

    }

    @Override
    public void add(int index, String element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String remove(int index) {
        throw new UnsupportedOperationException();
    }

    public boolean remove(Object o) {
        if (o == null) throw new UnsupportedOperationException();
        String elem;
        try {
            elem = (String) o;
        } catch (Exception e) {
            throw new UnsupportedOperationException();
        }

        Queue<Entry<String>> queue = new LinkedList<Entry<String>>();
        queue.offer(root);
        Entry<String> currentEntry;
        while (!queue.isEmpty()) {
            currentEntry = queue.poll();
            if (!currentEntry.availableToAddLeftChildren) {
                if (currentEntry.leftChild.elementName.equals(elem)) {
                    currentEntry.leftChild = null;
                    currentEntry.checkChildren();
                    return true;
                } else queue.offer(currentEntry.leftChild);
            }
            if (!currentEntry.availableToAddRightChildren) {
                if (currentEntry.rightChild.elementName.equals(elem)) {
                    currentEntry.rightChild = null;
                    currentEntry.checkChildren();
                    return true;
                } else queue.offer(currentEntry.rightChild);
            }
        }
        return false;

    }

    @Override
    public List<String> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c) {
        throw new UnsupportedOperationException();
    }

    static class Entry<T> implements Serializable {
        String elementName;
        int lineNumber;
        boolean availableToAddLeftChildren, availableToAddRightChildren;
        Entry<T> parent, leftChild, rightChild;

        public Entry(String elementName) {
            this.elementName = elementName;
            availableToAddLeftChildren = true;
            availableToAddRightChildren = true;
        }

        public void checkChildren() {
            if (leftChild != null) availableToAddLeftChildren = false;
            else availableToAddLeftChildren = true;
            if (rightChild != null) availableToAddRightChildren = false;
            else availableToAddRightChildren = true;
        }

        public boolean isAvailableToAddChildren() {
            return availableToAddLeftChildren || availableToAddRightChildren;
        }
    }
}