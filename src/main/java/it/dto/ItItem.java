package it.dto;

import enums.EquipmentType;
import enums.Nature;
import enums.Status;

import java.time.LocalDate;

public class ItItem {
    private Integer label;
    private Integer parentLabel;
    private String serial;
    private String model;
    private Integer quantity;
    private Status status;
    private String user;
    private String stock;
    private String networkName;
    private String location;
    private String assetTag;
    private Nature nature;
    private EquipmentType equipmentType;
    private LocalDate shippindDate;
    private LocalDate inventoryDate;
    private String supplier;
}
