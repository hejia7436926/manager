package com.leyou.manager.upload.config;

import com.github.tobato.fastdfs.FdfsClientConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.context.annotation.Import;
import org.springframework.jmx.support.RegistrationPolicy;


/**
 * @version : 1.0
 * @ClassName: FastClientImport
 * @Description :
 * @auther: hejia
 * @date: 2019/4/16
 */
@Configuration
@Import(FdfsClientConfig.class)
//解决jmx重复注册的问题
@EnableMBeanExport(registration = RegistrationPolicy.IGNORE_EXISTING)
public class FastClientImport {
}
