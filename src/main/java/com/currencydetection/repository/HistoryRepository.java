package com.currencydetection.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.currencydetection.model.DetectionHistory;

public interface HistoryRepository extends JpaRepository<DetectionHistory, Long> {

}