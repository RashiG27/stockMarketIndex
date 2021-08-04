package com.relevel.stockmarketindex.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 */
@Entity
public class TradingHistory {
    
    @Id
    private long historyId;
}
