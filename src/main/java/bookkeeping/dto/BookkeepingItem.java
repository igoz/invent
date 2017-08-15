package bookkeeping.dto;

import enums.EquipmentType;

import java.math.BigDecimal;
import java.time.LocalDate;

public class BookkeepingItem {
    private EquipmentType equipmentType;
    private String model;
    private String specifications;
    private Integer inventoryNumber;
    private LocalDate inventoryDate;

    private BigDecimal startingCost;
    private BigDecimal startingAmortization;
    private BigDecimal staringActualCost;

    private BigDecimal costIncrease;
    private BigDecimal costDecrease;
    private BigDecimal amortizationCharge;
    private BigDecimal amortizationWriteOff;

    private BigDecimal endingCost;
    private BigDecimal endingAmortization;
    private BigDecimal endingActualCost;
}
