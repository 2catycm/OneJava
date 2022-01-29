package cn.edu.sustech.onejava.bean;

import com.intellij.testFramework.TestDataPath;
import com.intellij.testFramework.fixtures.BasePlatformTestCase;

import java.nio.file.Path;
import java.nio.file.Paths;

@TestDataPath("$CONTENT_ROOT/src/test/testData")
public class GradleUTF8Test extends BasePlatformTestCase {
    @Override
    protected String getTestDataPath() {
        return "src/test/testData";
    }
    public void testGetPath() {
        Path testPath = Path.of(getTestDataPath());
        System.out.println("当前路径: " + testPath.toAbsolutePath());
        final var projectRelativePath = Path.of("中文包名", "假想的目标文件.java");
        final var projectRootPath = Paths.get("中文路径编译可靠性测试");
        final var x = testPath.resolve(projectRootPath).resolve(projectRelativePath);
        assert (x.toFile().isFile());
        System.out.println(x);
    }
}