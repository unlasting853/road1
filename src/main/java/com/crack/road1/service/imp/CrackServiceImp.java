package com.crack.road1.service.imp;

import com.crack.road1.classz.CrackReport;
import com.crack.road1.mapper.CrackMapper;
import com.crack.road1.service.CrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CrackServiceImp implements CrackService {
    @Autowired
    CrackMapper crackMapper;

    @Override
    public void CRACK_REPORT_LIST(CrackReport crackReport) {
        crackMapper.crackReportList(crackReport);
    }
}
