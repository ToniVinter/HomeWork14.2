package qoutesService;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QoutesService {
    private final List<Qoutes> qoutesAndAuthorList;

    public QoutesService(List<Qoutes> qoutesList) {
        this.qoutesAndAuthorList = new ArrayList<>(qoutesList);
    }

    public List<String> getAllQoutes() {
        List<String> listOfQoutes = new ArrayList<>();
        for (Qoutes qoutes : qoutesAndAuthorList) {
            listOfQoutes.add(qoutes.getQoute());
        }
        return listOfQoutes;
    }

    public List<Qoutes> getQoutesForAuthor(String author) {
        List<Qoutes> qoutesForAuthor = new ArrayList<>();
        for (Qoutes qoutes : qoutesAndAuthorList
        ) {
            if (qoutes.getAuthor().equals(author)) {
                qoutesForAuthor.add(qoutes);
            }
        }
        return qoutesForAuthor;
    }

    public List<String> getAuthors() {
        List<String> authorList = new ArrayList<>();
        for (Qoutes qoutes : qoutesAndAuthorList
        ) {
            authorList.add(qoutes.getAuthor());
        }
        return authorList;
    }

    public void setFavourite(int id) {
        for (Qoutes qoutes : qoutesAndAuthorList) {
            if (qoutes.getId() == id) {
                qoutes.setFavourite(true);
            }
        }
    }

    public List<Qoutes> getFavourites() {
        List<Qoutes> listOfFavourites = new ArrayList<>();
        for (Qoutes qoutes : qoutesAndAuthorList) {
            if (qoutes.isFavourite()) {
                listOfFavourites.add(qoutes);
            }
        }
        return listOfFavourites;
    }

    public Qoutes getQouteById(int id) {
        for (Qoutes qoutes : qoutesAndAuthorList
        ) {
            if (qoutes.getId() == id) {
                return qoutes;
            }
        }
        return null;
    }

    public Qoutes getRandomQoutes() {
        Qoutes qoute;
        Random random = new Random();
        int id = random.nextInt(qoutesAndAuthorList.size());
        return getQouteById(id);
    }

}
