package com.e203.accountBook.domain.alarm.repository;

import com.e203.accountBook.domain.alarm.Alarm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaAlarmRepository extends JpaRepository<Alarm, Long> {
}
