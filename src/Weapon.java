public enum Weapon {
    // Sabit değerleri tutmak için yapıyoruz enum'ları:
    WEAPON("Machine Gun");

    private String value;

    // Enum constructor'ı için başına herhangi bir ifade gelmiyor:
    Weapon(String value) {
        this.value = value;
    }

    // Dışarıdan erişilebilmesi için getter metodu yazıyoruz:
    public String getValue() {
        return value;
    }
}
