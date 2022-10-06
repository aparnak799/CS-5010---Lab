public class Parrot extends Bird{
    protected String[] vocabulary;
    protected String favoritePhrase;

    public String[] getVocabulary() {
        return vocabulary;
    }

    public void setVocabulary(String[] vocabulary) {
        this.vocabulary = vocabulary;
    }

    public String getFavoritePhrase() {
        return favoritePhrase;
    }

    public void setFavoritePhrase(String favoritePhrase) {
        this.favoritePhrase = favoritePhrase;
    }
}
