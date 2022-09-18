package com.shopee.tinytools.controller;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.shopee.tinytools.impl.TitleServiceImpl;
import com.shopee.tinytools.model.Title;
import com.shopee.tinytools.util.Timedemandutil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.TitleService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Slf4j
@Controller
public class TitleController {

    @Resource
    private TitleService titleService;

    @RequestMapping("/exportExcel")
    public void exportExcel(HttpServletResponse response) {
        List<String> fullDayList = new ArrayList<>();
        Timedemandutil demandtime = new Timedemandutil();
        fullDayList = demandtime.getMonthFullDay(2022,8);
        Iterator<String> exactdate = fullDayList.listIterator();
        String filedate = exactdate.next();
            if (exactdate.hasNext()) {
                try (OutputStream out = response.getOutputStream()) {
                    response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
                    response.setCharacterEncoding("utf-8");
                    String fileName = URLEncoder.encode(filedate,"UTF-8").replaceAll("\\+", "%20");
                    response.setHeader("Content-disposition","attachment;filename*=utf-8''"+ fileName + ".xlsx");
                    try (ExcelWriter excelWriter = EasyExcelFactory.write(out).build()) {
                        WriteSheet firstSheet = EasyExcelFactory.writerSheet(0, fileName).head(Title.class).build();
                        excelWriter.write(titleService.getAllData(), firstSheet);
                    }
                    out.flush();
                } catch (Exception e) {
                    log.error(e.getMessage());
                }
            }
    }
}
