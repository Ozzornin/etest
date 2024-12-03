package com.epam.rd.autocode.assessment.appliances.model;

public class Client extends User {

    private String card;

    public Client(long id, String name, String email, String password, String card) {
        super(id, name, email, password);
        this.card = card;
    }

    public Client() {
        super();
        this.card = "";
    }

    public String getCard() {
        return card;
    }

    @Override
    public String toString() {
        return "Client{" +
                super.toString().replaceFirst("[^\\{]+[\\{]", "").replaceFirst("\\}$", "") +
                ", card='" + card + '\'' +
                '}';
    }
}
