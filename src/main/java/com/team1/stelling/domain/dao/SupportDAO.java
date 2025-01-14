package com.team1.stelling.domain.dao;

import com.team1.stelling.domain.dto.PaymentDTO;
import com.team1.stelling.domain.dto.SupportDTO;
import com.team1.stelling.domain.vo.*;
import com.team1.stelling.mapper.SupportMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
@Slf4j
public class SupportDAO {
    private final SupportMapper supportMapper;

    //후원 내역

    public List<SupportVO> getSuppotList(Paging paging, Long supportSponser) {return supportMapper.getSuppotList(paging, supportSponser);}


    public void register(SupportVO supportVO) {supportMapper.insert(supportVO);}

    //검색한 결과의 총 개수(페이징 처리)
    public int getSearchSupportTotal(Paging paging) {return supportMapper.getSearchSupportTotal(paging);}

    //후원한 코인 총 개수
    public SupportDTO getSupportCoinTotal(Long supportSponser){return supportMapper.getSupportCoinTotal(supportSponser);}
    public List<SupportVO> getSupportListWithNovelNumber(Long novelNumber){return supportMapper.getSupportListWithNovelNumber(novelNumber);}

    public PaymentDTO getPaymentSum(Long subNovelNumber){return supportMapper.getPaymentSum(subNovelNumber);}
}
