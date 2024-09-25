package toko;

    public class CD extends product{

        private String artist;
        private int muSong;
        private String label;

        public CD() {
            super();//constructor dari super class
            artist = "lady GaGa";
            muSong = 10;
            label = "Sony Music";

            
        }
        public CD(int number, String name, int quantity, double price, String artist, String label, int muSong) {
            super(number, quantity, name, price);
            this.artist = artist;
            this.muSong = muSong;
            this.label = label;
        }
        public String getArtist() {
            return this.artist;
        }

        public void setArtist(String artist) {
            this.artist = artist;
        }

        public int getMuSong() {
            return this.muSong;
        }

        public void setMuSong(int muSong) {
            this.muSong = muSong;
        }

        public String getLabel() {
            return this.label;
        }

        public void setLabel(String label) {
            this.label = label;
        }
        public void print() {
            super.print();
            System.out.println("Artist : " + artist);
            System.out.println("Musik : " + muSong);
            System.out.println("label : " + label);
        }
    }



    



