import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileFilter;

public class FileFilterTest {
    private final File root = new File("src/main/java");

    @Test
    public void list_files_withoutFilters() {
        File[] files = root.listFiles();
        for (File file : files) {
            System.out.println(file.getName());

        }
        Assert.assertEquals(4, files.length);
    }

    @Test
    public void list_files_withFilters() {
        File[] directories = root.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory();
            }
        });
        if (directories != null)
            for (File file : directories) {
                System.out.println(file.getName());

            }
        Assert.assertEquals(1, directories.length);
    }


    //lambda
    @Test
    public void list_files_withExpressionFilters() {
        File[] directories = root.listFiles(pathname -> pathname.isDirectory());
        if (directories != null)
            for (File file : directories) {
                System.out.println(file.getName());

            }
        Assert.assertEquals(1, directories.length);
    }

    @Test
    public void list_files_withFileNameFilters() {
        File[] javaSourceFiles = root.listFiles((dir, name) -> name.endsWith(".java"));
        if (javaSourceFiles != null)
            Assert.assertEquals(3, javaSourceFiles.length);
    }
}
