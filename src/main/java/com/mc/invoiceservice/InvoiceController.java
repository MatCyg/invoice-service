package com.mc.invoiceservice;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/invoices")
record InvoiceController() {

    @GetMapping("/{id}")
    Invoice getInvoice(String id) {
        return null;
    }

    @PostMapping
    Invoice getInvoice(Invoice invoice) {
        return null;
    }

}
