import java.util.*;

class Artist{
    private final String from;

    public Artist(String from){
        this.from = from;
    }

    public boolean isFrom(String from_) {
        return this.from.equals(from_);
    }

    public String getFrom() {
        return from;
    }
}

public class Art {
    public static void main(String[] args) {
        ArrayList<Artist> lista = new ArrayList<>();
        lista.add(new Artist("London"));
        lista.add(new Artist("London"));
        lista.add(new Artist("London"));
        lista.add(new Artist("Warsaw"));
        lista.add(new Artist("London"));

//        long c = lista.stream().filter(e -> e.isFrom("London")).count();
        System.out.println(
                lista.stream().filter(
                        artist -> {
                                System.out.println(artist.getFrom());
                                return artist.isFrom("London");
                        }
                ).count()
        );
    }
}
