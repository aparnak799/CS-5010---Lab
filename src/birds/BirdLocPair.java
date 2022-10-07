package birds;

public class BirdLocPair {
        private final Bird bird;
        private final String location;

        public BirdLocPair(Bird aBird, String aLocation)
        {
            this.bird = aBird;
            this.location = aLocation;
        }

        public Bird getBird() {
            return bird;
        }

        public String getLocation() {
            return location;
        }
}
