package com.devsuperior.dsmeta.dto;

public class SaleSummaryDTO {

    private String name;
    private Double totalSale;

    public SaleSummaryDTO(String name, Double totalSale) {
        this.name = name;
        this.totalSale = totalSale;
    }

    public String getName() {
        return name;
    }

    public Double getTotalSale() {
        return totalSale;
    }
}
