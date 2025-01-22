package org.netcracker.service;

import org.netcracker.constants.TukCncOrderStatus;
import org.netcracker.constants.TukCnctOrderStatus;
import org.netcracker.dto.TukCncDto;
import org.netcracker.dto.TukCncHistoryDto;
import org.netcracker.dto.TukCnctDto;
import org.netcracker.dto.TukCnctHistoryDto;
import org.netcracker.model.*;
import org.netcracker.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class NetCrackerOrdersService {
    @Autowired
    NetCrackerOrdersRepository netCrackerOrdersRepository;

    @Autowired
    TukNcOrderListRepository tukNcOrderListRepository;

    @Autowired
    TukCncOrdersRepository tukCncOrdersRepository;

    @Autowired
    TukCnctOrderRepository tukCnctOrderRepository;

    @Autowired
    TukCncHistoryRepository tukCncHistoryRepository;

    @Autowired
    TukCnctHistoryRepository tukCnctHistoryRepository;


//    public List<TukHoInterfacesLogs> getAllOrders(){
//        return netCrackerOrdersRepository.findAll();
//    }

    public List<TukHoInterfacesLogs> getInterfaceDetails(String orderNumber, String storeNumber) {
        return netCrackerOrdersRepository.findAllByOrderNumberAndStoreNumber(orderNumber, Integer.parseInt(storeNumber));
    }

    public List<TukNcOrderList> getIssOrderDetails(String orderNumber) {
        return tukNcOrderListRepository.findAllByTukNcOrderListPK_OrderNumber(orderNumber);
    }

    public List<TukCncDto> getCncOrderDetails(String orderNumber, String storeNumber) {
        List<TukCncOrders> tukCncOrders = tukCncOrdersRepository.findAllByAndTukCncOrdersPK_OrderNumber(orderNumber);
        List<TukCncDto> tukCncDtos = new ArrayList<>();
        tukCncOrders.stream().filter(tukCncOrder -> tukCncOrder.getStoreId() == Integer.parseInt(storeNumber))
                .map(tukCncOrder -> {
                    TukCncDto tukCncDto = new TukCncDto();
                    tukCncDto.setOrderNumber(tukCncOrder.getTukCncOrdersPK().getOrderNumber());
                    tukCncDto.setCurrentStatus(parseStatus(tukCncOrder.getCurrentStatus()).toString());
                    tukCncDto.setStoreId(tukCncOrder.getStoreId());
                    List<TukCncHistory> tukCncHistories = tukCncHistoryRepository.findAllByTukCncHistoryPK_CncReference(tukCncOrder.getTukCncOrdersPK().getCncReference());
                    List<TukCncHistoryDto> tukCncHistoryDtoList = new ArrayList<>();
                    tukCncHistories.stream().map(tukCncHistory -> {
                        TukCncHistoryDto tukCncHistoryDto = new TukCncHistoryDto();
                        tukCncHistoryDto.setStatus(parseStatus(tukCncHistory.getTukCncHistoryPK().getStatus()).toString());
                        tukCncHistoryDto.setActionDateTime(formatDate(tukCncHistory.getActionDateTime()));
                        tukCncHistoryDtoList.add(tukCncHistoryDto);
                        return tukCncHistoryDto;
                    }).collect(Collectors.toList());
                    tukCncDto.setTukCncHistoryDtoList(tukCncHistoryDtoList);
                    tukCncDtos.add(tukCncDto);
                    return tukCncDto;
                }).collect(Collectors.toList());
        return tukCncDtos;
    }

    public List<TukCnctDto> getCnctOrderDetails(String orderNumber, String storeNumber) {
        List<TukCnctOrder> tukCnctOrders = tukCnctOrderRepository.findAllByTukCnctOrderPK_OrderNumber(orderNumber);
        List<TukCnctDto> tukCnctDtos = new ArrayList<>();
        tukCnctOrders.stream().filter(tukCnctOrder -> tukCnctOrder.getRtlLocId() == Integer.parseInt(storeNumber))
                .map(tukCnctOrder -> {
                    TukCnctDto tukCnctDto = new TukCnctDto();
                    tukCnctDto.setOrderNumber(tukCnctOrder.getTukCnctOrderPK().getOrderNumber());
                    tukCnctDto.setCurrentStatus(parseCNCTStatus(tukCnctOrder.getCurrentStatus()).toString());
                    tukCnctDto.setStoreId(tukCnctOrder.getRtlLocId());
                    List<TukCnctHistory> tukCnctHistories = tukCnctHistoryRepository.findAllByTukCnctHistoryPK_CnctReference(tukCnctOrder.getTukCnctOrderPK().getCnctReference());
                    List<TukCnctHistoryDto> tukCnctHistoryDtoList = new ArrayList<>();
                    tukCnctHistories.stream().map(tukCncHistory -> {
                        TukCnctHistoryDto tukCnctHistoryDto = new TukCnctHistoryDto();
                        tukCnctHistoryDto.setStatus(parseCNCTStatus(tukCncHistory.getTukCnctHistoryPK().getStatus()).toString());
                        tukCnctHistoryDto.setActionDateTime(formatDate(tukCncHistory.getActionDateTime()));
                        tukCnctHistoryDtoList.add(tukCnctHistoryDto);
                        return tukCnctHistoryDto;
                    }).collect(Collectors.toList());
                    tukCnctDto.setTukCnctHistoryDtoList(tukCnctHistoryDtoList);
                    tukCnctDtos.add(tukCnctDto);
                    return tukCnctDto;
                }).collect(Collectors.toList());
        return tukCnctDtos;

    }

    public TukCncOrderStatus parseStatus(String status) {
        switch (status) {
            case "0":
                return TukCncOrderStatus.NOTIFICATION_RECEIVED;
            case "1":
                return TukCncOrderStatus.AWAITING_COLLECTION;
            case "2":
                return TukCncOrderStatus.COLLECTED;
            case "3":
                return TukCncOrderStatus.RETURNED;
            case "4":
                return TukCncOrderStatus.CLOSED;
            case "5":
                return TukCncOrderStatus.CANCELLED;

            default:
                return TukCncOrderStatus.UNKNOWN;
        }
    }

    public TukCnctOrderStatus parseCNCTStatus(String status) {
        switch (status) {
            case "0":
                return TukCnctOrderStatus.LOCK_SOLD;
            case "1":
                return TukCnctOrderStatus.ORDER_PICK_RECEIVED;
            case "2":
                return TukCnctOrderStatus.ORDER_AWAITING_PICKING;
            case "3":
                return TukCnctOrderStatus.ORDER_AWAITING_UNPICKING;
            case "4":
                return TukCnctOrderStatus.ORDER_AWAITING_COLLECTION;
            case "5":
                return TukCnctOrderStatus.ORDER_COLLECTED;
            case "6":
                return TukCnctOrderStatus.ORDER_CANCELLED_AWAITING_UNPICKING;
            case "7":
                return TukCnctOrderStatus.ORDER_CANCELLED_NOT_PICKED_CVOS;
            case "8":
                return TukCnctOrderStatus.ORDER_CANCELLED_NOT_PICKED_IBM;
            case "9":
                return TukCnctOrderStatus.ORDER_RETURNED_NOT_COLLECTED;
            case "10":
                return TukCnctOrderStatus.LOCK_FAILED;
            case "11":
                return TukCnctOrderStatus.PICK_FAILED_USER_ACTIONED;
            case "12":
                return TukCnctOrderStatus.COLLECTION_EXTENDED;
            case "13":
                return TukCnctOrderStatus.ORDER_COLLECTED_CUSTOMER_NOT_PRESENT;
            default:
                return TukCnctOrderStatus.UNKNOWN; // In case the status code does not match any of the predefined codes
        }
    }

    public String formatDate(LocalDateTime date) {
        DateTimeFormatter formatterLocalDateTime =
                DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
        return formatterLocalDateTime.format(date);
    }
}

