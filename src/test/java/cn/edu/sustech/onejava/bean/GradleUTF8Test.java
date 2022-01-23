package cn.edu.sustech.onejava.bean;

import com.intellij.openapi.externalSystem.model.ProjectKeys;
import com.intellij.openapi.externalSystem.model.project.ContentRootData;
import com.intellij.testFramework.TestDataPath;
import com.intellij.testFramework.UsefulTestCase;
import com.intellij.testFramework.fixtures.BasePlatformTestCase;
import junit.framework.TestCase;

import java.nio.file.Path;
import java.nio.file.Paths;


public class GradleUTF8Test extends BasePlatformTestCase {
    @Override
    protected String getTestDataPath() {
        //TODO 现在这个路径缺Content root这个变量，和kotlin那个test不太一样。
        return "src/test/testData";
    }
    public void testGetPath() {
        Path cwd = Path.of("");
        System.out.println("current test path is: "+cwd.toAbsolutePath());
        final var projectRelativePath = Path.of("中文包名", "假想的目标文件.java");
        final var projectRootPath = Paths.get("中文路径编译可靠性测试");
        final var x = projectRootPath.resolve(projectRelativePath);
        assert(x.toFile().isFile());
        System.out.println(x);
    }
}