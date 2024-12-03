package com.epam.rd.autocode.assessment.appliances.model;

public class Appliance {
    private long id;
    private String name;
    private Employee employee;
    private Client client;
    private Category category;
    private String model;
    private Manufacturer manufacturer;
    private PowerType powerType;
    private String characteristic;
    private String description;
    private int power;

    public Appliance(long id, String name, Employee employee, Client client, Category category, String model,
            Manufacturer manufacturer, PowerType powerType, String characteristic, String description, int power) {
        this.id = id;
        this.name = name;
        this.employee = employee;
        this.client = client;
        this.category = category;
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerType = powerType;
        this.characteristic = characteristic;
        this.description = description;
        this.power = power;
    }

    public Appliance() {
        this.id = 0;
        this.name = "";
        this.employee = new Employee();
        this.client = new Client();
        this.category = Category.SMALL;
        this.model = "";
        this.manufacturer = new Manufacturer();
        this.powerType = PowerType.AC110;
        this.characteristic = "";
        this.description = "";
        this.power = 0;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Client getClient() {
        return client;
    }

    public Category getCategory() {
        return category;
    }

    public String getModel() {
        return model;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public PowerType getPowerType() {
        return powerType;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public String getDescription() {
        return description;
    }

    public int getPower() {
        return power;
    }

    public long setId(long id) {
        return this.id = id;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public Employee setEmployee(Employee employee) {
        return this.employee = employee;
    }

    public Client setClient(Client client) {
        return this.client = client;
    }

    public Category setCategory(Category category) {
        return this.category = category;
    }

    public String setModel(String model) {
        return this.model = model;
    }

    public Manufacturer setManufacturer(Manufacturer manufacturer) {
        return this.manufacturer = manufacturer;
    }

    public PowerType setPowerType(PowerType powerType) {
        return this.powerType = powerType;
    }

    public String setCharacteristic(String characteristic) {
        return this.characteristic = characteristic;
    }

    public String setDescription(String description) {
        return this.description = description;
    }

    public int setPower(int power) {
        return this.power = power;
    }

    @Override
    public String toString() {
        return "Appliance{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", employee=" + employee +
                ", client=" + client +
                ", category=" + category +
                ", model='" + model + '\'' +
                ", manufacturer=" + manufacturer +
                ", powerType=" + powerType +
                ", characteristic='" + characteristic + '\'' +
                ", description='" + description + '\'' +
                ", power=" + power +
                '}';
    }
}
