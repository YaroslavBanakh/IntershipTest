package person;

import person.consciousness.Knowledge;

public class Student {
    private String name;
    private int level;

    public Student(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public void setKnowledge(Knowledge knowledge) {
        //TODO: Implementation is needed
    }


    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", level=" + level +
                '}';
    }
}
