package org.netcracker.controller;

import org.netcracker.dto.TukCncDto;
import org.netcracker.dto.TukCnctDto;
import org.netcracker.model.TukHoInterfacesLogs;
import org.netcracker.model.TukNcOrderList;
import org.netcracker.service.NetCrackerOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class NetCrackerOrdersController {

    @Autowired
    NetCrackerOrdersService netCrackerOrdersService;

    @GetMapping("/interfaces")
    public List<TukHoInterfacesLogs> getInterfaceDetails(@RequestParam String orderNumber, @RequestParam String storeNumber) {
        return netCrackerOrdersService.getInterfaceDetails(orderNumber,storeNumber);
    }

    @GetMapping("/orders/iss")
    public List<TukNcOrderList> getIssOrderDetails(@RequestParam String orderNumber, @RequestParam String storeNumber) {
      return netCrackerOrdersService.getIssOrderDetails(orderNumber);
    }

    @GetMapping("/orders/cnc")
    public List<TukCncDto> getCncOrderDetails(@RequestParam String orderNumber, @RequestParam String storeNumber) {
      return netCrackerOrdersService.getCncOrderDetails(orderNumber, storeNumber);
    }

    @GetMapping("/orders/cnct")
    public List<TukCnctDto> getCnctOrderDetails(@RequestParam String orderNumber, @RequestParam String storeNumber) {
      return netCrackerOrdersService.getCnctOrderDetails(orderNumber, storeNumber);
    }
}
