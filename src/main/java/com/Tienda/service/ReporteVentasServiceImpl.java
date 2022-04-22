/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tienda.service;

import com.Tienda.commons.JasperReportManager;
import com.Tienda.entity.ReporteVentasDTO;
import com.Tienda.enums.TipoReporteEnum;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;
import javax.sql.DataSource;
import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author kflex25
 */
@Service
public class ReporteVentasServiceImpl implements ReporteVentasServiceAPI {

    @Autowired
    private JasperReportManager reportManager;

    @Autowired
    private DataSource dataSource;

    @Override
    public ReporteVentasDTO obtenerReporteVentas(Map<String, Object> params) throws JRException, IOException, SQLException {
        String fileName = "reporte_de_ventas";
        ReporteVentasDTO dto = new ReporteVentasDTO();
        String extension = params.get("tipo").toString().equalsIgnoreCase(TipoReporteEnum.EXCEL.name()) ? ".xlsx"
                : ".pdf";
        dto.setFileName(fileName + extension);

        ByteArrayOutputStream stream = reportManager.export(fileName, params.get("tipo").toString(), params,
                dataSource.getConnection());

        byte[] bs = stream.toByteArray();
        dto.setStream(new ByteArrayInputStream(bs));
        dto.setLength(bs.length);

        return dto;
    }

}
