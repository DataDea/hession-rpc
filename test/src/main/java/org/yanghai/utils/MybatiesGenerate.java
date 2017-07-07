package org.yanghai.utils;

import org.mybatis.generator.api.ShellRunner;

import java.net.URL;

/**
 * Created by yh on 17-7-5.
 */
public class MybatiesGenerate {
    public void generate() throws Exception {
        URL urlPath = this.getClass().getClassLoader().getResource("generatorConfig.xml");
        String path = urlPath.toString();
        path = java.net.URLDecoder.decode(path, "UTF-8");
        String filePrefix = "file:";
        path = path.substring(filePrefix.length());
        String[] args = {"-configfile", path, "-overwrite"};
        ShellRunner.main(args);
    }

    public static void main(String[] args) throws Exception {
        MybatiesGenerate mybatiesGenerate = new MybatiesGenerate();
        mybatiesGenerate.generate();
    }

}
