/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.Converter;
import org.apache.commons.beanutils.converters.DateConverter;
import org.apache.commons.beanutils.converters.DateTimeConverter;

/**
 *
 * @author sktfk
 */
public class Test {

    public static void main(String[] args) {
        Converter converter = new DateConverter();

        // Cấu hình đối tượng DateConverter
        ((DateConverter) converter).setPatterns(new String[] {"yyyy-MM-dd"});

        // Gán giá trị cho đối tượng DateConverter
        Date value = converter.convert(Date.class, "2022-03-21");

        // In ra giá trị đã chuyển đổi
        System.out.println(value);
        
//        

    }
}
