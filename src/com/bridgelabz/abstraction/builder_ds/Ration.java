package com.bridgelabz.abstraction.builder_ds;
/**
 * model class of ration which follows builder design pattern
 *
 * @author Durgasankar Mishra
 * @version 1.8
 * @created 2020-04-11
 */
public class Ration {

    private final String bread;
    private final String spices;
    private final String nonVeg;
    private final String snacks;

    public Ration( Builder builder) {
        this.bread = builder.bread;
        this.spices = builder.spices;
        this.nonVeg = builder.nonVeg;
        this.snacks = builder.snacks;
    }

    public String getBread() {
        return bread;
    }

    public String getSpices() {
        return spices;
    }

    public String getNonVeg() {
        return nonVeg;
    }

    public String getSnacks() {
        return snacks;
    }

    public static class Builder {

        private String bread;
        private String spices;
        private String nonVeg;
        private String snacks;

        public Ration createRation(){
            return new Ration( this );
        }

        public Builder( ) {

        }

        public Builder bread( String bread ) {
            this.bread = bread;
            return this;
        }

        public Builder spices( String spices ) {
            this.spices = spices;
            return this;
        }

        public Builder nonVeg( String nonVeg ) {
            this.nonVeg = nonVeg;
            return this;
        }

        public Builder snacks( String snacks ) {
            this.snacks = snacks;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Ration{" +
                "bread='" + bread + '\'' +
                ", spices='" + spices + '\'' +
                ", nonVeg='" + nonVeg + '\'' +
                ", snacks='" + snacks + '\'' +
                '}';
    }
}
