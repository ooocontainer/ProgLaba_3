package enums;

public enum enumWorld {
    HOLM("Холм"),
    LILAC_BUSHES("Кусты сирени"),
    PORCH("Крыльцу"),
    RAILINGS("Перила"),
    SUNFLOWER("Подсолнечник"),
    BARREL("Бочка"),
    HAMMOCK("Гамак"),
    PUDDLE("Лужа"),
    SKY("Небо");

    private final String description;

    enumWorld(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}