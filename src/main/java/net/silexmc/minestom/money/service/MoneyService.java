package net.silexmc.minestom.money.service;

import net.minestom.server.entity.Player;

import java.math.BigDecimal;
import java.util.UUID;

public interface MoneyService {
    BigDecimal getMoney(UUID uniqueID);

    default BigDecimal getMoney(Player player) {
        return this.getMoney(player.getUuid());
    }

    String getMoney(UUID uniqueID, boolean format);

    default String getMoney(Player player, boolean format) {
        return this.getMoney(player.getUuid(), format);
    }

    BigDecimal getTotalMoney(UUID uniqueID);

    default BigDecimal getTotalMoney(Player player) {
        return this.getTotalMoney(player.getUuid());
    }

    String getTotalMoney(UUID uniqueID, boolean format);

    default String getTotalMoney(Player player, boolean format) {
        return this.getTotalMoney(player.getUuid(), format);
    }

    void setMoney(UUID uniqueID, BigDecimal value);

    default void setMoney(UUID uniqueID, double value) {
        this.setMoney(uniqueID, BigDecimal.valueOf(value));
    }

    default void setMoney(Player player, BigDecimal value) {
        this.setMoney(player.getUuid(), value);
    }

    default void setMoney(Player player, double value) {
        this.setMoney(player, BigDecimal.valueOf(value));
    }

    void giveMoney(UUID uniqueID, BigDecimal value);

    default void giveMoney(UUID uniqueID, double value) {
        this.giveMoney(uniqueID, BigDecimal.valueOf(value));
    }

    default void giveMoney(Player player, BigDecimal value) {
        this.giveMoney(player.getUuid(), value);
    }

    default void giveMoney(Player player, double value) {
        this.giveMoney(player, BigDecimal.valueOf(value));
    }

    void takeMoney(UUID uniqueID, BigDecimal value);

    default void takeMoney(UUID uniqueID, double value) {
        this.takeMoney(uniqueID, BigDecimal.valueOf(value));
    }

    default void takeMoney(Player player, BigDecimal value) {
        this.takeMoney(player.getUuid(), value);
    }

    default void takeMoney(Player player, double value) {
        this.takeMoney(player, BigDecimal.valueOf(value));
    }

    boolean hasMoney(UUID uniqueID, BigDecimal value);

    default boolean hasMoney(UUID uniqueID, double value) {
        return this.hasMoney(uniqueID, BigDecimal.valueOf(value));
    }

    default boolean hasMoney(Player player, BigDecimal value) {
        return this.hasMoney(player.getUuid(), value);
    }

    default boolean hasMoney(Player player, double value) {
        return this.hasMoney(player, BigDecimal.valueOf(value));
    }
}
