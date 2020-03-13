package qoutesService;

import java.util.Objects;

public class Qoutes {
    private final String author;
    private final String qoute;
    private final int id;
    private boolean favourite;

    public Qoutes(int id, String author, String qoute) {
        this.id = id;
        this.author = author;
        this.qoute = qoute;
    }
    public void setFavourite(boolean favourite){
        this.favourite = favourite;
    }

    public int getId() {
        return id;
    }

    public boolean isFavourite() {
        return favourite;
    }

    public String getAuthor() {
        return author;
    }

    public String getQoute() {
        return qoute;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Qoutes qoutes = (Qoutes) o;
        return Objects.equals(author, qoutes.author) &&
                Objects.equals(qoute, qoutes.qoute);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, qoute);
    }

    @Override
    public String toString() {
        return "Qoutes{" +
                "author='" + author + '\'' +
                ", qoute='" + qoute + '\'' +
                '}';
    }
}
