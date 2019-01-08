package com.springcloud.leyou;

import com.github.tobato.fastdfs.domain.StorePath;
import com.github.tobato.fastdfs.domain.ThumbImageConfig;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.annotation.Async;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 只有经过长时间完成其发展的艰苦工作，
 * 并长期埋头沉浸于其中的任务，方可望有所成就。
 *
 * @author Ms.xiao
 * @data 2018/12/30 -- 21:28
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class FdfsTest {

    @Autowired
    private FastFileStorageClient fastFileStorageClient;
    @Autowired
    private ThumbImageConfig thumbImageConfig;

    @Test
    public void testUpload() throws FileNotFoundException {
        File file = new File("D:\\upload\\1.jpeg");
        StorePath storePath = this.fastFileStorageClient.uploadFile(new FileInputStream(file), file.length(), "jpeg", null);
        System.out.println(storePath.getFullPath());
        System.out.println(storePath.getPath());

    }

    @Test
    public void testUploadAddCreateThumb() throws FileNotFoundException {
        File file = new File("D:\\upload\\1.jpeg");
        StorePath storePath = this.fastFileStorageClient.uploadFile(new FileInputStream(file), file.length(), "jpeg", null);
        System.out.println(storePath.getFullPath());
        System.out.println(storePath.getPath());
        String path = thumbImageConfig.getThumbImagePath(storePath.getPath());
        System.out.println(path);

    }
}
