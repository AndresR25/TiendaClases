/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Tienda.service;

import com.Tienda.entity.ReporteVentasDTO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;

/**
 *
 * @author kflex25
 */
public interface ReporteVentasServiceAPI {
    ReporteVentasDTO obtenerReporteVentas(Map<String,Object>params) throws JRException, IOException, SQLException;
}
